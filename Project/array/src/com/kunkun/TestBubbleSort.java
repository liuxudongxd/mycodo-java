package com.kunkun;
//
import com.sun.javafx.geom.BaseBounds;

import java.util.Arrays;
public class TestBubbleSort {

    public static void main(String[] args) {
        int[] Values = {3,1,6,8,9,0,7,4,5,2};
        System.out.println("原始顺序"+Arrays.toString(Values));
//        bubbleSort(Values);
        bubbleSort2(Values);

    }

    public static void bubbleSort(int[] Values){
        int temp;
        for (int i=0;i< Values.length;i++){
            for (int j=0;j<Values.length-1-i;j++){
                if (Values[j]>Values[j+1]){
                    temp = Values[j];
                    Values[j] = Values[j+1];
                    Values[j+1] = temp;
                }
            }
            System.out.println((i+1)+"趟排序:"+Arrays.toString(Values));
        }
    }

    public static void bubbleSort2(int[] Values){
        int temp;

        for (int i=0;i<Values.length;i++){
            //定义一个布尔类型的变量，标记数组是否已到达有序状态
            boolean flag = true;
            //内层循环:每一趟都从数列前两个元素开始比较，比较到无序数组的最后
            for(int j=0;j<Values.length-1-i;j++){
                //如果前一个元素大于后一个元素，则交换两元素的值
                if (Values[j]>Values[j+1]){
                    temp = Values[j];
                    Values[j] = Values[j+1];
                    Values[j+1] = temp;
                    //本趟发生了交换，表面该数组在本趟处于无序状态，需要继续比较
                    flag = false;
                }
            }
            //根据标记量的值判断数组是否有序，如果有序，则退出，无序，则继续循环
            if (flag){
                break;
            }
            System.out.println((i+1)+"趟排序:"+Arrays.toString(Values));
        }
    }

}
