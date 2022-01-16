package com.dbsmovie.dbsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbsmovie.dbsmovie.entities.Score;
import com.dbsmovie.dbsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
