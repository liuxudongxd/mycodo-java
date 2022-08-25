public class TestInt{
	public static void main(String[] args){

	int a = 100; // 10进制
	int b = 015; // 8进制
	int c = 0xff;	//16进制
	int d = 0b1000;	//2进制
	byte e = 127; //byte类型不能大于127
	short f= 32767;	// short类型不能大于32767

	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);

	int salary = 30000;	//整型常量默认类型是int
	long yearSlary = 3000000000L; //把整型常量定义为long类型
	System.out.println(yearSlary);

	}

}