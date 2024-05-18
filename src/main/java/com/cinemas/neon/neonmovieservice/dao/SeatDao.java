package com.cinemas.neon.neonmovieservice.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinemas.neon.neonmovieservice.entity.Seat;

@Repository
public interface SeatDao extends JpaRepository<Seat, UUID> {

    public List<Seat> findByScreenIdOrderByLetterAscNumberAsc(UUID screenId);

}
