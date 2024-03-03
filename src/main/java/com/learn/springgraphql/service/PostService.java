package com.learn.springgraphql.service;

import com.learn.springgraphql.model.Author;
import com.learn.springgraphql.model.Post;
import com.learn.springgraphql.repository.AuthorRepository;
import com.learn.springgraphql.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final AuthorRepository authorRepository;

    public List<Post> getRecentPosts(int count, int offset) {
        return postRepository.findAll();
    }

    public Author getAuthor(Author author) {
        return authorRepository.findById(author.getId()).orElseThrow();
    }
}
