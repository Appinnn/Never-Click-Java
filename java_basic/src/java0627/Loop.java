package java0627;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) 
	{
		// �ݺ��� - for, while, do~while
		// for(�ʱⰪ; ���ǽ�; ������)
		// {
		//   �ݺ�����
		// }
		// ���ǽ��� ������ �� ������ �߰�ȣ ������ ��� ����ȴ�.
		// ������ �ʱⰪ -> ���ǽĺ� -> **�� �ϰ�� -> �߰�ȣ -> ������ -> ���ǽĺ� -> **�� �ϰ�� -> �߰�ȣ -> ������ -> ���ǽĺ� -> **�����ϰ�� -> ����
		
//		for(int i=1;i<=17; i++)
//		{
//			
//			System.out.println("��...�ݺ���..." + (i));
//			i++;
//			
//		}
		
//		int num = 1;
//		int a=1;
//		num = num + a;
//		System.out.println(num); //2
//		a++;
//		num = num +a;
//		System.out.println(num); //4
//		a++;
//		num = num +a;
//		System.out.println(num); //7
//		
		// 1���� ���� �Է��� ���ڱ����� ������ ���ϼ���.
		
		System.out.println( "���ڸ� �Է��ϼ���" );
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int sum =0;
		for(int i=1; i<=num; i++)
		{
			sum = sum+i;
			System.out.println(sum);
			
		}
	}	

}
