package org.example.All_Magical_heroes;
import org.example.Abstract_heroes.Hero;
import org.example.Abstract_heroes.Magical_Heroes;
import org.example.All_Warriors_heroes.Attack;

public class Wizard extends Magical_Heroes implements Healing, Attack {
    private int mana;
    private int maxMana;

    private int damage;



    public Wizard() {
        super(String.format("Колдун #%d", +Magical_Heroes.number),
                Magical_Heroes.r.nextInt(100, 200));
        this.maxMana = Magical_Heroes.r.nextInt(50, 150);
        this.mana = maxMana;
        this.damage=10;
    }

    public Wizard(String name, int health) {
        super();
        this.name= name;
        this.health= health;
        this.maxMana = 200;
        this.mana = maxMana;
        this.damage=10;
    }


    public String getInfo() {
        return String.format("Колдун %s  Манна: %d Сила урона: %s",super.getInfo(), this.mana, this.damage);
    }

    @Override
    public void healing(Hero target) {

    }

    @Override
    public void Attack(String Hero, int health, int damage) {

    }
}


