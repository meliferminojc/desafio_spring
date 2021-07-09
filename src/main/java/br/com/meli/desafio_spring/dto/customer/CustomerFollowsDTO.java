package br.com.meli.desafio_spring.dto.customer;

import br.com.meli.desafio_spring.dto.seller.SellerDTO;

import java.util.List;

public class CustomerFollowsDTO {
    private Integer id;
    private String userName;
    private List<SellerDTO> follows;

    public CustomerFollowsDTO(Integer id, String userName, List<SellerDTO> follows) {
        this.id = id;
        this.userName = userName;
        this.follows = follows;
    }

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public List<SellerDTO> getFollows() {
        return follows;
    }
}
