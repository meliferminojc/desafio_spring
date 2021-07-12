package br.com.meli.desafio_spring.dto.post;

public class CountPromoPostDTO {
    private Integer userId;
    private String userName;
    private Integer promoProducts_count;

    public CountPromoPostDTO(Integer userId, String userName, Integer promoProducts_count) {
        this.userId = userId;
        this.userName = userName;
        this.promoProducts_count = promoProducts_count;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getPromoProducts_count() {
        return promoProducts_count;
    }
}
