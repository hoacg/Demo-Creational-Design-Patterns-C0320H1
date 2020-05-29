package com.codegym.adapter;

import com.codegym.store.Product;

import java.util.List;

public interface IProductImporter {
    List<Product> importFile();
}
