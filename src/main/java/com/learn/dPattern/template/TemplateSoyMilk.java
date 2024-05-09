package com.learn.dPattern.template;

public abstract class TemplateSoyMilk {

    protected String codiment;

    // 模板方法，制作豆浆
    public final void make() {

        select();

        addCondiment();

        soak();

        beat();
    }

    // 实现方法，选材料
    private void select() {
        System.out.println("第一步：选材料");
    }

    // 抽象方法，添加材料
    protected abstract void addCondiment();

    // 实现方法
    private void soak() {
        System.out.println("第三步：黄豆和" + codiment + "开始浸泡，需要3小时");
    }

    private void beat() {
        System.out.println("第四步：黄豆和" + codiment + "放到豆浆机中打碎");
    }

    protected void setCodiment(String codiment) {
        this.codiment = codiment;
    }

    // 钩子方法
    boolean wantCodiment() {
        return true;
    }

    protected void hookMake() {
        select();

        if (wantCodiment()) {
            addCondiment();
        }

        soak();

        beat();
    }

}
