/**
 * 薪水计算器
 * (1)通过键盘输入用户的月薪，每年是几个月的薪水。
 * (2)输出用户的年薪
 * (3)输出一行字"如果年薪超过10万，恭喜你超越90%的国人"，"如果年薪超过20万，恭喜你超越98%的国人"。
 * (4)直到键盘输入数字88，则推出程序（使用break退出循环）
 * (5)键盘输入66，则这个用户退出计算不显示"恭喜.."，直接显示"重新开始计算..“，然后算下一个用户的年薪。
 */
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("******薪资计算器******");
        System.out.println("1.输入88，退出程序\n2.输入66，计算下一个年薪");

        while (true){
            System.out.println("请输入年薪");
            int monthSalary = s.nextInt();
            System.out.println("请输入一年几个月薪资");
            int months = s.nextInt();
            int yearSalary = monthSalary*months;    //年薪

            System.out.println("你的年薪是:"+yearSalary);
            if (yearSalary>=200000){
                System.out.println("恭喜你超越98%的国人");
            }else if(yearSalary>=100000){
                System.out.println("恭喜你超越90%的国人");
            }
            System.out.println("输入88，退出系统\t输入66，继续计算");
            int comm = s.nextInt();
            if (comm==88){
                System.out.println("系统退出");
                break;
            }
            if (comm==66){
                System.out.println("继续计算");
                continue;
            }


        }
    }
}
