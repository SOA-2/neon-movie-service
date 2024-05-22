package com.cinemas.neon.neonmovieservice.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinemas.neon.neonmovieservice.entity.Fare;

@Repository
public interface FareDao extends JpaRepository<Fare, UUID> {

}
