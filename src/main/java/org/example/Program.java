package org.example;

import org.example.Abstract_heroes.Hero;
import org.example.All_Magical_heroes.Monk;
import org.example.All_Magical_heroes.Wizard;
import org.example.All_Other_heroes.Bandit;
import org.example.All_Other_heroes.Farmer;
import org.example.All_Warriors_heroes.Arbalester;
import org.example.All_Warriors_heroes.Sniper;
import org.example.All_Warriors_heroes.Spearman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.System.*;

public class Program {
    public static void main(String[] args) {
        out.println("ДЗ к семинару №1: ");
        Wizard Wizard1= new Wizard();
        Monk Monk1= new Monk();
        Bandit Bandit1= new Bandit();
        Farmer Farmer1= new Farmer();
        Arbalester Arb= new Arbalester();
        Sniper Sniper1= new Sniper();
        Spearman Sp1= new Spearman();

        out.println(Wizard1.getInfo());
        out.println(Monk1.getInfo());
        out.println(Bandit1.getInfo());
        out.println(Farmer1.getInfo());
        out.println(Arb.getInfo());
        out.println(Sniper1.getInfo());
        out.println(Sp1.getInfo());
        out.println("_____________________________________________________");

        out.println("ДЗ к семинару №2: ");
         int teamCount = 10;
         Random rand= new Random();
        List<Hero> teams1 = new ArrayList<>();
         for (int i = 0; i < teamCount; i++) {
             int val = rand.nextInt(6);
             switch (val) {
                 case 0:
                     teams1.add(new Monk());
                     break;
                 case 1:
                     teams1.add(new Wizard());
                     break;
                 case 2:
                     teams1.add(new Bandit());
                     break;
                 case 3:
                     teams1.add(new Farmer());
                     break;
                 case 4:
                     teams1.add(new Arbalester());
                     break;
                 case 5:
                     teams1.add(new Sniper());
                 default:
                     teams1.add(new Spearman());
                     break;
             }
             out.println("Команда №1: "+teams1.get(i).getInfo());
         }

        out.println("______________");
        List<Hero> teams2 = new ArrayList<>();
        teams2.add(new Sniper());
        teams2.add(new Spearman());
        teams2.add(new Wizard());
        teams2.add(new Bandit());
        teams2.add(new Sniper());
        teams2.add(new Spearman());
        teams2.add(new Wizard());
        teams2.add(new Bandit());
        teams2.add(new Farmer());
        teams2.add(new Monk());

        for (int i = 0; i < teams2.size(); i++) {
            out.println("Команда №2: "+teams2.get(i).getInfo());
        }

        out.println("______________");
        Sniper1.step();
        teams2.get(2).step();
        out.println("");
        out.println(Bandit1.getInfo());
        out.println(Sniper1.getInfo());
        Sniper1.attack(Bandit1, 10000);
        out.println(Bandit1.getInfo());
        out.println(Sniper1.getInfo());
        Monk1.healing(Bandit1);
        out.println(Bandit1.getInfo());




    }
}