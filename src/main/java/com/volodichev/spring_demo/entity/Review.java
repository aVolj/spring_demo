package com.volodichev.spring_demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "review")
public class Review {

    @EmbeddedId
    private ReviewKey key;
    @Column
    private String title;
    @Column(name = "text_review")
    private String text;

    public Review() {
    }

    public ReviewKey getKey() {
        return key;
    }

    public void setKey(ReviewKey key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
