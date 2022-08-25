/*
*测试浮点数的基本用法



 */
public class TestFloatNumber {
    public static void main (String[] args){
        double a = 3.14;
        double b = 3.14E2; //科学计数法

        float f1 = 3.14f; //浮点常量的默认是double，改float需要后面加f
        //浮点数是不精确的，尽量不要直接比较
        float f2 = 0.1f;
        double c = 1.0/10;
        System.out.println(f2==c); //一个等于号是赋值 两个等于号是比较
        float f3 = 1111111111L;
        float f4 = f3+1;
        System.out.println(f3==f4);
        System.out.println(a);
        System.out.println(b);
        System.out.println(f2);
        System.out.println(c);

    }

}
