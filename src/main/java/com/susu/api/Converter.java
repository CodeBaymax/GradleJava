package com.susu.api;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
