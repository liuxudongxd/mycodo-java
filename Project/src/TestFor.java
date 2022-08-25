/**
 * 测试for循环
 */

public class TestFor {
    public static void main(String[] args) {
        /*
        int a = 0;  //初始化部分
        while (a<3){    //布尔表达式
            System.out.println("I lvoe u---"+a);    //循环体
            a++;    //迭代因子
        }*/
        for (int b = 0;b<3;b++){
            System.out.println("I love U---"+b);
        }
        int sum = 0;
        for (int i = 0;i<=100;i++){
            sum = sum+i;
        }
        System.out.println("总和是"+sum);

        //输出9-1之间的数
        for (int i=9;i>0;i--){
            System.out.print(i + "\t");
        }
        System.out.println();
        //输出90-1之间的数能被3除
        for (int c=90;c>0;c-=3){

            System.out.print(c+"\t");
        }
        System.out.println();
        int numb=0;
        int sum1=0;
        do {
            sum1 += numb;   //sum=sum+numb
            numb++;
        }while (numb<=100);

        System.out.println(sum1);
    }

}
