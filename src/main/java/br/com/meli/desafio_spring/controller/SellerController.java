package br.com.meli.desafio_spring.controller;

import br.com.meli.desafio_spring.dto.seller.SellerDTO;
import br.com.meli.desafio_spring.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody SellerDTO sellerDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(sellerService.create(sellerDTO));
    }
}
