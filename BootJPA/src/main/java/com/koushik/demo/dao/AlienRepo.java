package com.koushik.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koushik.demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
