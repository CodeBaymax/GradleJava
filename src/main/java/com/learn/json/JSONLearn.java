package com.learn.json;

import com.alibaba.fastjson.JSONObject;

public class JSONLearn {

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "123");
        jsonObject.put("type", "ld的");
        System.out.println("===" + jsonObject + "+++");
        System.out.println("=== " + jsonObject.size() + " ===");
        System.out.println("=== " + jsonObject.toJSONString() + " ===");
        System.out.println("=== " + jsonObject.toJSONString().length() + " ===");
        JSONObject.toJSONString(null);
        System.out.println("=============================");

    }
}
