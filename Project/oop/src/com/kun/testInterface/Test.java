package com.kun.testInterface;

public class Test {

    public static void main(String[] args) {
        Angel a = new Angel();
        a.fly();
        a.helpOther();
        System.out.println(Volant.FLY_HIGHT);

        Volant a2 = new Angel();
        a2.fly();

        System.out.println("====测试默认方法====");
        TestDefault test = new TestDefaultImpl01();
        test.printInfo();
        test.moren();
        System.out.println("====测试静态方法====");
        TestDefault.testStatic01();
        TestDefaultImpl01.testStatic01();
    }
}
