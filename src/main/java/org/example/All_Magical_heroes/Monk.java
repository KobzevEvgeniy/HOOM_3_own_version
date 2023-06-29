package org.example.All_Magical_heroes;

import org.example.Abstract_heroes.Hero;
import org.example.Abstract_heroes.Magical_Heroes;

public class Monk extends Magical_Heroes implements Healing {
    private int harmony;
    private int maxHarmony;

    public Monk() {
        super(String.format("Монах #%d", +Magical_Heroes.number),
                Magical_Heroes.r.nextInt(100, 150));
        this.maxHarmony = 100;
        this.harmony = maxHarmony;
    }

    public String getInfo() {
        return String.format("Монах %s  Сила исцеления: %d", super.getInfo(), this.harmony);
    }

    @Override
    public void healing(Hero target) {
        int health = Hero.r.nextInt(10, 20);
        if (this.harmony >= health) {
            target.healed(health);

        }
    }
}
