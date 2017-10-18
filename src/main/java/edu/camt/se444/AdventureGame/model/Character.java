package edu.camt.se444.AdventureGame.model;

public class Character {

    private int id;

    private String name;
    private int level;
    private int experience;
    private int health;

    public Character() {
    }

    /**
     *
     * @param level
     * @param name
     * @param experience
     * @param health
     */
    public Character(int id, String name, int level, int experience, int health) {
        super();
        this.id = id;
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.health = health;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}