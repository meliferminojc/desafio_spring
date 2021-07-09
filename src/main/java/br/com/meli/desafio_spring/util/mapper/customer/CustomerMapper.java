package br.com.meli.desafio_spring.util.mapper.customer;

import br.com.meli.desafio_spring.dto.customer.CustomerDTO;
import br.com.meli.desafio_spring.entity.Customer;
import br.com.meli.desafio_spring.entity.Seller;
import br.com.meli.desafio_spring.util.generate.GenerateID;

import java.util.ArrayList;
import java.util.List;

public class CustomerMapper {
    public static CustomerDTO toDTO(Customer customer) {
        return new CustomerDTO(customer.getId(), customer.getName());
    }

    public static Customer toEntity(CustomerDTO customerDTO) {
        List<Seller> follows = new ArrayList<>();
        return new Customer(GenerateID.ToCusomer(), customerDTO.getName(), follows);
    }
}
