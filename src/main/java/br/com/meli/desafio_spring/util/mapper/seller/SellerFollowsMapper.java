package br.com.meli.desafio_spring.util.mapper.seller;

import br.com.meli.desafio_spring.dto.customer.CustomerDTO;
import br.com.meli.desafio_spring.dto.seller.SellerFollowsDTO;
import br.com.meli.desafio_spring.entity.Customer;
import br.com.meli.desafio_spring.entity.Seller;
import br.com.meli.desafio_spring.util.mapper.customer.CustomerMapper;

import java.util.ArrayList;
import java.util.List;

public class SellerFollowsMapper {
    public static SellerFollowsDTO toDTO(Seller seller) {
        return new SellerFollowsDTO(seller.getId(), seller.getName(), sellerDTOList(seller.getFollow()));
    }

    public static List<CustomerDTO> sellerDTOList(List<Customer> customers) {
        List<CustomerDTO> list = new ArrayList<>();

        customers.forEach(s -> list.add(CustomerMapper.toDTO(s)));

        return list;
    }
}
