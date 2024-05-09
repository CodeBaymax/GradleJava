package com.learn.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.ScanParams;
import redis.clients.jedis.ScanResult;

import java.util.List;

public class ScanParamsLearn {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);

        ScanParams scanParams = new ScanParams();
        scanParams.match("test:*");
        scanParams.count(1);

        ScanResult<String> result = jedis.scan("0", scanParams);

        List<String> list = result.getResult();
        System.out.println("========================");
        System.out.println(result.getStringCursor());
        list.forEach(str -> System.out.println(str));

        if (!result.getStringCursor().equals("0")) {
            result = jedis.scan(result.getStringCursor(), scanParams);
            list = result.getResult();
            System.out.println("++++++++++++++++++++++++");
            list.forEach(str -> System.out.println(str));
        }
        jedis.close();
    }
}
