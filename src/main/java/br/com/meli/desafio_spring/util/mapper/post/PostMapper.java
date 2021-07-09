package br.com.meli.desafio_spring.util.mapper.post;

import br.com.meli.desafio_spring.dto.post.PostDTO;
import br.com.meli.desafio_spring.dto.post.ResponsePostDTO;
import br.com.meli.desafio_spring.entity.Category;
import br.com.meli.desafio_spring.entity.Post;
import br.com.meli.desafio_spring.entity.Product;
import br.com.meli.desafio_spring.util.generate.GenerateID;
import br.com.meli.desafio_spring.util.mapper.product.ProductMapper;

public class PostMapper {
    public static ResponsePostDTO toDTO(Post post) {
        return new ResponsePostDTO(post.getSeller(), post.getDate(), post.getProduct(), post.getCategoryId(), post.getPrice());
    }

    public static Post toEntity(PostDTO postDTO, Integer seller, Category category) {
        Product product = ProductMapper.toEntity(postDTO);

        return new Post(GenerateID.ToPost(), postDTO.getDate(), seller, product, category.getId(), postDTO.getPrice());
    }
}
