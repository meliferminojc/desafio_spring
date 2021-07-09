package br.com.meli.desafio_spring.entity;

import java.util.List;

public class Seller extends User{
    private List<Customer> follow;

    public Seller(Integer id, String name, List<Customer> follow) {
        super(id, name);
        this.follow = follow;
    }

    public List<Customer> getFollow() {
        return follow;
    }

}
