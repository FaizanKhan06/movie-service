package com.demo.movie_service.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.movie_service.enitiy.MovieEntity;
import com.demo.movie_service.pojo.MoviePojo;
import com.demo.movie_service.repo.MovieRepository;

@Service
public class MovieService {

    @Autowired
    MovieRepository repo;

    public List<MoviePojo> getAllMovies(){
        List<MovieEntity> movies = repo.findAll();

        List<MoviePojo> moviesPojo = new ArrayList<>();

        movies.stream().forEach(movie -> {
            MoviePojo moviePojo = new MoviePojo();
            BeanUtils.copyProperties(movie, moviePojo);

            moviesPojo.add(moviePojo);
        });

        return moviesPojo;
    }

    public MoviePojo getAMovie(int movieId){
        Optional<MovieEntity> movie = repo.findById(movieId);

        if(movie.isPresent()){
            MoviePojo moviePojo = new MoviePojo();
            BeanUtils.copyProperties(movie, moviePojo);
            return moviePojo;
        }

        return null;
    }

    public MoviePojo addMovie(MoviePojo newMovie){
        MovieEntity movieEntity = new MovieEntity();

        BeanUtils.copyProperties(newMovie, movieEntity);
        
        movieEntity = repo.saveAndFlush(movieEntity);

        newMovie.setMovie_id(movieEntity.getMovie_id());

        return newMovie;
    }

    public MoviePojo updateMovie(MoviePojo newMovie){
        MovieEntity movieEntity = new MovieEntity();

        BeanUtils.copyProperties(newMovie, movieEntity);
        
        repo.save(movieEntity);

        return newMovie;
    }

    public void deleteMovie(int movieId){
        repo.deleteById(movieId);
    }

}
