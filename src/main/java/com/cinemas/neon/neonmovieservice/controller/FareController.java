package com.cinemas.neon.neonmovieservice.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinemas.neon.neonmovieservice.entity.Fare;
import com.cinemas.neon.neonmovieservice.service.FareService;

@RestController
@RequestMapping("/backoffice/fares")
@PreAuthorize("hasAnyAuthority('admin')")
public class FareController {
    @Autowired
    FareService fareService;

    @GetMapping(path = "")
    public List<Fare> getFares() {
        return fareService.getFares();
    }

    @GetMapping(path = "/{id}")
    public Optional<Fare> getFare(@PathVariable UUID id) {
        return fareService.getFare(id);
    }

    @PostMapping(path = "")
    public Fare saveFare(@RequestBody Fare fare) {
        return fareService.saveFare(fare);
    }

    @PutMapping(path = "")
    public Fare updateFare(@RequestBody Fare fare) {
        return fareService.updateFare(fare);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteFare(@PathVariable UUID id) {
        fareService.deleteFare(id);
    }
}
