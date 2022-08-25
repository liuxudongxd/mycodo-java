package com.kun.encapsulation.b;

public class Test {
    public static void main(String[] args) {
        User u = new User(99,"坤坤",true);
        u.setId(100);
        u.setName("kunkun");
        u.setMan(false);

        System.out.println(u.getName());
        System.out.println(u.isMan());

    }
}
