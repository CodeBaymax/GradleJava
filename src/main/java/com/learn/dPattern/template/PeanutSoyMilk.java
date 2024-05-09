package com.learn.dPattern.template;

public class PeanutSoyMilk extends TemplateSoyMilk {
    @Override
    protected void addCondiment() {
        System.out.println("第二步：加入花生");

        setCodiment("花生");
    }
}
