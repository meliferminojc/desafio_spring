package br.com.meli.desafio_spring.dto.seller;

public class SellerFollowsCountDTO {
    private Integer id;
    private String userName;
    private Integer followersCount;

    public SellerFollowsCountDTO(Integer id, String userName, Integer followersCount) {
        this.id = id;
        this.userName = userName;
        this.followersCount = followersCount;
    }

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }
}
