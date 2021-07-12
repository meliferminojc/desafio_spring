package br.com.meli.desafio_spring.repository;

import br.com.meli.desafio_spring.entity.Post;
import br.com.meli.desafio_spring.entity.PromoPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository {
    List<Post> postsList = new ArrayList<>();
    List<PromoPost> promoPostsList = new ArrayList<>();

    public Post save(Post post) {
        postsList.add(post);

        return post;
    }

    public PromoPost savePromo(PromoPost promoPost) {
        promoPostsList.add(promoPost);

        return promoPost;
    }

    public List<Post> getPostsList() {
        return postsList;
    }
}
