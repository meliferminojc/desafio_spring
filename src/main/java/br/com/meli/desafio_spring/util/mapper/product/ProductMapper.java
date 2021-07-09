package br.com.meli.desafio_spring.util.mapper.product;

import br.com.meli.desafio_spring.dto.post.PostDTO;
import br.com.meli.desafio_spring.entity.Product;
import br.com.meli.desafio_spring.util.generate.GenerateID;

public class ProductMapper {
    public static Product toEntity(PostDTO productDTO) {
        return new Product(GenerateID.ToProduct(),
                productDTO.getProduct().getProductName(),
                productDTO.getProduct().getType(),
                productDTO.getProduct().getBrand(),
                productDTO.getProduct().getColor(),
                productDTO.getProduct().getNotes()
        );
    }
}
