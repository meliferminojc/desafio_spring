package br.com.meli.desafio_spring.controller;

import br.com.meli.desafio_spring.dto.post.PostDTO;
import br.com.meli.desafio_spring.dto.post.PromoPostDTO;
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

    @GetMapping("/followed/{userId}/promolist")
    public ResponseEntity<?> getPosts(@PathVariable Integer userId) {
        return ResponseEntity.status(HttpStatus.OK).body(postService.getPromoPostsFromSeller(userId));
    }

    @GetMapping("/{userId}/countPromo/list")
    public ResponseEntity<?> getPromoPostsCount(@PathVariable Integer userId) {
        return ResponseEntity.status(HttpStatus.OK).body(postService.getCountPromoPostsFromSeller(userId));
    }

    @PostMapping("/newpost")
    public ResponseEntity<?> createPost(@RequestBody @Valid PostDTO postDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(postService.create(postDTO));
    }

    @PostMapping("/newpromopost")
    public ResponseEntity<?> createPromoPost(@RequestBody @Valid PromoPostDTO promoPostDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(postService.createPromoPost(promoPostDTO));
    }
}
