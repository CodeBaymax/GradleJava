package com.learn.fi;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierFunc {
    public static void main(String[] args) {

        SupplierFunc supplierFunc = new SupplierFunc();

        supplierFunc.sendAndConsume(()->new Random().nextInt(10), (num)->{
            System.out.println("I received: " + num);
            System.out.println(num + " add 10 is " + (num + 10));
        });
    }

    public void sendAndConsume(Supplier<Integer> supplier, Consumer<Integer> consumer) {
        consumer.accept(supplier.get());
    }
}
