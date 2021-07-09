package br.com.meli.desafio_spring.repository;

import br.com.meli.desafio_spring.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepository {
    List<Category> categoryList = new ArrayList<>();

    public Category create(Category category) {
        categoryList.add(category);

        return category;
    }

    public Category findOne(Integer categoryId) {
        return categoryList.stream().filter(c -> c.getId().equals(categoryId)).findFirst().orElse(null);
    }

    public List<Category> list() {
        return categoryList;
    }

}
