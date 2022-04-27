package com.susu.generic1;

import com.susu.entity.dota.Axe;

import java.util.ArrayList;
import java.util.List;

public class Generic1 {

    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
        list = new ArrayList<Axe>();
        list.get(0);


    }
}
