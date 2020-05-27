package com.codegym.singleton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BookManager bookManager = new BookManager();
        LibrarianManager librarianManager = new LibrarianManager();

        bookManager.saveBooks();
        librarianManager.save();


        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        scanner1.nextLine();
        scanner2.nextLine();

    }
}
