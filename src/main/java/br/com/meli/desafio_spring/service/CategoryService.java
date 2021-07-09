package br.com.meli.desafio_spring.service;

import br.com.meli.desafio_spring.dto.category.CategoryDTO;
import br.com.meli.desafio_spring.entity.Category;
import br.com.meli.desafio_spring.repository.CategoryRepository;
import br.com.meli.desafio_spring.util.mapper.category.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryDTO create(CategoryDTO categoryDTO) {
        Category category = CategoryMapper.toEntity(categoryDTO);

        return CategoryMapper.toDTO(categoryRepository.create(category));
    }

    public List<Category> list() {
        return categoryRepository.list();
    }
}
