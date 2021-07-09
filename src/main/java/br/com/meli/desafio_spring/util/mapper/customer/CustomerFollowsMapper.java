package br.com.meli.desafio_spring.util.mapper.customer;

import br.com.meli.desafio_spring.dto.customer.CustomerFollowsDTO;
import br.com.meli.desafio_spring.dto.seller.SellerDTO;
import br.com.meli.desafio_spring.entity.Customer;
import br.com.meli.desafio_spring.entity.Seller;
import br.com.meli.desafio_spring.util.mapper.seller.SellerMapper;

import java.util.ArrayList;
import java.util.List;

public class CustomerFollowsMapper {
    public static CustomerFollowsDTO toDTO(Customer customer) {
        return new CustomerFollowsDTO(customer.getId(), customer.getName(), customerDTOList(customer.getFollows()));
    }

    public static List<SellerDTO> customerDTOList(List<Seller> sellers) {
        List<SellerDTO> list = new ArrayList<>();

        sellers.forEach(s -> list.add(SellerMapper.toDTO(s)));

        return list;
    }
}
