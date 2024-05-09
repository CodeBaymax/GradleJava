package com.learn.extendsAndImplements;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NormalClass {
    private String pro1 = "1";
    private String pro2 = "2";

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
