package com.learn.extendsstu;

public class ComputerBook extends Book {

//    protected float getPrice() {
//
//    }


//    protected int getPrice(int price) {
//    }

//    int getPrice() {
//
//    }

    public int getPrice() {
        return 10;
    }

    private String name = "abc";

//    public String getName() {
//        return name;
//    }

    private static  int x = 0;
    public static void main(String[] args) {
        ComputerBook book = new ComputerBook();
        System.out.println(book.getName());
        System.out.println(book.name);
        book.x++;
        ComputerBook.x++;
    }

}
