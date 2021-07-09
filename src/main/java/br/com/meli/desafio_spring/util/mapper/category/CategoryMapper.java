package br.com.meli.desafio_spring.util.mapper.category;

import br.com.meli.desafio_spring.dto.category.CategoryDTO;
import br.com.meli.desafio_spring.entity.Category;
import br.com.meli.desafio_spring.util.generate.GenerateID;

public class CategoryMapper {
    public static CategoryDTO toDTO(Category category) {
        return new CategoryDTO(category.getId(), category.getCategoryName());
    }

    public static Category toEntity(CategoryDTO categoryDTO) {
        return new Category(GenerateID.ToCategory(), categoryDTO.getCategoryName());
    }
}
