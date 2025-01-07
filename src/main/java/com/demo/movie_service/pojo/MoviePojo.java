package com.demo.movie_service.pojo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MoviePojo {

    private int movie_id;
    private String movieTitle;
    private String movieDesc;
    private String movieLanguage;
    private LocalDate movieReleaseDate;
    private String movieImageUrl;
}
