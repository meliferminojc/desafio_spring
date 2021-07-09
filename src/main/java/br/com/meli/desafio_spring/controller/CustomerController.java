package br.com.meli.desafio_spring.controller;

import br.com.meli.desafio_spring.dto.customer.CustomerDTO;
import br.com.meli.desafio_spring.service.CustomerService;
import br.com.meli.desafio_spring.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private FollowService followService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody CustomerDTO customerDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.create(customerDTO));
    }

    @PostMapping("/{customerId}/follow/{sellerId}")
    public ResponseEntity<?> follow(@PathVariable Integer customerId, @PathVariable Integer sellerId) {
        followService.follow(customerId, sellerId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
