package com.cinemas.neon.neonmovieservice.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinemas.neon.neonmovieservice.entity.Show;
import com.cinemas.neon.neonmovieservice.service.ShowService;

@RestController
@RequestMapping("/shows")
public class ShowController {

    @Autowired
    ShowService showService;

    @GetMapping(path = "")
    public List<Show> getShows() {
        return showService.getShows();
    }

    @GetMapping(path = "/{id}")
    public List<Show> getShow(@PathVariable UUID id) {
        return showService.getByMovieId(id);
    }

}
