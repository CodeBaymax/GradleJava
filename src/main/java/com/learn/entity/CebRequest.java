package com.learn.entity;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CebRequest {

    @JSONField(name = "MSG")
    private com.learn.entity.MSG MSG;

    @JSONField(name = "UniqueCode")
    private String UniqueCode;

    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
