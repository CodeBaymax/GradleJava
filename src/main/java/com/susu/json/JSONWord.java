package com.susu.json;

import com.susu.entity.CebRequest;
import com.susu.entity.MSG;

public class JSONWord {

    public static void main(String[] args) {
        MSG msg = new MSG();
        msg.setMsg("123");
        msg.setCode("123");

        CebRequest cebRequest = new CebRequest();
        cebRequest.setMSG(msg);
        cebRequest.setUniqueCode("11");

        System.out.println("=======================");
        System.out.println(cebRequest);
        System.out.println("=======================");
    }
}
