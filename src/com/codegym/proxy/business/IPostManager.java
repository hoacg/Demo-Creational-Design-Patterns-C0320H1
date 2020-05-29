package com.codegym.proxy.business;

import com.codegym.proxy.Post;

public interface IPostManager {

    void create(Post post);
    void read(int id);
    void update(Post post);
    void delete(int id);

}
