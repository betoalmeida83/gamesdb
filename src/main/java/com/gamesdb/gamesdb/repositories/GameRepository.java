package com.gamesdb.gamesdb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gamesdb.gamesdb.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
