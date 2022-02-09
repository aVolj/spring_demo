package com.volodichev.spring_demo.service;

import com.volodichev.spring_demo.entity.Film;
import com.volodichev.spring_demo.repository.FilmRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Optional;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    FilmRepo filmRepo;

    @Override
    public List<Film> getAllFilms() {
        return filmRepo.findAll();
    }

    @Override
    public Film getFilmById(long id) {
        Optional<Film> filmResult = filmRepo.findById(id);
        return filmResult.orElse(null);
    }

    @Override
    public Film addFilm(Film film) {
        return filmRepo.save(film);
    }

    //TODO
    @Override
    public Film updateFilm(Film film) {
        if(film.getId() != null) {
            return filmRepo.save(film);
        }else {
            throw new EntityNotFoundException();
        }
    }

    @Override
    public String deleteFilm(long id) {
        filmRepo.deleteById(id);
        return "film with ID = " + id + " was deleted";
    }
}
