import java.lang.management.ManagementFactory;

/**
 * 测试多分支结构
 */
public class TestIf03 {
    public static void main(String[] args) {
        int age = (int) (120*Math.random());
        System.out.println("年龄是："+age);
        //15以下(不含15)：儿童，15-24青年，25-44中年，45-64中老年，65-84老年，85-99老寿星
        //100-109百岁老人,110以上，申请国家纪录
        if(age<15){
            System.out.println("儿童");
        } else if(age<25){
            System.out.println("青年");
        } else if(age<45){
            System.out.println("中年");
        } else if(age<65){
            System.out.println("中老年");
        } else if(age<85){
            System.out.println("老年");
        } else if(age<100){
            System.out.println("老寿星");
        } else if(age<110){
            System.out.println("百岁老人");
        } else {
            System.out.println("世界纪录");
        }





    /**int a = (int) (Math.random()*6+1);
    int b = (int) (Math.random()*6+1);
    int c = (int) (Math.random()*6+1);

    int count = a+b+c;
        System.out.println("第一次掷骰子"+a);
        System.out.println("第二次掷骰子"+b);
        System.out.println("第三次掷骰子"+c);

    if(count>15){
        System.out.println("运气特别好");
    }else if(count>=10){
        System.out.println("运气不错");
    }else{
        System.out.println("运气真差");
    }
        System.out.println("今日得分"+count);

    /**if (count>=10&&count<15){
        System.out.println("运气不错");
    }
    if(count>15){
        System.out.println("运气真差");
    }
    */
    }
}
