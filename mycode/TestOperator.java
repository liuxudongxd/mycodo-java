public class TestOperator{

	public static void main(String[] args){
		int a = 2;
		int b = 4;
		int c = a + b;

		double d = 3+3.14;
		int d2 = 32/3; //两个整数相除，直接保留结果的整数部分，没有四舍五入
	System.out.println(c);

	//+,-,*,/
	//取余数
	int e = 10%3;	//取余操作。结果符号与左边操作数相同
	System.out.println(e);

	//测试自增自减
	int g = 30;
	g++; // 相当于: g = g + 1 
	g--; // 相当于: g = g - 1

	g = 10;
	int h = g++; //g++先赋值，后自增
	g = 10;
	int i = ++g; //++g先自增，后赋值

	System.out.println(h);
	System.out.println(i);
	}

}