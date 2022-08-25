/**
 * 测试Static
 */
public class TestStatic2 {
    static String company;  //公司名
    static {
        System.out.println("执行类的初始化工作");
        company = "ikun";
        PrintCompany();
    }
    public static void PrintCompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {

    }

}
