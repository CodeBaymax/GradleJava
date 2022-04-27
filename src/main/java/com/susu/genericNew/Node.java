package com.susu.genericNew;

import com.susu.entity.dota.Axe;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Field;

public class Node<T> {
    private T obj;

    public T get() {
        return obj;
    }

    public void set(T t) {
        obj = t;
    }

    public void test() {
        System.out.println(obj.toString());
    }

    public static void main(String[] args){
        Axe stu=new Axe();
        Node<Axe>  node=new Node();
        node.set(stu);
        Axe axe = node.get();

        Class clz = node.getClass();
        System.out.println("node class is:" + clz.getName());

        Field[] fs = clz.getDeclaredFields();
        for ( Field f:fs) {
            System.out.println("Field name "+f.getName()+" type:"+f.getType().getName());
        }
    }
}
