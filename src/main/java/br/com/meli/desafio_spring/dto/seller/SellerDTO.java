package br.com.meli.desafio_spring.dto.seller;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class SellerDTO {
    private Integer id;

    @NotNull(message = "User name não pode estar vazio.")
    @NotEmpty(message = "User name é obrigatorio.")
    private String userName;

    public SellerDTO(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }
}
