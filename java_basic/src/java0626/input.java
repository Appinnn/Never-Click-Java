package java0626;

import java.util.Scanner;

public class input {

	public static void main(String[] args) 
	{
//		System.out.println( "�ڹ� ���" );
		//	 System.in -> �Է� , System.out -> ���
		// �Է� ������ �ִ� ���� Ŭ���� - Scanner
		Scanner scan = new Scanner( System.in );
		
		// float Ÿ�� - .nextFloat()  double Ÿ�� - .nextDouble()
		// byte Ÿ��  - .nextByte()  short Ÿ��   - .nextShort();
		// char �� ����.
		// ���ڿ� �Է� - NextLine(); , next();
		
//		int a = scan.nextInt();
//		System.out.println( a );
//		
		// ������ ���ְ� �Ծ�����
		// ö���� ������ �Ա����� �������� ����.
		// ��Զ��� �ﰢ���, �ٳ��������� �Ծ���.
		// ö���� ���ɰ����� ������ �ݾ��� ���ΰ�?
//		System.out.print("��Զ���� ������? : ");
//		int ramen = scan.nextInt();
//		System.out.print("�ﰢ����� ������? : ");
//		int gimbap = scan.nextInt();
//		System.out.print("�ٳ��������� ������? : ");
//		int milk = scan.nextInt();
//		
//		int total = milk + gimbap + ramen;
//		
//		System.out.println("�� ���� �ݾ� : " + total + "��");
		// System.out.printf("�� ���� �ݾ� : %d �� \n", total);
		
		// �μ��� ģ������ ���������� ���Դ�.
		// ���ͼ� ���� ������ ���� �ͼ� ���� �ٽ� ���ٿԴ�.
		// �̹����� �Ź��� ¦¦�̷� �ž �ٽ� ���� ���� �Դ�.
		// �μ��� ���� 5���̴�. �μ��� 1�� �ö󰡴µ� 3.4�ʰ� �ɸ���.
		// �μ��� ���� ���� ���Դ� �ϴµ� �ɸ� �� �ð��� ����?
		
//		float ���� = 3.4f;
//		float �μ��պ�Ƚ�� = 2;
//		float ���簡����Ƚ�� = 2;
//		float ����պ� = ���簡����Ƚ�� * ����;
//		float �μ��� = 5;
//		
//		float �Ѱɸ��ð� = ����պ� * (�μ���-1) * �μ��պ�Ƚ��;
//		
//		System.out.println( "�� �ɸ��ð� : "+ �Ѱɸ��ð� + "��" );
//		
		// ���α׷� �ڵ�� �⺻ ���������� ����ȴ�.
		// ���ǹ� , �Լ�(�޼ҵ�), �ݺ��� , goto��

		
		/*
		 * �������� ������ ����,�Ǽ�,����, boolean(��,����)
		 * ������ Ÿ��
		 * 		���� - byte, short, int, long
		 * 		���� - char
		 * 		�Ǽ� - float, double
		 * 		������ - boolean
		 * 	
		 * ���� ������ - ������Ÿ�� �����̸�;
		 * int num; 	 ���� Ÿ�� ���� ����
		 * double dnum;  �Ǽ� Ÿ�� ���� ����
		 * char ch; 	 ���� Ÿ�� ���� ����
		 * boolean bool; �� ���� ���� ����
		 * 
		 * ������ �ʱ�ȭ
		 * int num = 10; ���� ����� �Բ� �����͸� ����
		 * 
		 * ��¹��
		 * System.out.println( ��³��� );
		 * System.out.print( ��³��� );
		 * System.out.printf( ��³��� );
		 * 
		 * printf ���� �Բ� ����ϴ� ����������
		 * 		%d, %u  - ����
		 * 		%f	    - �Ǽ�
		 * 		%c		- ����
		 * 		%s		- ���ڿ�
		 * 
		 * int age = 28;
		 * System.out.printf("%s ������ ���̰�%d���� ���������� %c��",
		 * 						"�ڵ���", age, "��");
		 * 
		 * �Է¹��
		 * Scanner Ŭ���� ��ü �ʿ�
		 * Scanner ���� = new Scanner( System.in );
		 * 	*Scanner Ŭ������ ����ܺ� Ŭ���� �̹Ƿ� import �ؾ��Ѵ�.
		 * 
		 * 		����.nextInt();    - int Ÿ�� ������ �Է�
		 * 		����.nextByte();   - byte Ÿ�� ������ �Է�
		 * 		����.nextShort();  - short Ÿ�� ������ �Է�
		 *		����.nextLong();   - longŸ�� ������ �Է�
		 *		����.nextFloat();  - floatŸ�� �Ǽ��� �Է�
		 *		����.nextDouble(); - double Ÿ�� �Ǽ��� �Է�
		 *		����.next();       - ���ڿ� �Է�
		 *		����.nextLine();   - ���ڿ� �Է�
		 *
		 *	C���, �ڹ�, �����а��� ������ ������ �Է��ϼ���
		 *	�������� ������ ����� ���� ����ϼ���.
		 * */
		
		int C���, �ڹ�, �����а��� ;
		System.out.print("C����� ������ �Է��ϼ��� : ");
		C��� = scan.nextInt();
		System.out.print("�ڹ��� ������ �Է��ϼ��� : ");
		�ڹ� = scan.nextInt();
		System.out.print("�����а����� ������ �Է��ϼ��� : ");
		�����а��� = scan.nextInt();
		int ���� = C��� + �ڹ� + �����а���;
		float ��� = ����/3;
		
		System.out.println("C��� : " + C��� +"��" + "\n �ڹ� : " + �ڹ�+"��"  + "\n �����а��� : " 
							+�����а���+"��" + "\n ��� : " + ��� + "��" );
		
	}

}
