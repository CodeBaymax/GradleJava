package com.learn.extendsAndImplements;

import com.learn.entity.dota.Axe;
import com.learn.entity.dota.EquippedAxe;
import com.learn.entity.dota.HeroInter;

public class SubclassLearn {

    public static void main(String[] args) {
        Class axeClass = Axe.class;

        System.out.println("======================");
        System.out.println(Object.class.isAssignableFrom(axeClass));
        System.out.println("======================");

        System.out.println("++++++++++++++++++++++");
        System.out.println(HeroInter.class.isAssignableFrom(axeClass));
        System.out.println("++++++++++++++++++++++");

        Class equippedAxeClass = EquippedAxe.class;
        System.out.println("----------------------");
        System.out.println(axeClass.isAssignableFrom(equippedAxeClass));
        System.out.println("----------------------");
    }
}
