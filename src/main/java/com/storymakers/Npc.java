package com.storymakers;

public class Npc implements Character {
    private final String name;
    private int healthPoints;

    public Npc(String name) {
        this.name = name;
        healthPoints = 100;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void speak(String words) {

    }

    public void attack(int damage, Character target) {

    }
}
