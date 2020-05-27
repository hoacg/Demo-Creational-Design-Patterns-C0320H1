package com.codegym.store;

public class ProductFactory implements IProductFactory {

    private static ProductFactory instance;

    private ProductFactory() {

    }

    public static ProductFactory getInstance() {
        if (instance == null) {
            instance = new ProductFactory();
        }

         return instance;
    }

    @Override
    public Product createProduct(ProductType type) {

        Product product;

        switch (type) {
            case CANDY:
                product = new Candy();
            case BISCUIT:
                product = new Biscuit();
            default:
                product = null;
        }

        return product;
    }
}
