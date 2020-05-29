package com.codegym.proxy.business;

import com.codegym.proxy.Post;

public class ProxyPostManager implements  IPostManager {

    private String username;
    private String password;

    private IPostManager realPostManager = new PostManager();

    public ProxyPostManager(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private boolean isAdmin() {
        if (username.equals("admin") && password.equals("admin")) {
            return true;
        }

        return false;
    }

    @Override
    public void create(Post post) {

        if (this.isAdmin()) {
            this.realPostManager.create(post);
        } else {
            throw new RuntimeException("Không có quyền thêm bài viết");
        }

    }

    @Override
    public void read(int id) {
        this.realPostManager.read(id);
    }

    @Override
    public void update(Post post) {
        if (this.isAdmin()) {
            this.realPostManager.update(post);
        } else {
            throw new RuntimeException("Không có quyền sửa bài viết");
        }
    }

    @Override
    public void delete(int id) {
        if (this.isAdmin()) {
            this.realPostManager.delete(id);
        } else {
            throw new RuntimeException("Không có quyền xoá bài viết");
        }
    }
}
