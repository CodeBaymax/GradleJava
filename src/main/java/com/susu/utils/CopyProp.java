package com.susu.utils;

import com.susu.entity.CapSplit;
import com.susu.entity.CapSplitParam;
import org.springframework.beans.BeanUtils;

public class CopyProp {
    public static void main(String[] args) {
        CapSplit capSplit = new CapSplit();
        capSplit.setId("1");
        capSplit.setAdjustType("aa");
        System.out.println(capSplit.toString());

        CapSplitParam param = new CapSplitParam();
        BeanUtils.copyProperties(capSplit, param);

        System.out.println("===============================");
        System.out.println(capSplit.toString());
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println(param.toString());
    }
}
