package com.kun.testInterface;
//测试接口中的新特性(默认方法，静态方法)
public interface TestDefault {

    void printInfo();

    default void moren(){
        System.out.println("TestDefault.moren");
        System.out.println("测试默认");
        testStatic01(); //默认方法中可以调取静态方法
    }

    static void testStatic01(){
        System.out.println("TestDefault.testStatic01");
    }
}

class TestDefaultImpl01 implements TestDefault{

    @Override
    public void printInfo() {
        System.out.println("TestDefaultImpl01.printInfo");
    }
    static void testStatic01(){
        System.out.println("TestDefaultImpl01.testStatic01");
    }
}
