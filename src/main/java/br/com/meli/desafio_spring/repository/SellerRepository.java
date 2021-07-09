package br.com.meli.desafio_spring.repository;

import br.com.meli.desafio_spring.entity.Seller;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SellerRepository {

    private List<Seller> sellersList = new ArrayList<>();

    public Seller save(Seller seller) {
        sellersList.add(seller);

        return seller;
    }

    public Seller findOne(Integer sellerId) {
        return sellersList.stream()
                .filter(s -> s.getId().equals(sellerId))
                .findFirst()
                .orElse(null);
    }
}
