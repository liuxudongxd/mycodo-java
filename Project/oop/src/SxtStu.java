/**
 * 一个学生类
 */
public class SxtStu {
    int id;
    int age;
    String sname;

    public void study(){
        System.out.println("唱");
    }
    public void jump(){
        System.out.println("跳");
    }
    public void rap(){
        System.out.println("rap");
    }
    public void lanqiu(){
        System.out.println("打篮球");
    }

    public static void main(String[] args) {
        SxtStu kunkun = new SxtStu();
        kunkun.sname = "蔡徐坤";
        kunkun.age = 24;
        kunkun.id =10001;
        System.out.println(kunkun.sname);
        System.out.println(kunkun.age);
        System.out.println(kunkun.id);
        kunkun.study();
        kunkun.jump();
        kunkun.rap();
        kunkun.lanqiu();
    }

}

