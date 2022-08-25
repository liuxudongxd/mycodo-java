/**
 * 测试Switch语句的用法
 */
public class TestSwitch01 {
    public static void main(String[] args) {
        int grade = (int)(Math.random()*4)+1;  //大学的年级
        switch (grade){
            case 1:
                System.out.println("大一");
                break;
            case 2:
                System.out.println("大二");
                break;
            case 3:
                System.out.println("大三");
            default:
                System.out.println("大四");
        }

        if(grade==1){
            System.out.println("大一");
        }else if(grade==2){
            System.out.println("大二");
        }else if(grade==3){
            System.out.println("大三");
        }else{
            System.out.println("大四");
        }


    }
}
