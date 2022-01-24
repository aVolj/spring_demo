package com.volodichev.spring_demo.service;

import com.volodichev.spring_demo.entity.Film;
import com.volodichev.spring_demo.repository.FilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FilmServiceImpl implements FilmService{
    @Autowired
    FilmRepo filmRepo;
    @Override
    public List<Film> getAllFilms() {
        return filmRepo.findAll();
    }
}
