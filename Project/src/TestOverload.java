/**
 * 测试方法的重载
 */
public class TestOverload {
    public static void main(String[] args) {
        add(10,20);
        add(10);
        add(3.14);
        add(3.14,10);
    }

    static void add(int a,int b){

    }
    static void add(int a){

    }
    static void add(double a){

    }
    static void add(double a,int b){

    }
}
