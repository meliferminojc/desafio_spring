package br.com.meli.desafio_spring.controller;

import br.com.meli.desafio_spring.dto.post.PostDTO;
import br.com.meli.desafio_spring.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/products/")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/followed/{userId}/list")
    public ResponseEntity<?> getPosts(@PathVariable Integer userId, @RequestParam(required = false, defaultValue = "") String order) {
        return ResponseEntity.status(HttpStatus.OK).body(postService.getPostsFromSeller(userId, order));

    }

    @PostMapping("/newpost")
    public ResponseEntity<?> createPost(@RequestBody @Valid PostDTO postDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(postService.create(postDTO));
    }
}
