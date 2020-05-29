package com.codegym.proxy;

import com.codegym.proxy.business.IPostManager;
import com.codegym.proxy.business.ProxyPostManager;

public class BlogApp {
    public static void main(String[] args) {


        IPostManager postManager = new ProxyPostManager("user", "123");
        postManager.read(1);
        postManager.create(new Post());

        IPostManager adminPostManager = new ProxyPostManager("admin", "admin");
        adminPostManager.read(1);
        adminPostManager.create(new Post());

    }
}
