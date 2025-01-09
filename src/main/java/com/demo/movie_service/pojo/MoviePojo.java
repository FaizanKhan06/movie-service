package com.demo.movie_service.pojo;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MoviePojo {


    private int movie_id;
    @NotBlank
    private String movieTitle;
    @NotBlank
    private String movieDesc;
    @NotBlank
    private String movieLanguage;
    @NotNull
    private LocalDate movieReleaseDate;
    private String movieImageUrl;
}
