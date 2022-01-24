package com.volodichev.spring_demo.controller;

import com.volodichev.spring_demo.entity.Film;
import com.volodichev.spring_demo.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class FilmController {

    @Autowired
    FilmService filmService;

    @GetMapping(value = "reviews")
    public List<Film> getAllFilms() {
        return filmService.getAllFilms();
    }
}
