package com.learn.extendsAndImplements;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NormalSubClass extends NormalClass {

    private String pro3 = "3";

    @Override
    public String toString() {
        return super.toString();
    }
}
