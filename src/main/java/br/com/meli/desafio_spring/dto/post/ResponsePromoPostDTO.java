package br.com.meli.desafio_spring.dto.post;

import br.com.meli.desafio_spring.entity.Product;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ResponsePromoPostDTO extends ResponsePostDTO{

    private Boolean hasPromo;
    private Double discount;

    public ResponsePromoPostDTO(Integer userId, Date date, Product product, Integer category, Double price, Boolean hasPromo, Double discount) {
        super(userId, date, product, category, price);
        this.hasPromo = hasPromo;
        this.discount = discount;
    }

    public Integer getUserId() {
        return userId;
    }

    public Date getDate() {
        return date;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getHasPromo() {
        return hasPromo;
    }

    public Double getDiscount() {
        return discount;
    }
}
