package org.example;

import org.example.All_Magical_heroes.Monk;
import org.example.All_Magical_heroes.Wizard;
import org.example.All_Other_heroes.Bandit;
import org.example.All_Other_heroes.Farmer;
import org.example.All_Warriors_heroes.Arbalester;
import org.example.All_Warriors_heroes.Sniper;
import org.example.All_Warriors_heroes.Spearman;

import static java.lang.System.*;

public class Program {
    public static void main(String[] args) {
        Wizard Wizard1= new Wizard();
        Wizard Wizard2= new Wizard("#2", 200);
        Monk Monk1= new Monk();
        Bandit Bandit1= new Bandit();
        Farmer Farmer1= new Farmer();
        Arbalester Arb= new Arbalester();
        Sniper Sniper1= new Sniper();
        Spearman Sp1= new Spearman();



        out.println(Wizard1.getInfo());
        out.println(Wizard2.getInfo());
        out.println(Monk1.getInfo());
        out.println(Bandit1.getInfo());
        out.println(Farmer1.getInfo());
        out.println(Arb.getInfo());
        out.println(Sniper1.getInfo());
        out.println(Sp1.getInfo());
    }
}