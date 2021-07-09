package br.com.meli.desafio_spring.entity;


import java.util.List;

public class Customer extends User {
    private List<Seller> follows;

    public Customer(Integer id, String name, List<Seller> follows) {
        super(id, name);
        this.follows = follows;
    }

    public Customer(Integer id, String name) {
        super(id, name);
    }

    public List<Seller> getFollows() {
        return follows;
    }

    public void setFollows(List<Seller> follows) {
        this.follows = follows;
    }
}
