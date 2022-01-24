package com.volodichev.spring_demo.repository;

import com.volodichev.spring_demo.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepo extends JpaRepository<Film, Long> {
}
