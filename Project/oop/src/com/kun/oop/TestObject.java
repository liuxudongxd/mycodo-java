package com.kun.oop;

import java.sql.SQLOutput;
import java.util.Objects;

/**
 * 测试Object
 * 重写String()
 * 使用equals语句
 */
public class TestObject extends Object{
    int id;
    String name;
    String pwd;

    public TestObject(int id,String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
        this.id = id;
    }
    TestObject(){}

    /*@Override
    public String toString() {
        return "账户名"+name+"密码"+pwd;
    }*/

    public static void main(String[] args) {
       /* TestObject t = new TestObject();
        System.out.println(t.toString());
        TestObject t2 = new TestObject();
        System.out.println(t2.toString());
        System.out.println(t2); //默认调用toString()方法
        System.out.println("TestObject.main");*/
        TestObject t3 = new TestObject(1001,"kunkun","rap");
        TestObject t4 = new TestObject(1001,"kunkun","rap");
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t3.equals(t4));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObject that = (TestObject) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
