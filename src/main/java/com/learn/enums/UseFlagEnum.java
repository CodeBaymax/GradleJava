package com.learn.enums;

public enum UseFlagEnum {

    VALID       ("1", "有效"),
    ABANDON     ("0", "废弃");

    private String sss;
    private String desc;

    public String getSss() {
        return sss;
    }

    public void setSss(String sss) {
        this.sss = sss;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private UseFlagEnum(String sss, String desc) {
        this.sss = sss;
        this.desc = desc;
    }
}
