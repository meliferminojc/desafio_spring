package br.com.meli.desafio_spring.util.mapper.seller;

import br.com.meli.desafio_spring.dto.seller.SellerDTO;
import br.com.meli.desafio_spring.entity.Customer;
import br.com.meli.desafio_spring.entity.Seller;
import br.com.meli.desafio_spring.util.generate.GenerateID;

import java.util.ArrayList;
import java.util.List;

public class SellerMapper {
    public static SellerDTO toDTO(Seller seller){
        return new SellerDTO(seller.getId(), seller.getName());
    }

    public static Seller toEntity(SellerDTO sellerDTO) {
        List<Customer> followers = new ArrayList<>();
        return new Seller(GenerateID.ToSeller(), sellerDTO.getUserName(), followers);
    }
}
