package br.com.meli.desafio_spring.controller;

import br.com.meli.desafio_spring.dto.category.CategoryDTO;
import br.com.meli.desafio_spring.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/create")
    public ResponseEntity<?> createCategory(@RequestBody @Valid CategoryDTO categoryDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.create(categoryDTO));
    }

    @GetMapping("/list")
    public ResponseEntity<?> listAll() {
        return ResponseEntity.ok(categoryService.list());
    }
}
