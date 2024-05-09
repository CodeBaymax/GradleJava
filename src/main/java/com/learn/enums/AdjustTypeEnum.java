package com.learn.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AdjustTypeEnum {
    IM("IM", "尾差"),
    LD("LD", "违约金");

    private String code;
    private String desc;
}
