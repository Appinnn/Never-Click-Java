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
		
		
		int tot = rm.getTotal();
		int avg = rm.avg(tot);
		System.out.println( tot +" "+ avg);
		
		/*
		 * �ֻ��� ����
		 * j���ذ� s�����̰� �ֻ��� ������ �Ѵ�.
		 * �ֻ����� �ϳ�, �����̴�.
		 * �ֻ����� ���� ū ����� �̱��.
		 * 
		 * �ֻ��� �� ���ϴ� �޼���
		 * 
		 * �ֻ��� �� ���Ͽ� ���� �̰���� ����ϴ� �޼���
		 * 
		 */
	}

}

class ReturnMth
{
	int getTotal()
	{
		int kor=89, eng=78, mat=50;
		return (kor+eng+mat);
	}
	int avg(int tot)
	{
		
		
		return ���/3;
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
