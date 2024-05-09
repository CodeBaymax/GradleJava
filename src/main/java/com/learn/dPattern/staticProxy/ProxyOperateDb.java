package com.learn.dPattern.staticProxy;

import java.time.LocalDateTime;

public class ProxyOperateDb implements IOperateDb {

    private IOperateDb iOperateDb;

    public ProxyOperateDb(IOperateDb iOperateDb) {
        this.iOperateDb = iOperateDb;
    }

    public String readInfo(String param) {
        System.out.println("开始时间： " + LocalDateTime.now());
        System.out.println("参数为： " + param);
        String str = iOperateDb.readInfo(param);
        System.out.println("查询结果为：" + str);
        System.out.println("结束时间： " + LocalDateTime.now());
        return str;
    }
}
