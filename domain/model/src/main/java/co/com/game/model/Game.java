package co.com.game.model;

import java.util.Set;

public class Game {
    private String id;
    private String gameId;
    private Boolean playing;
    private Player winner;
    private Set<Player> players;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public Boolean getPlaying() {
        return playing;
    }

    public void setPlaying(Boolean playing) {
        this.playing = playing;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Game() {
        this.playing = false;
        this.winner = null;
        this.players = Set.of();
    }

    public Game(String id, Player player) {
        this.gameId = id;
        this.playing = false;
        this.winner = null;
        this.players = Set.of(player);
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }
}
