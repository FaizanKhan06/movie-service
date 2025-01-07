package com.demo.movie_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.movie_service.pojo.MoviePojo;
import com.demo.movie_service.service.MovieService;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    MovieService service;

    @GetMapping("")
    public ResponseEntity<List<MoviePojo>> getAllMovies(){
        return new ResponseEntity<List<MoviePojo>>(service.getAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{movieId}")
    public ResponseEntity<MoviePojo> getAMovie(@PathVariable int movieId){
        return new ResponseEntity<MoviePojo>(service.getAMovie(movieId), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<MoviePojo> addMovie(@RequestBody MoviePojo newMovie){
        return new ResponseEntity<MoviePojo>(service.addMovie(newMovie), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<MoviePojo> updateMovie(@RequestBody MoviePojo newMovie){
        return new ResponseEntity<MoviePojo>(service.updateMovie(newMovie), HttpStatus.OK);
    }

    @DeleteMapping("/{movieId}")
    public ResponseEntity<Void> getAllMovies(@PathVariable int movieId){
        service.deleteMovie(movieId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
