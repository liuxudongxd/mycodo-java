package com.kun.abstracrClass;
/**
 * 测试抽象类
 * 1.有抽象方法的类只能定义成抽象类
 * 2.抽象类不能实例化，既不能用new来实例化抽象类
 * 3.抽象类可以包含属性，方法，构造方法。但是构造方法不能用来new实例
 * 4.抽象类只能用来被继承
 * 5.抽象方法必须被子类实现
 */
public abstract class Animal {
    int age;
    public abstract void rest();
    public abstract void run();
    public void shout(){
        System.out.println("Animal.shout");
//        Animal a = new Animal();
        }

}


class Dog extends Animal{

    @Override
    public void rest() {
        System.out.println("Dog.rest");
    }

    @Override
    public void run() {
        System.out.println("Dog.run");
    }
}

class Cat extends Animal{

    @Override
    public void rest() {
        System.out.println("Cat.rest");
    }

    @Override
    public void run() {
        System.out.println("Cat.run");
    }
}