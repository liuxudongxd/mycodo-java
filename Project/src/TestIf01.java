/**
 * 测试if的单分支结构
 * 写个掷骰子游戏
 *      1.如果三次的值加起来大于15，则手气不错。
 *      2.如果三次的值在：10-15之间，一般。
 *      3.如果三次的值在：10以下，手气差。
 */
public class TestIf01 {

    public static void main(String[] args){

        //int rand = (int) (Math.random()*6+1);
        //System.out.println(rand);
        int a = (int) (Math.random()*6+1);
        int b = (int) (Math.random()*6+1);
        int c = (int) (Math.random()*6+1);

        int count = a+b+c;
        System.out.println("第一次是:"+a);
        System.out.println("第二次是:"+b);
        System.out.println("第三次是:"+c);

        if (count>15){
            System.out.println("今天手气不错！再来一把！");
        }
        if (count>=10&&count<=15){
            System.out.println("手气一般！在来两把！");
        }
        if (count<10){
            System.out.println("手气不行！回家吧！");
        }

        System.out.println("今日的得分："+count);

    }

}
