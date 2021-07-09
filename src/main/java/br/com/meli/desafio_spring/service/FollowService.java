package br.com.meli.desafio_spring.service;

import br.com.meli.desafio_spring.dto.seller.SellerFollowsCountDTO;
import br.com.meli.desafio_spring.entity.Customer;
import br.com.meli.desafio_spring.entity.Seller;
import br.com.meli.desafio_spring.repository.CustomerRepository;
import br.com.meli.desafio_spring.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private SellerRepository sellerRepository;

    public void follow(Integer customerId, Integer sellerId) {
        Customer customer = customerRepository.findOne(customerId);
        Seller seller = sellerRepository.findOne(sellerId);

        if(customer.getFollows().stream().anyMatch(s -> s.getId().equals(sellerId))) {
            return;
        }

        customerRepository.follow(seller, customer);
    }

    public SellerFollowsCountDTO countFollows(Integer sellerId){
        Seller seller = sellerRepository.findOne(sellerId);

        return new SellerFollowsCountDTO(seller.getId(), seller.getName(), seller.getFollow().size());
    }

}
