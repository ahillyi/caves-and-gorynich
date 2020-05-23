package com.storymakers.character.state;

import com.storymakers.character.Stats;

import java.util.List;

public class State {
    private int health;

    private int mana;

    private Stats currentStats;

    private List<Effect> temporaryEffects;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Stats getCurrentStats() {
        return currentStats;
    }

    public void setCurrentStats(Stats currentStats) {
        this.currentStats = currentStats;
    }

    public List<Effect> getTemporaryEffects() {
        return temporaryEffects;
    }

    public void setTemporaryEffects(List<Effect> temporaryEffects) {
        this.temporaryEffects = temporaryEffects;
    }
}
