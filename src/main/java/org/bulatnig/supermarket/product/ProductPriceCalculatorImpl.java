package org.bulatnig.supermarket.product;

import org.bulatnig.supermarket.SupermarketException;

import java.util.List;

public class ProductPriceCalculatorImpl implements ProductPriceCalculator {

    private final List<ProductPrice> productPrices;

    public ProductPriceCalculatorImpl(List<ProductPrice> productPrices) {
        this.productPrices = productPrices;
    }

    @Override
    public int calcEnumerableProductPrice(Product product) {
        if (Product.Type.ENUMERABLE != product.getType()) {
            throw new SupermarketException("Enumerable product price calculation method used for " + product.getId());
        }
        ProductPrice productPrice = findProductPrice(product);
        return productPrice.getPrice();
    }

    private ProductPrice findProductPrice(Product product) {
        return productPrices.stream().filter(pp -> pp.getProductId().equals(product.getId())).findAny().orElseThrow(ProductPriceNotFoundException::new);
    }

    @Override
    public int calcWeighedProductPrice(Product product, int weightInGrams) {
        if (Product.Type.WEIGHED != product.getType()) {
            throw new SupermarketException("Weighed product price calculation method used for " + product.getId());
        }
        ProductPrice productPrice = findProductPrice(product);
        return productPrice.getPrice() * weightInGrams / 1000;
    }
}
