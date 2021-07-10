package br.com.meli.desafio_spring.service;

import br.com.meli.desafio_spring.dto.customer.CustomerDTO;
import br.com.meli.desafio_spring.dto.customer.CustomerFollowsDTO;
import br.com.meli.desafio_spring.dto.seller.SellerFollowsCountDTO;
import br.com.meli.desafio_spring.dto.seller.SellerFollowsDTO;
import br.com.meli.desafio_spring.entity.Customer;
import br.com.meli.desafio_spring.entity.Seller;
import br.com.meli.desafio_spring.repository.CustomerRepository;
import br.com.meli.desafio_spring.repository.SellerRepository;
import br.com.meli.desafio_spring.util.mapper.customer.CustomerFollowsMapper;
import br.com.meli.desafio_spring.util.mapper.seller.SellerFollowsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;

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

    public void unfollow(Integer customerId, Integer sellerId) {
        Customer customer = customerRepository.findOne(customerId);
        Seller seller = sellerRepository.findOne(sellerId);

        customerRepository.unfollow(seller, customer);
    }

    public SellerFollowsCountDTO countFollows(Integer sellerId){
        Seller seller = sellerRepository.findOne(sellerId);

        return new SellerFollowsCountDTO(seller.getId(), seller.getName(), seller.getFollow().size());
    }

    public SellerFollowsDTO sellerFollows(Integer sellerId) {
        Seller seller = sellerRepository.findOne(sellerId);

        return SellerFollowsMapper.toDTO(seller);
    }

    public CustomerFollowsDTO customerFollows(Integer customerId) {
        Customer customer = customerRepository.findOne(customerId);

        return CustomerFollowsMapper.toDTO(customer);
    }

}
