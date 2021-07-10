package br.com.meli.desafio_spring.controller;

import br.com.meli.desafio_spring.dto.post.PostDTO;
import br.com.meli.desafio_spring.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products/")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/followed/{userId}/list")
    public ResponseEntity<?> getPosts(@PathVariable Integer userId) {
        return ResponseEntity.status(HttpStatus.OK).body(postService.getPostsFromSeller(userId));

    }

    @PostMapping("/newpost")
    public ResponseEntity<?> createPost(@RequestBody PostDTO postDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(postService.create(postDTO));
    }
}
