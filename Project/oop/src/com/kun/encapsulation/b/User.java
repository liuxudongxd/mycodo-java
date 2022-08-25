package com.kun.encapsulation.b;

//Javabean
public class User {
    private int id;
    private String name;
    private boolean man;

    public void printUserinfo(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(man);
    }

    public User(int id, String name, boolean man) {
        this.id = id;
        this.name = name;
        this.man = man;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean isMan(){
        return man;
    }
    public void setMan(boolean man){
        this.man = man;
    }


}
