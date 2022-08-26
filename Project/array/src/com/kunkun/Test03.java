package com.kunkun;
//测试遍历
public class Test03 {

    public static void main(String[] args) {
        String[] cities = {"北京","上海","广州","浙江"};

        for (int i = 0;i< cities.length;i++){
            String t = cities[i];
            System.out.println(t);
        }
        //只用于简单的读取数组中的内容
        for (String t:cities){
            System.out.println(t);
        }
    }


}
