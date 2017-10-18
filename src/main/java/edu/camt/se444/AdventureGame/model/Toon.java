package edu.camt.se444.AdventureGame.model;

public class Toon {

    private String id;
    private String name;

    public Toon() {
    }

    /**
     *
     * @param id
     * @param name
     */
    public Toon(String id, String name) {
        super();
        this.id = id;
        this.name = name;
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

}
