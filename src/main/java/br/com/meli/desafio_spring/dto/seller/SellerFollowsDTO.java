package br.com.meli.desafio_spring.dto.seller;

import br.com.meli.desafio_spring.dto.customer.CustomerDTO;

import java.util.List;

public class SellerFollowsDTO {    private Integer id;
    private String userName;
    private List<CustomerDTO> follows;

    public SellerFollowsDTO(Integer id, String userName, List<CustomerDTO> follows) {
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

    public List<CustomerDTO> getFollows() {
        return follows;
    }
}
