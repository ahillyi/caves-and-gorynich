package com.storymakers.character;

import com.storymakers.character.state.State;

public class Character {
    private String name;

    private Category race;

    private Category clazz;

    private Category type;

    private State state;

    //unmodifiable, current stats are in state
    private Stats baseStats;

    public Character(String name, Category race, Category clazz, Category type) {
        this.name = name;
        this.race = race;
        this.clazz = clazz;
        this.type = type;

        this.state = new State();
        this.baseStats = new Stats();
    }

    public String getName() {
        return name;
    }

    public Category getRace() {
        return race;
    }

    public Category getClazz() {
        return clazz;
    }

    public Category getType() {
        return type;
    }

    public State getState() {
        return state;
    }

    public Stats getBaseStats() {
        return baseStats;
    }
}
