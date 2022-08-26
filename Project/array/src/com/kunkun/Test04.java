package com.kunkun;
//测试拷贝
public class Test04 {

    public static void main(String[] args) {
        String[] s = {"唱","跳","rap","篮球","鲲"};
        String[] sBak = new String[6];
        System.arraycopy(s,0,sBak,0,s.length);
        for (int i = 0;i<sBak.length;i++){
            System.out.print(sBak[i]+"\t");
        }



    }
}
