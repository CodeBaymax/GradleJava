package com.learn.threadLocal;

public class TlParam {

    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        TlParam tlParam = new TlParam();
        tlParam.a("AAA");
    }

    public void a(String param) {
        System.out.println("a method: " + param);
        threadLocal.set(param);
        b();
    }

    public void b() {
        c();
    }

    public void c() {
        d();
    }

    public void d() {
        System.out.println("d method: " + threadLocal.get());
    }
}
