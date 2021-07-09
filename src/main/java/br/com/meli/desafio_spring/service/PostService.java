package br.com.meli.desafio_spring.service;

import br.com.meli.desafio_spring.dto.post.PostDTO;
import br.com.meli.desafio_spring.dto.post.ResponsePostDTO;
import br.com.meli.desafio_spring.entity.Category;
import br.com.meli.desafio_spring.entity.Post;
import br.com.meli.desafio_spring.entity.Seller;
import br.com.meli.desafio_spring.repository.CategoryRepository;
import br.com.meli.desafio_spring.repository.CustomerRepository;
import br.com.meli.desafio_spring.repository.PostRepository;
import br.com.meli.desafio_spring.repository.SellerRepository;
import br.com.meli.desafio_spring.util.mapper.post.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public ResponsePostDTO create(PostDTO postDTO) {
        Category category = categoryRepository.findOne(postDTO.getCategoryId());
        Seller seller = sellerRepository.findOne(postDTO.getSellerId());

        Post post = postRepository.save(PostMapper.toEntity(postDTO, seller.getId(), category));

        return PostMapper.toDTO(post);
    }
}
