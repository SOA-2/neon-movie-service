package com.cinemas.neon.neonmovieservice.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinemas.neon.neonmovieservice.entity.Seat;
import com.cinemas.neon.neonmovieservice.service.SeatService;

@RestController
@RequestMapping("/seats")
public class SeatController {

    @Autowired
    SeatService seatService;

    @GetMapping(path = "/screen/{id}")
    public List<Seat> getSeatsByScreenId(@PathVariable UUID id) {
        return seatService.getSeatsByScreenId(id);
    }

}
