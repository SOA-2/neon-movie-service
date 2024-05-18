package com.cinemas.neon.neonmovieservice.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "screen", schema = "public")
public class Screen {
    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "theatre_id")
    private Theatre screen;

    @ManyToOne
    @JoinColumn(name = "fare_id")
    private Fare fare;
}
