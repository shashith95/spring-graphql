package com.learn.springgraphql.repository;

import com.learn.springgraphql.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post, Long> {

}
