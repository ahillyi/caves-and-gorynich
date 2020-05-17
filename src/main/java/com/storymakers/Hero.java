package com.storymakers;

public class Hero implements Character {
    private final String name;
    private int healthPoints;
    private final Specialization specialization;
    private final Origin origin;

    public Hero(String name, String race, Specialization specialization, Origin origin) {
        this.name = name;
        this.specialization = specialization;
        this.origin = origin;
        this.healthPoints = 99;
    }

    public void speak(String words) {
        System.out.println(specialization + name + " говорит:" + words);
    }

    public void attack(int damage, Character target) {
        int healthPoints = target.getHealthPoints();
        healthPoints -= damage;
        target.setHealthPoints(healthPoints);
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getDamage(int damage) {
        int currentHealth = healthPoints - damage;
        System.out.println("Вы получили " + damage + " единиц урона.");
        System.out.println("Ваш текущий показатель здоровья = " + currentHealth);
        return currentHealth;
    }

    public int getHeal(int heal) {
        int currentHealth = healthPoints + heal;
        System.out.println("Вы получили " + heal + " единиц исцеления.");
        System.out.println("Ваш текущий показатель здоровья = " + currentHealth);
        return currentHealth;
    }

    public int getHealth() {
        return healthPoints;
    }
}
