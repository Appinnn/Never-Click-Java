package study1;

import java.util.Arrays;
import java.util.Scanner;

public class MainStudy {

	public static void main(String[] args) 
	{
		// ���� ������ 12�� ������ �� �ִ� �迭 �����
		
//		int[] num = new int[12];
//		
//		// 5�� �Ǽ� ������ ������ �� �ִ� �迭 �����
//		
//		float[] arr = new float[5];
//		
//		// 4���� �̸��� ���� �� �� �ִ� �迭 �����
//		
//		String[] name = new String[4];
//		
//		Member[] mem = new Member[120];
		
		// ���� ������ 42�� ���� �Ѵ�.
		// 10,20,30,40,50 �� �迭�� ����
//		int[] num = new int[5];
//		num[0] = 10; num[1] = 20; num[2] = 30; num[3] = 40; num[4] = 50;
//		
//		for(int i=0; i<num.length; i++)
//		{
//			System.out.println(num[i]);
//			
//		}
		
		int[] width = new int[] {10,20,30,44,55,11,22,33,66,77};
		
		for( int i=0; i<width.length; i++ )
		{
			System.out.println( width[i] );
		}
		
		String[] we = new String[] {"�̼���","������","������","�庸��","�念��","�̻��",
									"�̼���","���","��������"};
		
		for( int i=0; i< we.length; i++ )
		{
			System.out.println(we[i]);
		}
		
		// 7�� ������ ������ �迭
		int[] seven = new int[7];
		Scanner sc = new Scanner(System.in);
		
//		for( int i=0; i < seven.length; i++)
//		{
//			System.out.print("���� �Է� : ");
//			seven[i] = sc.nextInt();
//		}
		
		// 6���� �����Ը� �Է��ϼ���(�Ҽ���1�ڸ�������)
		// �Է��ϰ� ��±���
		
//		float[] weight = new float[6];
//		for(int i=0; i<weight.length; i++)
//		{
//			System.out.println("�����Ը� �Է��ϼ��� : ");
//			weight[i] = sc.nextFloat();
//			
//		}
//		// �����԰� ����� �迭���� �����԰� 50�̻� ���
//		for(int i=0; i<weight.length; i++)
//		{
//			if(weight[i] >= 50)
//				System.out.println( (i+1)+"�� : " + weight[i] + "Kg" );
//		}
		
		// number �迭�� �� ���
		// ¦�� �� ��� �ϼ��� - ��Ʈ %2
		int[] number = new int[]
			{
				55,44,33,88,99,54,14,28,91,4,6,9
			};
		for(int i=0; i<number.length; i++)
		{
			if(number[i]%2 == 0)
			{
				System.out.println(number[i]);
			}
		}
	}

}

class Member
{
	int age = 10;
}






