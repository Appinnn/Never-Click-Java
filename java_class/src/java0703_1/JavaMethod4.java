package java0703_1;

import java.util.Scanner;

public class JavaMethod4 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner( System.in );
		// �޼��带 ���ؼ� ���� 10�� �޾� ����ϼ���
		ReturnMth rm = new ReturnMth();
		
		int result = rm.sum();
		System.out.println( result );
		
		//���� ����ǥ�� �� �ڵ带 �ۼ��Ͽ� �̸��� ���̰� ��µǰ� �ϼ���
		String userName = rm.getName();
		int age=34;
		System.out.println( userName +" "+ age );
		
		// ����, ����, ���� �� ������ ������ ���ϴ� �޼���
		// �� ������ ����� ���ϴ� �޼���
		// ������ ����� ����ϼ���
		System.out.println("���� ������ �Է��ϼ��� : ");
		int kor = scan.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int eng = scan.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int mat = scan.nextInt();
	}

}

class ReturnMth
{
	int total()
	{
		int kor, eng, mat;
		
	}
	String getName()
	{
		String userName = "�̼���";
		return userName;
	}
	int sum()
	{
		int num1 = 30, num2 = 45;
		int result = num1 + num2;
		return result;
	}
	int get()
	{
		return 10;
	}
}
