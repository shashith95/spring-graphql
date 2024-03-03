package com.learn.springgraphql.repository;

import com.learn.springgraphql.model.Author;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface AuthorRepository extends ListCrudRepository<Author, Long> {
}
