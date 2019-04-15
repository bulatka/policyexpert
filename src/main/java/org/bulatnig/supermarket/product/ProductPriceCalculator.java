package org.bulatnig.supermarket.product;

public interface ProductPriceCalculator {

    int calcEnumerableProductPrice(Product product) throws ProductPriceNotFoundException;

    int calcWeighedProductPrice(Product product, int weightInGrams) throws ProductPriceNotFoundException;

}
