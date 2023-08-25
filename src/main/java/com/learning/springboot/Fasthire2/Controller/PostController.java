package com.learning.springboot.Fasthire2.Controller;

import com.learning.springboot.Fasthire2.Model.Post;
import com.learning.springboot.Fasthire2.Repository.PostRepository;
import com.learning.springboot.Fasthire2.Repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @RequestMapping(value="/")
    public String homePage(){
        return "Home" ;
    }

    @GetMapping("/allPosts")

    public List<Post> getAllPosts()
    {
        return repo.findAll();
    }
    @GetMapping("/posts/{text}")

    public List<Post> search(@PathVariable String text)
    {
        return srepo.findByText(text);
    }
    @PostMapping("/post")

    public Post addPost(@RequestBody Post post)
    {
        return repo.save(post);
    }



}
