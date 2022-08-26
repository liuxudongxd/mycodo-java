//测试字符串
public class TestString {

    public static void main(String[] args) {
        String s0 = null;
        String s1 = ""; //空字符串
        String s2 = "java";
        String s3 = new String("java");
        String s4 = new String();
        System.out.println(s1.length());
        System.out.println(s2.length());
//        System.out.println(s0.length());  //会报：空指针异常

        System.out.println("=====字符串相当的问题");
        String g1 = "坤坤";
        String g2 = "坤坤";
        String g3 = new String("坤坤");
        System.out.println(g1==g2);
        System.out.println(g1==g3);
        System.out.println(g1.equals(g3));

    }
}
