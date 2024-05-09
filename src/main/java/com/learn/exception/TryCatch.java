package com.learn.exception;

public class TryCatch {

    public static void main(String[] args) {
        try {
            throwExp();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void tryFinally() {
        try {
            System.out.println("123");

            try {
                System.out.println("aaa");
            } finally {
                System.out.println("bbb");
            }
        } finally {
            System.out.println("456");
        }
        System.out.println("789");
    }

    public static void throwExp() {
        try {
            System.out.println("1. this is outer try");
            try {
                System.out.println("2. this is inner try");
                if (1 == 1) {
                    throw new RuntimeException("exp");
                }
                System.out.println("3. this is inner try after exp");
            } catch (Exception e) {
                System.out.println("4. this is inner catch");
                throw e;
            } finally {
                System.out.println("5. this is inner finally");
            }
        } finally {
            System.out.println("6. this is finally code");
        }
    }
}
