/**
 * 使用while/for循环0-130之间的数字，每行显示5个数字
 */
public class Pring0_130 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;  //每行打印了几个数
        while (i<=130){
            System.out.print(i+"\t");
            /*if (i%5==0){
                System.out.println();
            }*/
            count++;
            if(count==5){
                System.out.println();
                count = 0;
            }
            i++;
        }


    }
}
