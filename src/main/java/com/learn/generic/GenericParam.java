package com.learn.generic;

import com.learn.entity.dota.Axe;
import com.learn.entity.dota.EquippedAxe;
import com.learn.entity.dota.HeroInter;

import java.util.List;
import java.util.function.Predicate;

public class GenericParam {

    public void testParam(Predicate<? super EquippedAxe> pre) {
        HeroInter hero = new Axe();
        Axe axe = new Axe();
        axe.setAssist("2");

        Object obj = new Object();

        EquippedAxe equippedAxe = new EquippedAxe();

//        if (pre.test(axe)) {
//            System.out.println("lalala");
//        }
    }

    public void test(List<? super Axe> a) {

    }
}
