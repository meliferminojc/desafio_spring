package br.com.meli.desafio_spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Post {
    private Integer id;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date date;
    private Integer seller;
    private br.com.meli.desafio_spring.entity.Product product;
    private Integer categoryId;
    private Double price;

    public Post() {
    }

    public Post(Integer id, Date date, Integer seller, Product product, Integer categoryId, Double price) {
        this.id = id;
        this.date = date;
        this.seller = seller;
        this.product = product;
        this.categoryId = categoryId;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getSeller() {
        return seller;
    }

    public void setSeller(Integer seller) {
        this.seller = seller;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public Double getPrice() {
        return price;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public LocalDate getLocalDate() {
        return this.date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", date=" + date +
                ", seller=" + seller +
                ", product=" + product +
                ", categoryId=" + categoryId +
                ", price=" + price +
                '}';
    }
}

