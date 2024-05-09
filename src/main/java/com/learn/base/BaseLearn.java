package com.learn.base;

public class BaseLearn {

    public static void main(String[] args) {
        int i = 0;

        if (++i == 0) {
            System.out.println(i);
        } else {
            System.out.println("==========" + i);
        }

        Character c1 = new Character('a');
        char c2 = 'a';
        if (c2 == c1) {
            System.out.println("c1 == c2 true");
        }
    }
}
