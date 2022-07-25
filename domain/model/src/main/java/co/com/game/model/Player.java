package co.com.game.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
@Getter
@Setter
public class Player {
    private String id;
    private String name;
    private String email;
    private Double points;
    private Set<Card> deck;

    public Player() {
        this.name = null;
        this.email = null;
        this.points = 0.0;
        this.deck = Set.of();
    }

    public Player(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.points = 0.0;
        this.deck = Set.of();
    }
}
