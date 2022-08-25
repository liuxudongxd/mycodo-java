package com.kun.encapsulation.b;
import com.kun.encapsulation.a.Person;

public class Boy extends Person {

    public void play(){
        System.out.println(super.testProtected);
        System.out.println(super.testPublic);

        Person p = new Person();
/**
 * 若父类和子类在同一个包中，子类可访问父类protected成员,也可访问父类对象的protected成员。
 * 若子类和父类不在同一个包中，子类可访问父类protected成员，不能访问父类对象的protected成员。
 */
        //      System.out.println(p.testProtected);
    }

}
