package com.codegym.singleton;

import java.util.ArrayList;
import java.util.List;

public class LibrarianManager {

    List<Librarian> librarians = new ArrayList<>();

    void save() {
        FileSingleton fileSingleton = FileSingleton.instance;

        fileSingleton.write(librarians.toString());
    }

}
