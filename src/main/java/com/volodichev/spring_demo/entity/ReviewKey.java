package com.volodichev.spring_demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ReviewKey implements Serializable {

    private String username;
    @Column(name = "film_id")
    private long filmId;

    public ReviewKey(String username, long filmId) {
        this.username = username;
        this.filmId = filmId;
    }

    public ReviewKey() {
    }

    public long getFilmId() {
        return filmId;
    }

    public void setFilmId(long filmId) {
        this.filmId = filmId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewKey reviewKey = (ReviewKey) o;
        return filmId == reviewKey.filmId && username.equals(reviewKey.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, username);
    }
}
