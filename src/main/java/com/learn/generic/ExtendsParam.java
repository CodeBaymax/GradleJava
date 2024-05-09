package com.learn.generic;

import com.learn.entity.dota.Axe;
import com.learn.entity.dota.EquippedAxe;
import com.learn.entity.dota.HeroInter;

import java.util.List;
import java.util.function.Predicate;

public class ExtendsParam {
    public void testParam(Predicate<? extends Axe> pre) {
        HeroInter hero = new Axe();
        Axe axe = new Axe();
        axe.setAssist("2");

        EquippedAxe equippedAxe = new EquippedAxe();

        Object obj = new Object();

//        if (pre.test(equippedAxe)) {
//            System.out.println("lalala");
//        }
    }

    public void test(List<? extends Axe> a) {

    }
}
