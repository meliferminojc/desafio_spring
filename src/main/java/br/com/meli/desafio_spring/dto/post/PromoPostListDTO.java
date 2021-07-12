package br.com.meli.desafio_spring.dto.post;

import br.com.meli.desafio_spring.entity.PromoPost;

import java.util.List;

public class PromoPostListDTO {
    private Integer userId;
    private String userName;
    private List<PromoPost> posts;

    public PromoPostListDTO(Integer userId, String userName, List<PromoPost> posts) {
        this.userId = userId;
        this.userName = userName;
        this.posts = posts;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public List<PromoPost> getPosts() {
        return posts;
    }
}
