package br.com.meli.desafio_spring.util.mapper.post;

import br.com.meli.desafio_spring.dto.customer.ResponsePostsFromSellerDTO;
import br.com.meli.desafio_spring.entity.Customer;
import br.com.meli.desafio_spring.entity.Post;

import java.util.ArrayList;
import java.util.List;

public class PostsFromSellerMapper {

    public static ResponsePostsFromSellerDTO toDTO(Customer customer, List<Post> posts) {
        List<Post> sellerPosts = new ArrayList<>();

        customer.getFollows().forEach(seller -> posts.forEach(post -> {
            if(post.getSeller().equals(seller.getId())) {
                sellerPosts.add(post);
            }
        }));

        return new ResponsePostsFromSellerDTO(customer.getId(), sellerPosts);
    }
}
