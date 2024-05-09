package com.learn.dPattern.staticProxy;

public class OperateDb implements IOperateDb {

    public String readInfo(String param) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "this is result";
    }
}
