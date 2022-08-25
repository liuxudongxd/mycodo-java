/**
 * 测试位运算符的用法
 */
public class TestOperator05{
	public static void main(String[] args){
		int a = 7;
		int b = 8;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~b);

	//位移
		int c = 5<<1;	//5*2
		int d = 5>>2;	//5/2
		System.out.println(c);
		System.out.println(d);
		System.out.println(40>>3);	//相当于40/8
	}
}