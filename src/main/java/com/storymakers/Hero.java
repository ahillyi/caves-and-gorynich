package com.storymakers;

public class Hero implements Character {

    String name;
    int healthPoints;
    String race;

    Hero (String name, String race) {
        this.name = name;

        if (race.equalsIgnoreCase("Богатырь") | race.equalsIgnoreCase("Стрелец") | race.equalsIgnoreCase("Чародей")) {
            this.race = race;
        } else {
            System.out.println("Такого класса не существует. Ваш класс будет выбран автоматически.");
         int raceRandom = (int) (Math.random() * 3);
         if (raceRandom == 0) {
             this.race = "Богатырь";
             System.out.println("Вы богатырь.");
            } else if (raceRandom == 1) {
             this.race = "Стрелец";
             System.out.println("Вы стрелец.");
            } else {
                 this.race = "Чародей";
                 System.out.println("Вы чародей.");
            }
         }
        healthPoints = 99;
    }

    public void speak (String words) {
       System.out.println(race + " говорит:" + words);
    }



}
