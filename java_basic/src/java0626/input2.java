package java0626;

import java.util.Scanner;

public class input2 {

	public static void main(String[] args) 
	{
		/* ���ڿ� - " " ū����ǥ�� ǥ���Ͽ� �ۼ��Ѵ�.
		 * ���ڿ��� String Ŭ����Ÿ���� ����ؾ��Ѵ�.
		 * �ڵ� �ۼ��ϱ����� �ؾ����� - �����ľ�, �䱸���׵���
		 * 
		 * ����2.
		 * ���� �̸�, �ҼӺμ���, �� �޿��� �� Ű���带 ���� �Է¹޴´�.
		 * ������ 8%�� ����. �Ǽ��ɾ��� ������ ���
		 * �̸�,�μ�,�Ǽ��ɾ� ����ϼ���
		 * �θ��� ������ ���� ����ϼ���
		 * */
		
		Scanner sc = new Scanner( System.in);
		System.out.println("����1�� �̸���? : ");
		String ����1 = sc.next();
		System.out.println("����1�� �ҼӺμ���? : ");
		String �μ�1 = sc.next();
		System.out.println("����1�� �� �޿�����? : ");
		int ���޿�1 = sc.nextInt();
		
		System.out.println("����2�� �̸���? : ");
		String ����2 = sc.next();
		System.out.println("����2�� �ҼӺμ���? : ");
		String �μ�2 = sc.next();
		System.out.println("����2�� �� �޿�����? : ");
		int ���޿�2 = sc.nextInt();
		
		float ���� = 8;
		float ������ = ����/100;
		float ����1 = ������*���޿�1;
		float ����2 = ������*���޿�2;
		
		float �Ǽ��ɾ�1 =���޿�1-����1; 
		float �Ǽ��ɾ�2 =���޿�2-����2; 
		
		System.out.println(" ����1�� �̸� : " + ����1 +"\n ����1�� �ҼӺμ� : " + �μ�1
							+"\n ����1�� ���� �� ���ɾ� : " + �Ǽ��ɾ�1+"����");
		System.out.println(" ����2�� �̸� : " + ����2 +"\n ����2�� �ҼӺμ� : " + �μ�2
				+"\n ����2�� ���� �� ���ɾ� : " + �Ǽ��ɾ�2 +"����");
		
		
		
	}

}
