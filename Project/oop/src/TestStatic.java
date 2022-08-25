/**
 * 测试Static
 */
public class TestStatic {
    int id; //id
    String name;    //用户名

    static String company = "基尼太美"; //公司名称
    public TestStatic(int id,String name){
        this.id = id;
        this.name = name;
    }
    public void login(){
        System.out.println(name);
    }
    public static void PrintCompany(){
        //login();    //调用非静态成员，编译会报错
        System.out.println(company);
    }

    public static void main(String[] args) {
        TestStatic U = new TestStatic(100,"旭旭");
        TestStatic.PrintCompany();
        TestStatic.company = "鸡你试试太美";
        TestStatic.PrintCompany();
    }
}
