package com.learn.springgraphql.controller;

import com.learn.springgraphql.model.Author;
import com.learn.springgraphql.model.Post;
import com.learn.springgraphql.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @QueryMapping
    public List<Post> recentPosts(@Argument int count, @Argument int offset) {
        return postService.getRecentPosts(count, offset);
    }

    @SchemaMapping(typeName="Post", field="author")
    public Author getAuthor(Post post) {
        return postService.getAuthor(post.getAuthor());
    }

    @MutationMapping
    public Post createPost(@Argument String title, @Argument String text,
                           @Argument String category, @Argument String authorId) {

        return new Post();
    }

}
