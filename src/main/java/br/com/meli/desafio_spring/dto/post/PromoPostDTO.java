package br.com.meli.desafio_spring.dto.post;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class PromoPostDTO extends PostDTO {

    @NotNull
    private Boolean hasPromo;

    private Double discount;

    public PromoPostDTO() {
    }

    public PromoPostDTO(Integer sellerId, Date date, Integer categoryId, Double price, Boolean hasPromo, Double discount) {
        super(sellerId, categoryId, price);
        this.date = date;
        this.hasPromo = hasPromo;
        this.discount = discount;
    }

    public Boolean getHasPromo() {
        return hasPromo;
    }

    public Double getDiscount() {
        return discount;
    }
}
