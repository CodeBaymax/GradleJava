package com.learn.fi;

public class FuncUse {
    public static void main(String[] args) {
        FunctionI func = () -> System.out.println("this is funcion i");

        func.run();
        func.out();
    }
}
