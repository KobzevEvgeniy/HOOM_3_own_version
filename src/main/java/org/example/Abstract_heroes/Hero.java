package org.example.Abstract_heroes;

import java.util.Random;

public abstract class Hero {
    /**
     * Номер по счету
     */
    protected static int number;

    /**
     * Счетчик героев
     */
    protected static Random r;

    /**
     * Имя персонажа
     */
    protected String name;

    /**
     * Здоровье персонажа сейчас
     */
    protected int health;

    /**
     * Здоровье персонажа максимальный уровень
     */
    protected int maxHealth;

    static {
        Hero.number = 0;
        Hero.r = new Random();
    }
    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
    }

    public Hero() {
        this(String.format(" #%d", ++Hero.number),
                Hero.r.nextInt(100, 200));
    }

    public String getInfo() {
        return String.format("Имя: %s  Здоровье: %d  Тип: %s",
                this.name, this.health, this.getClass().getSimpleName());
    }

    public void healed(int Hp) {
        this.health = Hp + this.health > this.maxHealth ? this.maxHealth : Hp+ this.health;
    }

    protected void getDamage(int damage) {
        if (this.health - damage > 0) {
            this.health -= damage;
        }
        // else { die(); }
    }

/**
    private static String getName(){
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }
 */
}
