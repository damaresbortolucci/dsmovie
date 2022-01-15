package com.dbsmovie.dbsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbsmovie.dbsmovie.entities.Movie;


public interface MovieRepository extends JpaRepository<Movie, Long>{

}
