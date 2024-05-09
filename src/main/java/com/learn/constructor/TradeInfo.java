package com.learn.constructor;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TradeInfo {

    private BigDecimal price = new BigDecimal("1.0");

    private int no;

    public BigDecimal getPrice() {
        return price == null ? BigDecimal.ZERO : price;
    }
    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
