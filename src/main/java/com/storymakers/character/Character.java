package com.storymakers.character;

import java.util.List;

public class Character {
    private String name;

    private Race race;

    private Class clazz;

    private Type type;

    private State state;

    public Character(String name, Race race, Class clazz, Type type) {
        this.name = name;
        this.race = race;
        this.clazz = clazz;
        this.type = type;

        this.state = new State();
    }

    class State {
        private int health;

        private int mana;

        //todo temporary effects should be here as well, suc as curses, poisoning or positive one
    }

    //todo to think about stats what are they and Skills relationships, to think about proper name
    class Stats {

    }

    //todo to think do we need it for mobs?
    class Inventory {
        //todo move to State?
        private int maxSize;

        private List<Object> objects;
    }
}
