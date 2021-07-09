package br.com.meli.desafio_spring.dto.seller;

public class SellerDTO {
    private Integer id;
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
