package com.learn.lambda;

import com.learn.entity.CapSplit;
import com.learn.enums.AdjustTypeEnum;

import java.util.ArrayList;
import java.util.List;

public class FilterLambda {
    public static void main(String[] args) {
        CapSplit capSplit = new CapSplit();

        capSplit.setId("1111");
        capSplit.setAdjustType("IM");

        List<CapSplit> list = new ArrayList<>();

        list.add(capSplit);

        System.out.println(capSplit.getAdjustType().equals(AdjustTypeEnum.IM.getCode()) ? "11111111111111111" : "222222222222222222");

        CapSplit res = list.stream().filter(sub -> AdjustTypeEnum.valueOf(sub.getAdjustType())== AdjustTypeEnum.IM).findFirst().orElse(null);

        System.out.println(null == res ? "===============" : res);
    }
}
