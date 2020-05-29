package com.codegym.adapter;

import com.codegym.store.Product;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        Provider provider = new Provider(); // library

        IProductImporter productAdapter = new ProductAdapter(provider);

        List<Product> products = productAdapter.importFile();
    }

}
