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

    @GetMapping("/{id}/followers/list")
    public ResponseEntity<?> getFollowersList(@PathVariable Integer id, @RequestParam(required = false, defaultValue = "") String order) {
        return ResponseEntity.status(HttpStatus.OK).body(followService.customerFollows(id, order));
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody CustomerDTO customerDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.create(customerDTO));
    }

    @PostMapping("/{customerId}/follow/{sellerId}")
    public ResponseEntity<?> follow(@PathVariable Integer customerId, @PathVariable Integer sellerId) {
        followService.follow(customerId, sellerId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PostMapping("/{customerId}/unfollow/{sellerId}")
    public ResponseEntity<?> unfollow(@PathVariable Integer customerId, @PathVariable Integer sellerId) {
        followService.unfollow(customerId, sellerId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
