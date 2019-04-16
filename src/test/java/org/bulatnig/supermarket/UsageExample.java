package org.bulatnig.supermarket;

import org.bulatnig.supermarket.product.EnumerableProduct;
import org.bulatnig.supermarket.product.Product;
import org.bulatnig.supermarket.product.ProductPrice;
import org.bulatnig.supermarket.product.WeighedProduct;
import org.junit.Before;
import org.junit.Test;

public class UsageExample {

    @Before
    public void setUp() {
        Product beans = new EnumerableProduct();
        beans.setId(1L);
        beans.setName("Beans");
        ProductPrice beansPrice = new ProductPrice();
        beansPrice.setProductId(beans.getId());
        beansPrice.setPriceInPence(50);
        Product coke = new EnumerableProduct();
        coke.setId(2L);
        coke.setName("Coke");
        Product oranges = new WeighedProduct();
        oranges.setId(3L);
        oranges.setName("Oranges");

    }

    @Test
    public void test() {

    }

}
