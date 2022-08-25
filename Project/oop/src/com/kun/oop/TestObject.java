package com.kun.oop;

/**
 * 测试Object
 */
public class TestObject extends Object{
    String name;
    String pwd;

    public TestObject(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }
    TestObject(){}

    @Override
    public String toString() {
        return "账户名"+name+"密码"+pwd;
    }

    public static void main(String[] args) {
        TestObject t = new TestObject();
        System.out.println(t.toString());
        TestObject t2 = new TestObject();
        System.out.println(t2.toString());
        System.out.println(t2); //默认调用toString()方法
        System.out.println("TestObject.main");
    }


}
