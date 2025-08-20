package com.devrick.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrick.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
