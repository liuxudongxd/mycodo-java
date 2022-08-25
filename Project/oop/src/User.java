import javax.jws.soap.SOAPBinding;

/**
 * 测试构造方法的重载
 */
public class User {
    int id;
    String name;
    String pwd;

    public User(){

    }

    public User(int _id){
        this.id = id;

    }

    public User(int id,String name){
        this.id = id;
        this.name = name;
    }
    public  User(int id,String name,String pwd){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }


    public static void main(String[] args) {
        User u = new User(1000);
        User u1 = new User(1001,"坤坤");
        User u2 = new User(1002,"ikun","123456");
        System.out.println(u);
        System.out.println(u1);
        System.out.println(u2);

    }
}
