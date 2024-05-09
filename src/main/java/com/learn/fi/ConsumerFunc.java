package com.learn.fi;

import java.util.function.Consumer;

public class ConsumerFunc {
    public static void main(String[] args) {
        Consumer<String> consumer = str -> {
            System.out.print("Hello ");
            System.out.println(str);
        };

        consumer.accept("Susu");

        ConsumerFunc consumerFunc = new ConsumerFunc();
        consumerFunc.useConsumer("Susu", (str) -> System.out.println("Hello, " + str));
    }

    private void useConsumer(String arg, Consumer<String> con) {
        con.accept(arg);
    }

}
