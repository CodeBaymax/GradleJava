package com.learn.dPattern.jdkDynamicProxy;

public class Table1 implements ITable1 {

    public String readInfo(String param) {
        return "this is table1 result";
    }

    public void updInfo(String param) {
        System.out.println("upd table1 info");
    }
}
