package com.learn.genericNew;

import com.learn.entity.dota.Axe;
import com.learn.entity.dota.EquippedAxe;

import java.util.ArrayList;
import java.util.List;

public class ExtendsGe {
    public static void main(String[] args) {
        List<? extends Axe> list = new ArrayList<EquippedAxe>();

    }

    public static <T> void test(T t) {

    }
}
