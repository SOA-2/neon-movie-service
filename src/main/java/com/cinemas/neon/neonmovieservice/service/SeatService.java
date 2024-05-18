package com.cinemas.neon.neonmovieservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemas.neon.neonmovieservice.dao.SeatDao;
import com.cinemas.neon.neonmovieservice.entity.Seat;

@Service
public class SeatService {

    @Autowired
    SeatDao seatDao;

    public List<Seat> getSeatsByScreenId(UUID id) {
        return seatDao.findByScreenIdOrderByLetterAscNumberAsc(id);
    }

}
