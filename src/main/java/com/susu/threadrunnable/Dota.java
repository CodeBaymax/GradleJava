package com.susu.threadrunnable;

import com.susu.entity.dota.Axe;
import com.susu.entity.dota.HeroInter;

public class Dota {
    public static void main(String[] args) {
        Axe axe = new Axe();

        HeroInter hero1 = axe;
        HeroInter hero2 = axe;

        System.out.println(((Axe)hero1).masterStroke);

        hero2.masterStoke();

        System.out.println(((Axe)hero1).masterStroke);
    }
}
