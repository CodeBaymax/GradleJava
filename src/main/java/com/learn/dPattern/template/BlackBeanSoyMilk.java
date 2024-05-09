package com.learn.dPattern.template;

public class BlackBeanSoyMilk extends TemplateSoyMilk {

    @Override
    protected void addCondiment() {
        System.out.println("第二步：加入黑豆");

        setCodiment("黑豆");
    }
}
