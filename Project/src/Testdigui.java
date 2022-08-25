/**
 * 测试递归
 *
 */
public class Testdigui {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();    //当前时刻
        long result =factorial(5);
        long endTime = System.currentTimeMillis();
        System.out.println(result);
        System.out.println(endTime-startTime);
    }
    //阶乘：5*4*3*2*1
    public static long factorial(int n){
        if (n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }

    }

}
