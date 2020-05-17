package com.storymakers;

public interface Character {
    void speak(String words);

    void attack(int damage, Character target);

    int getHealthPoints();

    void setHealthPoints(int healthPoints);
}