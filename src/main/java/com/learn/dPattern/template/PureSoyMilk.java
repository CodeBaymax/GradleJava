package com.learn.dPattern.template;

public class PureSoyMilk extends TemplateSoyMilk {

    @Override
    protected void addCondiment() {

    }

    @Override
    boolean wantCodiment() {
        return false;
    }
}
