package com.kunkun;
//测试Object[][]二维数组存储表格
import java.util.Arrays;
public class Test07 {

    public static void main(String[] args) {
        Object[] a1 = {1001,"蔡徐坤",18,"鸡哥","唱"};
        Object[] a2 = {1002,"鲲鲲",23,"基尼太美","跳"};
        Object[] a3 = {1003,"ikun",25,"你干嘛","rap"};
        Object[][] emps = new Object[3][];
        emps[0] = a1;
        emps[1] = a2;
        emps[2] = a3;
        System.out.println(Arrays.toString(emps[0]));
        System.out.println(Arrays.toString(emps[1]));
        System.out.println(Arrays.toString(emps[2]));

        System.out.println("===============");
        for (int i =0;i<emps.length;i++){
            for (int j =0;j<emps[i].length;j++){
                System.out.print(emps[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
