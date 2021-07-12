package br.com.meli.desafio_spring.util.mapper.post;

import br.com.meli.desafio_spring.dto.post.PromoPostDTO;
import br.com.meli.desafio_spring.dto.post.ResponsePromoPostDTO;
import br.com.meli.desafio_spring.entity.Category;
import br.com.meli.desafio_spring.entity.Product;
import br.com.meli.desafio_spring.entity.PromoPost;
import br.com.meli.desafio_spring.util.generate.GenerateID;
import br.com.meli.desafio_spring.util.mapper.product.ProductMapper;

public class PromoPostMapper {
    public static ResponsePromoPostDTO toDTO(PromoPost promoPost) {
        return new ResponsePromoPostDTO(
                promoPost.getSeller(),
                promoPost.getDate(),
                promoPost.getProduct(),
                promoPost.getCategoryId(),
                promoPost.getPrice(),
                promoPost.getHasDiscount(),
                promoPost.getDiscount()
        );
    }

    public static PromoPost toEntity(PromoPostDTO promoPostDTO, Integer seller, Category category) {
        Product product = ProductMapper.toEntity(promoPostDTO);

        return new PromoPost(
                GenerateID.ToPromoPost(),
                promoPostDTO.getDate(),
                seller,
                product,
                category.getId(),
                promoPostDTO.getPrice(),
                promoPostDTO.getHasPromo(),
                promoPostDTO.getDiscount()
        );
    }
}
