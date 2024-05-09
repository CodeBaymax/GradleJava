package com.learn.fi;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionFunc {
    public static void main(String[] args) {
        FunctionFunc functionFunc = new FunctionFunc();
        Function<Integer, String> func = (num) ->
            functionFunc.dealWStr(num);

        System.out.println(func.apply(new Random().nextInt()));
    }

    public String dealWStr(int num) {
        Supplier<String> more = () -> "I'm more than 0";
        Supplier<String> equal = () -> "I'm equal to 0";
        Supplier<String> less = () -> "I'm less than 0";

        if (num > 0) {
            return more.get();
        } else if (num == 0) {
            return equal.get();
        } else {
            return less.get();
        }
    }

}
