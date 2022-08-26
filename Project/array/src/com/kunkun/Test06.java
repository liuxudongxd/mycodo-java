package com.kunkun;

import java.lang.reflect.Array;
import java.util.Arrays;

//测试多维数组的初始化
public class Test06 {

    public static void main(String[] args) {
        //Java中多维数组的声明和初始化应按从低维到高维的顺序进行
        int [] [] a = new int[3][];
        a[0] = new int[2];
        a[1] = new int[4];
        a[2] = new int[3];
        //  int a1[][]=new int[][4];//非法
        a[0][0] = 100;
        a[0][1] = 200;

        int [][] b = {{1,2,3},{3,4},{3,5,6,7}};
        System.out.println(b[2][2]);


        int [] [] c = new int[3][];
        //c[0] = {1,2,3};//错误没有声明类型就初始化
        c[0] = new int[] {1,2};
        c[1] = new int[] {2,2};
        c[2] = new int[] {2,2,3,4};
        System.out.println(c[2][3]);
        System.out.println(Arrays.toString(c[0]));
        System.out.println(Arrays.toString(c[1]));
        System.out.println(Arrays.toString(c[2]));
    }
}
