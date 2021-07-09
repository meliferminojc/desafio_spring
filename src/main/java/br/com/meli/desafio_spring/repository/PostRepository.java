package br.com.meli.desafio_spring.repository;

import br.com.meli.desafio_spring.entity.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository {
    List<Post> postsList = new ArrayList<>();

    public Post save(Post post) {
        postsList.add(post);

        return post;
    }

    public List<Post> getPostsList() {
        return postsList;
    }
}
