package br.com.meli.desafio_spring.entity;

public class Product {
    private Integer id;
    private String productName;
    private String type;
    private String brand;
    private String color;
    private String notes;

    public Product() {
    }

    public Product(Integer id, String productName, String type, String brand, String color, String notes) {
        this.id = id;
        this.productName = productName;
        this.type = type;
        this.brand = brand;
        this.color = color;
        this.notes = notes;
    }

    public Integer getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getNotes() {
        return notes;
    }
}
