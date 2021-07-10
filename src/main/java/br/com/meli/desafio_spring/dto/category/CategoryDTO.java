package br.com.meli.desafio_spring.dto.category;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CategoryDTO {

    private Integer categoryId;

    @NotNull(message = "Seller id não pode estar vazio.")
    @NotEmpty(message = "Seller id não pode estar vazio.")
    private String categoryName;

    public CategoryDTO(Integer categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
