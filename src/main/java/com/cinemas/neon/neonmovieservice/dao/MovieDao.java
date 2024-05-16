package com.cinemas.neon.neonmovieservice.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinemas.neon.neonmovieservice.entity.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie, UUID> {

}
