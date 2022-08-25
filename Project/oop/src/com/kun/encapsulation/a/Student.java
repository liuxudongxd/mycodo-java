package com.kun.encapsulation.a;

public class Student extends Person{


    public void study(){
        System.out.println(super.testProtected);
        Person p = new Person();
//      System.out.println(p.testPrivate);
        System.out.println(p.testDefault);
        System.out.println(p.testProtected);
    }
}
