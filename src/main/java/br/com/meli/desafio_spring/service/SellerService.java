package br.com.meli.desafio_spring.service;

import br.com.meli.desafio_spring.dto.seller.SellerDTO;
import br.com.meli.desafio_spring.entity.Seller;
import br.com.meli.desafio_spring.repository.SellerRepository;
import br.com.meli.desafio_spring.util.mapper.seller.SellerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public SellerDTO create(SellerDTO sellerDTO) {
        Seller seller = SellerMapper.toEntity(sellerDTO);

        return SellerMapper.toDTO(sellerRepository.save(seller));
    }
}
