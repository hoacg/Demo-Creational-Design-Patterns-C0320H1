package com.codegym.singleton;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    List<Book> books = new ArrayList<>();

    void saveBooks() {
        FileSingleton fileSingleton = FileSingleton.getInstance();

        fileSingleton.write(books.toString());
    }


}
