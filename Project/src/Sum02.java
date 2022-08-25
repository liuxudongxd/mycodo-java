public class Sum02 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int oddSum = 0;
        int evenSum = 0;

        while (i<=100){
            sum += i;   //sum = sum+i
            if (i%2==0){
                evenSum += i;
            }else {
                oddSum += i;
            }
            i++;
        }
        System.out.println(sum);
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
