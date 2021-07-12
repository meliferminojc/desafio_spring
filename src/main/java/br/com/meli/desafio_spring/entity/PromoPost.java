package br.com.meli.desafio_spring.entity;

import java.util.Date;

public class PromoPost extends Post{

    private Boolean hasPromo;
    private Double discount;

    public PromoPost(Integer id, Date date, Integer seller, Product product, Integer categoryId, Double price, Boolean hasPromo, Double discount) {
        super(id, date, seller, product, categoryId, price);
        this.hasPromo = hasPromo;
        this.discount = discount;
    }

    public Boolean getHasDiscount() {
        return hasPromo;
    }

    public Double getDiscount() {
        return discount;
    }
}
