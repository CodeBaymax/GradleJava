package com.learn.constructor;

import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;

public class CollectInfo {

    private String id;

    private String contNo;

    private BigDecimal transAmt;

    private BigDecimal realAmt;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContNo() {
        return contNo;
    }

    public void setContNo(String contNo) {
        this.contNo = contNo;
    }

    public BigDecimal getTransAmt() {
        return null == transAmt ? BigDecimal.ZERO : transAmt;
    }

    public void setTransAmt(BigDecimal transAmt) {
        this.transAmt = transAmt;
    }

    public BigDecimal getRealAmt() {
        return realAmt;
    }

    public void setRealAmt(BigDecimal realAmt) {
        this.realAmt = realAmt;
    }

    @Override
    public String toString() {
        System.out.println("id: " + id);
        System.out.println("transAmt: " + transAmt);
        System.out.println("realAmt: " + realAmt);

        return JSONObject.toJSONString(this);
    }

    public CollectInfo() {
        System.out.println("123");
        System.out.println("123");
    }
}
