package com.learn.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CapSplit {

    private String id;

    private String adjustType;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
