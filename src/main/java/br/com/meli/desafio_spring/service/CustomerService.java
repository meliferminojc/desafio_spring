package br.com.meli.desafio_spring.service;

import br.com.meli.desafio_spring.dto.customer.CustomerDTO;
import br.com.meli.desafio_spring.entity.Customer;
import br.com.meli.desafio_spring.repository.CustomerRepository;
import br.com.meli.desafio_spring.util.mapper.customer.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerDTO create(CustomerDTO customerDTO) {
        Customer customer = CustomerMapper.toEntity(customerDTO);

        return CustomerMapper.toDTO(customerRepository.create(customer));
    }
}
