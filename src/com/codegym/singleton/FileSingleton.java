package com.codegym.singleton;

public class FileSingleton {

    private static volatile FileSingleton instance = new FileSingleton();

    private FileSingleton() {}

    public static FileSingleton getInstance() {

        if (instance == null) {
            instance = new FileSingleton();
        }

        return instance;

    }


    public String read() {
        return "";
    }
    public boolean write(String content) {
        return true;
    }

}
