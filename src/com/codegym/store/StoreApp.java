package com.codegym.store;

public class StoreApp {

    public static void main(String[] args) {

        IProductFactory productFactory = ProductFactory.getInstance();

        Product candy = productFactory.createProduct(ProductType.CANDY);
        Product biscuit = productFactory.createProduct(ProductType.BISCUIT);

    }
}
