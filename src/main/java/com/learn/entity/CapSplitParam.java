package com.learn.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CapSplitParam {

    private String id;

    private String adjustType1;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
