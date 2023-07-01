package org.example.Abstract_heroes;
import org.example.GameInterface;
import java.util.Random;

public abstract class Hero implements GameInterface {
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
    public Hero(int health) {
        String name=getName();
        this.name = name;
        this.health = health;
        this.maxHealth = health;
    }

    public Hero() {
        this(
                Hero.r.nextInt(100, 200));
    }

    public String getInfo() {
        return String.format("Имя: %s  Здоровье: %d  Тип: %s",
                this.name, this.health, this.getClass().getSimpleName());
    }

    public void healed(int Hp) {
        this.health = Hp + this.health > this.maxHealth ? this.maxHealth : Hp+ this.health;
    }


    public static String getName(){
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }

    public void step(){
        System.out.printf(getInfo()+"-ПОХОДИЛ");

    }
    public void die(){
        if (health==0){
           System.out.printf(getInfo()+"-УМЕР");
        }

    }

    public void getDamage(int damage) {
    }
}
