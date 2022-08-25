public class TestConstant{

	public static void main(String[]args){
		final double PI = 3.14;
		//PI =3.1415; //无法为常量再次赋值
		final double MAX_SPEED = 120; 

		int r = 4;
		double area = PI*r*r;
		double circle = 2*PI*r;
		System.out.println("面积是："+area);
		System.out.println("周长是:"+circle);
		System.out.println(PI);
		System.out.println(MAX_SPEED);


	}






}