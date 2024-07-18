package java_thread1;

import java.util.Scanner;

public class MainClass1 
{

	public static void main(String[] args) 
	{
		// ������ ��ü ����
		MyThread th = new MyThread(); 
		// ������ ����
		th.start(); 
		
		for(int i=1; i<=10; i++)
		{
			System.out.println( "    ���� Main " + i );
			try 
			{
				Thread.sleep(1500);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println( "���� �Է� : " );
//		int num = sc.nextInt();
//		System.out.println( num );
		
		
	}

}

class MyThread extends Thread
{	
	@Override
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println( "�� �������! " + i );
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}


/*
 	���μ��� - CPU�� ���� �޸�(ram)�� �ε� �Ǿ� �ִ� ���α׷��� ���Ѵ�.
 		��, �������� ���α׷� ���� ���μ����̴�.
 			102���� ���μ����� �ִ�. ��� ���� 102���� ���α׷��� �������̴� ��� ����̴�.
  		1. �۾������� - ���μ������ ���� �ִ�.
  		2. ���������Ʈ â�� ����( �����⿡�� cmd��� �˻� �Ǵ�, ctrl+r �ϰ� cmd �Է� ����)
  			������ - tasklist ��ɾ� 
  			�� or ������ - �͹̳� ��� ps -e
  			
  			���μ��� ���� - taskkill /pid[pid��]
  			�� or ������ - pkill -9 -f ���μ����̸�
  					  - sudo kill ���μ�����ȣ
  					  
  	������ - ���μ��� �ȿ��� ���� ������ �����ϴ� ����
  			�����带 �߰� �ϸ� ���ÿ� ���� ���� ������ ���� �� �� �ִ�.
  			
  	�ڹ� ������
  	������ ������
  	Thread(); : ���ο� ������ ��ü �Ҵ�
  	Thread("�̸�") : ���ο� ������ ��ü�� �Ҵ� �ϸ鼭 �̸��ο�

 
 */
















