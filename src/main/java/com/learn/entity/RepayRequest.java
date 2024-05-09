package com.learn.entity;

import com.alibaba.fastjson.JSONObject;
import com.learn.utils.StringUtils;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class RepayRequest {

    private String sysFlag = "plr";

    private String serNo = StringUtils.getSerNo(30);

    private String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));

    private String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
