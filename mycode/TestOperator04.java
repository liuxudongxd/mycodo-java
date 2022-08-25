/**
 * 测试逻辑、关系运算符的用法
 */
public class TestOperator04{
	public static void main(String[] args){
		//测试逻辑运算符
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1&b2);	//与：有一个false，结果false
		System.out.println(b1|b2);	//或：有一个true，结果true
		System.out.println(!b2);	//取反
		System.out.println(b1^b2);	//异或：相同false，不同true

		//短路与、短路或
		//int b3 = 3/0;	会报不能除以0的异常
		boolean b3 = 1>2 && (4>3/0);
		System.out.println(b3);
		//短路前面判断完后面不判断了


	}
}