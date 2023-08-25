package com.learning.springboot.Fasthire2.Repository;

import com.learning.springboot.Fasthire2.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{

}
