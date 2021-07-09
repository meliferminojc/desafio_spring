package br.com.meli.desafio_spring.entity;

public abstract class User {

    protected Integer id;
    protected String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
