package com.susu.generic;

import com.susu.entity.generic.Apple;
import com.susu.entity.generic.Fruit;
import com.susu.entity.generic.Plate;
import com.susu.entity.generic.UpperPlate;

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
