package com.learn.genericNew;

import com.learn.entity.dota.Axe;

public class NodeObj {

    private Object obj;

    public Object get(){
        return obj;
    }

    public void set(Object obj){
        this.obj=obj;
    }

    public static void main(String[] args){
        Axe stu=new Axe();
        NodeObj  node=new NodeObj();
        node.set(stu);
        Axe axe = (Axe) node.get();
    }
}
