package br.com.meli.desafio_spring.dto.customer;

import br.com.meli.desafio_spring.entity.Post;

import java.util.List;

public class ResponsePostsFromSellerDTO {
    private Integer userId;
    private List<Post> postList;

    public ResponsePostsFromSellerDTO(Integer userId, List<Post> postList) {
        this.userId = userId;
        this.postList = postList;
    }

    public Integer getUserId() {
        return userId;
    }

    public List<Post> getPostList() {
        return postList;
    }
}
