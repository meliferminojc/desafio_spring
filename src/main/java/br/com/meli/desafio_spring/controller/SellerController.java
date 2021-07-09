package br.com.meli.desafio_spring.controller;

import br.com.meli.desafio_spring.dto.seller.SellerDTO;
import br.com.meli.desafio_spring.service.FollowService;
import br.com.meli.desafio_spring.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @Autowired
    private FollowService followService;

    @GetMapping("/{id}/followers/count")
    public ResponseEntity<?> followersCount(@PathVariable Integer id) {

        return ResponseEntity.status(HttpStatus.OK).body(followService.countFollows(id));
    }

    @GetMapping("/{id}/followers/list")
    public ResponseEntity<?> getFollowersList(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(followService.sellerFollows(id));
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody SellerDTO sellerDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(sellerService.create(sellerDTO));
    }
}
