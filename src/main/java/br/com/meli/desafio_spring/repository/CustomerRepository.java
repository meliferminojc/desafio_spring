package br.com.meli.desafio_spring.repository;

import br.com.meli.desafio_spring.entity.Customer;
import br.com.meli.desafio_spring.entity.Seller;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {

    private List<Customer> customerList = new ArrayList<>();

    public Customer create(Customer customer) {
        customerList.add(customer);

        return customer;
    }

    public Customer findOne(Integer customerId) {
        return customerList.stream()
                .filter(s -> s.getId().equals(customerId))
                .findFirst()
                .orElse(null);
    }

    public void follow(Seller seller, Customer customer) {
        customer.getFollows().add(seller);
        seller.getFollow().add(customer);
    }

}
