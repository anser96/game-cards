package co.com.game.model;

public class Card {
    private String id;
    private String name;
    private String breed;

    public Card() {

    }

    public Card(String id, String name, String breed) {
        this.id = id;
        this.name = name;
        this.breed = breed;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
