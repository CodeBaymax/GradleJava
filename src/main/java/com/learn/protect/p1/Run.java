package com.learn.protect.p1;

import com.learn.protect.p2.Bear;

public class Run {
    public static void main(String[] args) {
        Jugg jugg = new Jugg();
        jugg.harmOutput();
//        jugg.clone();

        Bear bear = new Bear();
        bear.harmOutput();
//        bear.clone();

        Lich lich = new Lich();
//        lich.clone();

        Hero hero = new Hero();
        hero.harmOutput();
    }
}
