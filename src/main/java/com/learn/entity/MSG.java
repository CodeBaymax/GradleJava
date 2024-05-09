package com.learn.entity;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MSG {
    @JSONField(name = "Code")
    private String Code;
    private String msg;

    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
