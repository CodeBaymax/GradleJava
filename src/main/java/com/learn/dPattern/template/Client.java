package com.learn.dPattern.template;

public class Client {

    public static void main(String[] args) {
        TemplateSoyMilk soyMilk = new BlackBeanSoyMilk();

        soyMilk.make();

        TemplateSoyMilk soyMilk1 = new PeanutSoyMilk();

        soyMilk1.make();

        TemplateSoyMilk soyMilk2 = new PureSoyMilk();

        soyMilk2.hookMake();
    }
}
