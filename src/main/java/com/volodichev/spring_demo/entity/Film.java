package com.volodichev.spring_demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "film")
public class Film {

    @Id
    @Column
    private long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String producer;

    public Film() {
    }

    public Film(String name, String description, String producer) {
        this.name = name;
        this.description = description;
        this.producer = producer;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String author) {
        this.producer = author;
    }
}
