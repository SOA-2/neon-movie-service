package com.cinemas.neon.neonmovieservice.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinemas.neon.neonmovieservice.entity.Show;

@Repository
public interface ShowDao extends JpaRepository<Show, UUID> {

    public List<Show> findByMovieId(UUID movieId);

}
