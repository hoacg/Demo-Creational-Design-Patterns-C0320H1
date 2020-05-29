package com.codegym.adapter;

import com.codegym.store.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter implements IProductImporter {

    private Provider provider;

    public ProductAdapter(Provider provider) {
        this.provider = provider;
    }

    String covertExcelToTextFile() {
        String excelFile = provider.exportFile();
        // convert here
        return "products.txt";
    }

    @Override
    public List<Product> importFile() {
        List<Product> products = new ArrayList<>();
        String textFile = this.covertExcelToTextFile();
        // read text file ---> push products to list
        return products;
    }
}
