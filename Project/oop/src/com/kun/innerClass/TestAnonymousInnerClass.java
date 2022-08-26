package com.kun.innerClass;

public class TestAnonymousInnerClass {

    public void test1(A a) {
        a.run();
    }


    public static void main(String[] args) {
        TestAnonymousInnerClass t = new TestAnonymousInnerClass();
//        t.test1(new AImpl());
          t.test1(new A() {
              @Override
              public void run() {
                  System.out.println("第一次匿名内部类！");
              }
          });
          t.test1(new A() {
              @Override
              public void run() {
                  System.out.println("第二次匿名内部类！");
              }
          });
    }
}

class AImpl implements A{

    @Override
    public void run() {
        System.out.println("AImpl.run");
    }
}
interface A{
    void run();
}
