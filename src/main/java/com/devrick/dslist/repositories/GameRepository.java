package com.devrick.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrick.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
