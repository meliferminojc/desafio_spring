package br.com.meli.desafio_spring.dto.customer;

public class CustomerDTO {

    private Integer id;
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
