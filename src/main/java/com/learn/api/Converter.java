package com.learn.api;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
