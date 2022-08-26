package com.kunkun;
//测试数组的三种初始化方式
public class Test02 {
    public static void main(String[] args) {
        //静态初始化
        int []a = {10,20,30,40};
        Man mans[] = {  new Man(10,1),
                        new Man(20,2),
                        new Man(30,3)};
        System.out.println(a[1]);
        System.out.println(mans[2].getAge());

        //默认初始化
        int a2[] = new int[2];  //默认值:0,0
        boolean[] b = new boolean[2];   //默认值:false,false
        System[] s = new System[2]; //默认值:null,null
    }

}
