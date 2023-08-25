package com.learning.springboot.Fasthire2.Repository;

import com.learning.springboot.Fasthire2.Model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
