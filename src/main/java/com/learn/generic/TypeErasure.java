package com.learn.generic;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();

        if (strList.getClass() == intList.getClass()) {
            System.out.println("==================");
        } else {
            System.out.println("++++++++++++++++++");
        }
    }
}
