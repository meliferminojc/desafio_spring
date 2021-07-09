package br.com.meli.desafio_spring.dto.post;

import br.com.meli.desafio_spring.entity.Product;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ResponsePostDTO {
    protected Integer userId;

    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    protected Date date;
    protected Product product;
    protected Integer category;
    protected Double price;

    public ResponsePostDTO(Integer userId, Date date, Product product, Integer category, Double price) {
        this.userId = userId;
        this.date = date;
        this.product = product;
        this.category = category;
        this.price = price;
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
}
