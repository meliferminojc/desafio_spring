package br.com.meli.desafio_spring.dto.customer;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CustomerDTO {

    private Integer id;

    @NotNull(message = "Seller id não pode estar vazio.")
    @NotEmpty(message = "Seller id não pode estar vazio.")
    private String name;

    public CustomerDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
