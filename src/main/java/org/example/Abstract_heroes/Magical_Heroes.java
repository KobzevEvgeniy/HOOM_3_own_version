package org.example.Abstract_heroes;


import org.example.GameInterface;

public abstract class Magical_Heroes extends Hero implements GameInterface {
    /**
     * Магическая сила- Манна
     */
    protected int mana;
    /**
     * Максимальная Манна
     */
    protected int maxMana;

    public Magical_Heroes( String name, int health, int mana, int maxMana) {
        this.mana = mana;
        this.maxMana = maxMana;
        this.name=name;
        this.health=health;

    }


    public Magical_Heroes() {

    }
}
