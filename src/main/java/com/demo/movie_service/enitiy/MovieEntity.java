package com.demo.movie_service.enitiy;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "movies")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int movie_id;

    @Column(name = "movie_title")
    private String movieTitle;

    @Column(name = "movie_description")
    private String movieDesc;

    @Column(name = "movie_language")
    private String movieLanguage;

    @Column(name = "movie_release_date")
    private LocalDate movieReleaseDate;

    @Column(name = "movie_url")
    private String movieImageUrl;

}
