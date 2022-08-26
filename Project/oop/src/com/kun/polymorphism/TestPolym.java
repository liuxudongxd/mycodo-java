package com.kun.polymorphism;
//测试多态
public class TestPolym {
    public static void main(String[] args) {
//        animalCry(new Dog());
//        animalCry(new Cat());

        //编译类型        运行时类型
        Animal animal = new Dog();    //向上转型（自动）
        animal.shout();
        Dog d = (Dog) animal;  //向下转型(强制)
        d.seeDoor();
        //编译不会报错，运行会报异常:ClassCastException
//      Cat c = (Cat)animal;

        if (animal instanceof Cat) {
            Cat c = (Cat)animal;
            c.catchMouse();
        }
    }
    static void animalCry(Animal a){    //Animal a = new Dog();
        System.out.println("TestPolym.animalCry");
        a.shout();  //可以出现多态
    }






}
