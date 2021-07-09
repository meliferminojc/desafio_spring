package br.com.meli.desafio_spring.dto.category;

public class CategoryDTO {

    private Integer categoryId;

    private String categoryName;

    public CategoryDTO(Integer categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
