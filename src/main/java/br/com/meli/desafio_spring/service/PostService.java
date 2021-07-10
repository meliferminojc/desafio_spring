package br.com.meli.desafio_spring.service;

import br.com.meli.desafio_spring.dto.customer.ResponsePostsFromSellerDTO;
import br.com.meli.desafio_spring.dto.post.PostDTO;
import br.com.meli.desafio_spring.dto.post.ResponsePostDTO;
import br.com.meli.desafio_spring.entity.Category;
import br.com.meli.desafio_spring.entity.Customer;
import br.com.meli.desafio_spring.entity.Post;
import br.com.meli.desafio_spring.entity.Seller;
import br.com.meli.desafio_spring.repository.CategoryRepository;
import br.com.meli.desafio_spring.repository.CustomerRepository;
import br.com.meli.desafio_spring.repository.PostRepository;
import br.com.meli.desafio_spring.repository.SellerRepository;
import br.com.meli.desafio_spring.util.mapper.post.PostMapper;
import br.com.meli.desafio_spring.util.mapper.post.PostsFromSellerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    public ResponsePostsFromSellerDTO getPostsFromSeller(Integer userId, String order) {
        Customer customer = customerRepository.findOne(userId);
        List<Post> postsList = getLast2WeeksPosts(postRepository.getPostsList());

        postsList.sort(Comparator.comparing(Post::getLocalDate).reversed());

        if(order.equals("date_asc")) {
            postsList.sort(Comparator.comparing(Post::getLocalDate));
        }

        return PostsFromSellerMapper.toDTO(customer, postsList);
    }

    private List<Post> getLast2WeeksPosts(List<Post> posts) {
        LocalDate twoWeeksAgo = LocalDate.now().minusDays(14);
        return posts
                .stream()
                .filter(post -> twoWeeksAgo.compareTo(post.getLocalDate()) <= 0)
                .collect(Collectors.toList());

    }
}
