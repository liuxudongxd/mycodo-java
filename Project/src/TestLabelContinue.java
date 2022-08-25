/**
 * 带标签的continue，帮助我们从内部循环调到外部循环
 */
public class TestLabelContinue {
    public static void main(String[] args) {
        outer:for (int i = 101;i<150;i++){
            for (int j = 2;j<i/2;j++){
                if(i%j==0){
                    continue outer;
                }
            }
            System.out.println(i+" ");
        }
    }
}
