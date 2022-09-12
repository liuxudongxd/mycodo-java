package com.ikun;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
    public static void main(String[] args) {
        //ArithmeticException
        int a = 0;
        if (a!=0){
            System.out.println(a/0);
        }
        //NullPointerException
        String str = null;
        if (str!=null){
            System.out.println(str.charAt(0));
        }
        //ClassCastException
        Animal b = new Cat();
        if (b instanceof Dog){
            Dog d = (Dog)b;
        }
        //IndexOutOfBoundsException
        int[] arr = new int[5]; //下标范围0-4
        int index = 5;
        if (index>=0&index<arr.length){
            System.out.println(arr[5]);
        }
        //NumberFormatException
        String str2 = "123abc";
//        System.out.println(Integer.parseInt(str2));
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = p.matcher(str2);
        if (m.matches()){
            System.out.println(Integer.parseInt(str2));
        }

    }
}

class Animal{

}
class Dog extends Animal{

}
class Cat extends Animal{

}