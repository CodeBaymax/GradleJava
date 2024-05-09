package com.learn.generic;

import com.learn.entity.generic.Apple;
import com.learn.entity.generic.Fruit;
import com.learn.entity.generic.Plate;
import com.learn.entity.generic.UpperPlate;

public class UpperGen {

    public static void main(String[] args) {
        // 编译无法通过
        // Plate<Fruit> plate = new Plate<Apple>(new Apple());
        Plate<Fruit> plate = new Plate<Fruit>(new Apple());

        // 可以编译通过
        UpperPlate<? extends Fruit> upperPlate = new UpperPlate<Apple>(new Apple());
        // set无法编译通过
        // upperPlate.setItem(new Apple());

        // get可以编译通过
        upperPlate.getItem();
    }
}
