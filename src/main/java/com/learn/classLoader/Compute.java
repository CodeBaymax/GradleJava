package com.learn.classLoader;

public class Compute {
    public void add(Integer num1, Integer num2) {
        System.out.println(num1 + num2);
    }

    public static void main(String[] args) {
        Compute compute = new Compute();
        compute.add(1, 2);
    }
}
