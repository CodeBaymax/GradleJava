package com.learn.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HandleStatusEnum {
    INIT    ("INIT",    "初始化"),
    PROCESS ("PROCESS", "处理中"),
    SUCCESS ("SUCCESS", "成功"),
    FAIL    ("FAIL",    "失败");

    private String code;
    private String desc;
}
