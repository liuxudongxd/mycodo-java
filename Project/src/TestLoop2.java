/**
 *测试嵌套循环
 */
public class TestLoop2 {
    public static void main(String[] args) {
        /*for (int m = 1;m<=5;m++){
            for (int i = 0;i<5;i++){
                System.out.print(m+"\t");
            }
            System.out.println();
        }*/
        //1*3=3 2*3=6 3*3=9
        for (int m = 1;m<=9;m++){
            for (int n = 1;n<=m;n++){
                System.out.print(n+"*"+m+"="+(n*m<10?(" "+n*m):m*n)+"\t");
            }
            System.out.println();
        }

        //1*4=4 2*4=8 3*4=12 4*4=16
        /*for (int n = 1;n<=4;n++){
            System.out.print(n+"*"+4+"="+(n*4)+"\t");
        }*/
        int count = 0;
        for (int m = 1;m<=5;m++){
            for (int i = 0;i<5;i++){
                if ((m+i)%2==1) {
                    System.out.print("*\t");
                }else{
                    System.out.print("#\t");
                    }
                }
            System.out.println();
            }


    }
}