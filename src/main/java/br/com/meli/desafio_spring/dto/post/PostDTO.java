package br.com.meli.desafio_spring.dto.post;

import br.com.meli.desafio_spring.entity.Product;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class PostDTO {

    @NotNull(message = "Seller id não pode estar vazio.")
    private Integer sellerId;

    @NotNull(message = "Data não pode estar vazia.")
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date date;

    @NotNull(message = "Produto não pode estar vazio.")
    private Product product;

    @NotNull(message = "Categoria ID não pode estar vazia.")
    private Integer categoryId;

    @NotNull(message = "Price não pode estar vazio.")
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
