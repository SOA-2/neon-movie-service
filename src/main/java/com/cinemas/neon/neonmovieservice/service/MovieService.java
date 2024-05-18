package com.cinemas.neon.neonmovieservice.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemas.neon.neonmovieservice.dao.MovieDao;
import com.cinemas.neon.neonmovieservice.entity.Movie;

@Service
public class MovieService {

    @Autowired
    MovieDao movieDao;

    public List<Movie> getMovies() {
        return movieDao.findAll();
    }

    public Optional<Movie> getMovie(UUID id) {
        return movieDao.findById(id);
    }

}
