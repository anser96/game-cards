package org.example.usecase;

import co.com.game.model.Game;
import co.com.game.model.gateway.GameRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ProcessGameUseCase {
    private final GameRepository gameRepository;


    public ProcessGameUseCase(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Mono<Game> saveGame(Game game) {
        return gameRepository.save(game);
    }

    public Flux<Game> allGames() {
        return gameRepository.findAll();
    }

    public Mono<Game> gameById(String id) {
        return gameRepository.findById(id);
    }


}
