/**
 * ���Լ������룺Scanner�÷�
 */
import java.util.Scanner;

public class TestScanner{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		System.out.println("�������û���");
		String uname = s.nextLine();

		System.out.println("�������:");
		int age = s.nextInt();

		System.out.println("�����н��");
		double monthSalary = s.nextDouble();

		System.out.println("�û���:"+uname);
		System.out.println("���䣺"+age);
		System.out.println("��н��"+(12*monthSalary));



	}
}