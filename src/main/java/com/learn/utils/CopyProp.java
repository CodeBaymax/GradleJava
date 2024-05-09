package com.learn.utils;

import com.learn.entity.CapSplit;
import com.learn.entity.CapSplitParam;
import org.springframework.beans.BeanUtils;

import java.util.Properties;

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

        Properties properties = new Properties();
        properties.setProperty("str", "123");
        System.out.println(properties.remove("str"));
        System.out.println(properties.remove("str"));
    }
}
