package com.demo.movie_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.movie_service.enitiy.MovieEntity;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Integer>{
}
