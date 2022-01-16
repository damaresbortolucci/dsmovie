package com.dbsmovie.dbsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbsmovie.dbsmovie.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
