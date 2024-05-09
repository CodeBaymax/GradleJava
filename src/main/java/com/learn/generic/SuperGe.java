package com.learn.generic;

import com.learn.entity.dota.Axe;
import com.learn.entity.dota.EquippedAxe;
import com.learn.entity.dota.HeroInter;

import java.util.ArrayList;
import java.util.List;

public class SuperGe {

    public static void main(String[] args) {
        List<? super EquippedAxe> list = new ArrayList<>();
//        list.add(new Axe());
//
        Axe hero = new Axe();
//        list.add(hero);
//        Axe axe = new Axe();
//        list.add(axe);

        List<? extends EquippedAxe> list1 = new ArrayList<>();
//        list1.add(hero);
//        list.add();

//        Class c = HeroInter.class;
//        c.isAssignableFrom(Object.class);

        GenericParam genericParam = new GenericParam();

        genericParam.testParam(axe -> {
            System.out.println(axe.toString());
            return true;
        });

        ExtendsParam extendsParam = new ExtendsParam();
        List<Axe> axeList = new ArrayList<>();
        List<EquippedAxe> equippedAxeList = new ArrayList<>();
        extendsParam.test(axeList);
        extendsParam.test(equippedAxeList);

        List<HeroInter> heroInterList = new ArrayList<>();
        genericParam.test(axeList);
        genericParam.test(heroInterList);
//        genericParam.test(equippedAxeList);
    }
}
