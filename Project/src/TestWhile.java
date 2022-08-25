/**
 * 测试while语句
 */
public class TestWhile {
    public static void main(String[] args) {
        /**System.out.println("i love u");
        System.out.println("i love u");
        System.out.println("i love u");
        */
        /*int a = 0;
        while (a<3){
            System.out.println("I love u----"+a);
            a++;
        }*/

        //累加：1+2+3..+100
        int a = 1;
        int sum = 0;
        while (a<101){
            sum = sum + a;
            a++;
        }
        System.out.println("1到100累加的和："+sum);


    }
}
