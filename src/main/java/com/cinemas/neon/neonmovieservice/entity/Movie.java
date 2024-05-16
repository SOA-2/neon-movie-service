package com.cinemas.neon.neonmovieservice.entity;

// import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie", schema = "public")
public class Movie {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    // @Column(name = "release_date", nullable = false, length = 64)
    // private Date releaseDate;

    @JoinColumn(name = "clasification")
    private String clasification;

    @Column(name = "image", nullable = false)
    private String image;

    @JoinColumn(name = "duration")
    private Integer duration;

    @Column(name = "id_genre", nullable = true)
    private UUID genre;

    @Column(name = "context")
    private String context;

    @Column(name = "trailer")
    private String trailer;

    @Column(name = "director")
    private String director;

    @Column(name = "real_name")
    private String realName;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public Date getReleaseDate() {
    //     return releaseDate;
    // }

    // public void setReleaseDate(Date releaseDate) {
    //     this.releaseDate = releaseDate;
    // }

    public String getClasification() {
        return clasification;
    }

    public void setClasification(String clasification) {
        this.clasification = clasification;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public UUID getGenre() {
        return genre;
    }

    public void setGenre(UUID genre) {
        this.genre = genre;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

}
