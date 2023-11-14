package com.example.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dslist.ents.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
