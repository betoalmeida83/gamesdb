package com.gamesdb.gamesdb.repositories;

import com.gamesdb.gamesdb.entities.Game;
import com.gamesdb.gamesdb.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
