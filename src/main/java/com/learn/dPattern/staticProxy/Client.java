package com.learn.dPattern.staticProxy;

public class Client {
    public static void main(String[] args) {
        IOperateDb exeOperateDb = new OperateDb();

        IOperateDb proxyOperateDb = new ProxyOperateDb(exeOperateDb);

        proxyOperateDb.readInfo("this is param");
    }
}
