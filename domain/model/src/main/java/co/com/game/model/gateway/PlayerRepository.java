package co.com.game.model.gateway;

import co.com.game.model.Player;
import reactor.core.publisher.Mono;

public interface PlayerRepository {
    Mono<Player> save(Player player);
}
