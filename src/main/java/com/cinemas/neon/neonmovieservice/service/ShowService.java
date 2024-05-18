package com.cinemas.neon.neonmovieservice.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemas.neon.neonmovieservice.dao.ShowDao;
import com.cinemas.neon.neonmovieservice.entity.Show;

@Service
public class ShowService {

    @Autowired
    ShowDao showDao;

    public List<Show> getShows() {
        return showDao.findAll();
    }

    public Optional<Show> getShow(UUID id) {
        return showDao.findById(id);
    }

    public List<Show> getShowsByMovieId(UUID id) {
        return showDao.findByMovieId(id);
    }

}
