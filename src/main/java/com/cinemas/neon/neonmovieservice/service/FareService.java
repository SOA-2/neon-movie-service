package com.cinemas.neon.neonmovieservice.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemas.neon.neonmovieservice.dao.FareDao;
import com.cinemas.neon.neonmovieservice.entity.Fare;

@Service
public class FareService {
    @Autowired
    FareDao fareDao;

    public List<Fare> getFares() {
        return fareDao.findAll();
    }

    public Optional<Fare> getFare(UUID id) {
        return fareDao.findById(id);
    }

    public Fare saveFare(Fare fare) {
        return fareDao.save(fare);
    }

    public Fare updateFare(Fare fare) {
        return fareDao.save(fare);
    }

    public void deleteFare(UUID id) {
        Optional<Fare> Fare = this.getFare(id);
        if (Fare.isPresent()) {
            this.fareDao.deleteById(id);
        }
    }

}
