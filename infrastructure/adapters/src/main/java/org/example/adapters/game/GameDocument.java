package org.example.adapters.game;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document
public class GameDocument {
    @Id
    private String id;
    @Indexed(unique = true)
    private String gameId;
    private Boolean playing;
    private ObjectId winnerId;
    private Set<ObjectId> playersList;

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

    public ObjectId getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(ObjectId winnerId) {
        this.winnerId = winnerId;
    }

    public Set<ObjectId> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(Set<ObjectId> playersList) {
        this.playersList = playersList;
    }
}
