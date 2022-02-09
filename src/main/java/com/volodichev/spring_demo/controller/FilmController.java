package com.volodichev.spring_demo.controller;

import com.volodichev.spring_demo.entity.Film;
import com.volodichev.spring_demo.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class FilmController {
    @Autowired
    FilmService filmService;

    @GetMapping(value = "films")
    public List<Film> getAllFilms(){
        return filmService.getAllFilms();
    }

    @GetMapping(value = "films/{id}")
    public Film getFilmById(@PathVariable long id){
        return filmService.getFilmById(id);
    }

    @PostMapping(value = "films")
    public Film addFilm(@RequestBody Film film){
        return filmService.addFilm(film);
    }

    @PutMapping(value = "films")
    public Film update(@RequestBody Film film){
        return filmService.updateFilm(film);
    }

}
