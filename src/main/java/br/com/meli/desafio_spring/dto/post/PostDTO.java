package br.com.meli.desafio_spring.dto.post;

import br.com.meli.desafio_spring.entity.Product;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class PostDTO {

    @NotNull(message = "Seller id não pode estar vazio.")
    protected Integer sellerId;

    @NotNull(message = "Data não pode estar vazia.")
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    protected Date date;

    @NotNull(message = "Produto não pode estar vazio.")
    protected Product product;

    @NotNull(message = "Categoria ID não pode estar vazia.")
    protected Integer categoryId;

    @NotNull(message = "Price não pode estar vazio.")
    protected Double price;

    public PostDTO() {
    }

    public PostDTO(Integer sellerId, Date date, Integer categoryId, Double price) {
        this.sellerId = sellerId;
        this.date = date;
        this.categoryId = categoryId;
        this.price = price;
    }

    public PostDTO(Integer sellerId, Integer categoryId, Double price) {
        this.sellerId = sellerId;
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

    public void setDate(Date date) {
        this.date = date;
    }
}
