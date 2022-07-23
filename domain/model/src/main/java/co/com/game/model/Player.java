package co.com.game.model;

import java.util.Set;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public Set<Card> getDeck() {
        return deck;
    }

    public void setDeck(Set<Card> deck) {
        this.deck = deck;
    }
}
