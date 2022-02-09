package com.volodichev.spring_demo.service;

import com.volodichev.spring_demo.entity.Film;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FilmService {
    List<Film> getAllFilms();
    Film getFilmById(long id);
    Film addFilm(Film film);
    Film updateFilm(Film film);
    String deleteFilm(long id);
}
