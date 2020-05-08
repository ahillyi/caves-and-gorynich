package com.storymakers;

public class Test {
    public static void main (String[] args) {

        Hero arb = new Hero("Арбалах", "СТРЕЛЕЦ");
        arb.speak (" Где тут Соловей-разбойник?");


        arb.healthPoints = arb.getDamage(35);

        arb.healthPoints = arb.getHeal(10);


        int currentHealth = arb.getHealth();
        System.out.println("Здоровье: " + currentHealth);

    }



}

