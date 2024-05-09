package com.learn.entity.dota;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Axe implements HeroInter {

    public int masterStroke = 3;

    private String assist;

    @Override
    public void masterStroke() {
        System.out.println("harm output");
        masterStroke --;
        System.out.println("======== " + masterStroke + " ==========");
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
