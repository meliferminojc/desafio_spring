package br.com.meli.desafio_spring.dto.post;

import br.com.meli.desafio_spring.entity.Product;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PostDTO {

    private Integer sellerId;

    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date date;

    private Product product;

    private Integer categoryId;

    private Double price;

    public PostDTO() {
    }

    public PostDTO(Integer sellerId, Date date, Integer categoryId, Double price) {
        this.sellerId = sellerId;
        this.date = date;
        this.categoryId = categoryId;
        this.price = price;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public Date getDate() {
        return date;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public Double getPrice() {
        return price;
    }
}
