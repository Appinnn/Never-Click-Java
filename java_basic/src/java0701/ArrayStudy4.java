package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy4 {
	
	static Scanner sc = new Scanner( System.in );

	public static void main(String[] args) 
	{
		// ���� ���� �����͸� �ٷ궧�� �迭�� ����Ѵ�.
		// ��Ȳ�� ���󼭴� �迭�� ���� �ȵǴ°�쵵 ������,
		// ������ ���� ������ �����͸� ���� �Ѵ�.
		// 
		// ���� �迭 �����
		// ������ �迭 ũ�⸦ �ø��ų�, �ٿ��� ����ϴ� �迭
		
//		int a[] = new int[5];
//		
//		a[0] = 10;  a[1] = 20; a[4] = 40;
//		System.out.println(Arrays.toString(a));
//		
//		a= new int[7];
//		a[5] = 100;
//		System.out.println(Arrays.toString(a));
		
//		int num[] = new int[] {10,20,30,40,50};
//		System.out.println("ũ�� ���� �� : " + Arrays.toString(num));
//		
//		// num[5] = 60; �ε��� ������ ����� ����
//		// �����͸� �߰��� �� ���� �Ϸ��� �迭�� ũ�⸦ �÷��� �Ѵ�.
//		int size = num.length; // ���� �迭�� ũ��
//		
//		int temp[] = new int[size+2];
//		for( int i=0; i<size; i++ )
//			{
//				temp[i] = num[i];
//			}
//		num = temp;
//		num[5] = 60;
//		num[6] = 70;
//		System.out.println("ũ�� ���� �� : " + Arrays.toString(num));
		
		// ���ڿ����� ���� �񱳴� .equals() �� �Ѵ�.
		// ���ڿ��� Ư�� ���ڳ� ���ڿ� ���Կ��δ� .contains()
		// ���� �ּ��� ��ȭ���� �ּҸ� �����Ͽ� �迭�� ����
		// �迭�� �� ����Ǿ����� Ȯ�� �� ����� Arrays �̿��Ͽ� ���
		
		
//		String addr[] = new String[] {"���� �߱� ��ȭ�� 25","���� �߱� ��ȭ�� 92","���� ���� �л굿 111"
//										,"���� ���� �л굿 1023","���� ������ ������ 93","���� �߱� ���ﵿ 932"
//										,"���� ���� ���絿 945","���� �߱� ��ȭ�� 1234","���� �߱� ���ﵿ23"
//										,"���� �߱� ��ȭ�� 984"}; 
//		
//		// addr �迭�� ũ�⸸ŭ �����ϱ�, ��ȭ�� ī���� �� ��ŭ ����
//		String search[] = new String[addr.length];
////		String search = sc.nextLine();
//		int index = 0;
//		for(int i=0; i<addr.length; i++)
//			{
//				if(addr[i].contains("��ȭ��"))
//					{
//						search[index++] = addr[i];
//						
//					}
//				
//			}
//		
//		System.out.println(Arrays.toString(search));
		
		// 2���� �迭
		// 1���� �迭�� ������ 1���� �迭�� �����س��� ����
		
//		int[][] arr = new int[5][3];
//		
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[0][2] = 30;
//		arr[1][0] = 40;
//		arr[2][1] = 50;
//		// ����б� 1�г� �л����� ����
//		// 1�г��� 1�ݺ��� 6�ݱ��� �ִ�.
//		// new int[6][30];
//		
//		int a[] = new int[] {10,20,30,40,50,60,70,80,90,100};
//		
//		for( int data : a) // forEach , each
//			{
//				System.out.println( data );
//			}
		
		int[][] array1 = new int[2][3];
		System.out.println(array1.length);
		System.out.println(array1[0].length);
		System.out.println(array1[1].length);
		System.out.println();
		
		int[][] array2 = new int[][] {{1,2} , {3,4,5}};
		System.out.println(array2.length);
		System.out.println(array2[0].length);
		System.out.println(array2[1].length);
		System.out.println();
		
		System.out.print(array2[0][0] + " ");
		System.out.print(array2[0][1] + " ");
		System.out.println();
		System.out.print(array2[1][0] + " ");
		System.out.print(array2[1][1] + " ");
		System.out.print(array2[1][2]);
		System.out.println();
		
		for( int i=0; i<array2.length; i++)
		{
			for(int j=0; j<array2[i].length; j++)
				{
					System.out.print(array2[i][j] + " ");
				}
			System.out.println();
		}
		System.out.println();
		
		for(int[] array: array2)
			{
				for(int k:array)
				{
					System.out.print(k + " ");
				}
				System.out.println();
			}
		
		

	}

}
