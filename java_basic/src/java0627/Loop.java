package java0627;

import java.util.Scanner;

public class Loop {
	
	static Scanner sc = new Scanner( System.in );

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
		
//		System.out.println( "���ڸ� �Է��ϼ���" );
		
//		int num = sc.nextInt();
//		int sum =0;
//		for(int i=1; i<=num; i++)
//		{
//			sum = sum+i;
//			System.out.println(sum);
//			
//		}
		
		// �ݺ����� �ۼ��Ϸ��� ��� �ݺ��Ǵ°�, ���� �ݺ����� ����Ǿ�� �ϴ°�
		// �ݺ��� ��������� ���ؼ� ���� �����ؾ��Ѵ�.
		// for��, while��,  do~while�� ��� ���� �ݺ��� ������ �ϴ°� ��
		// ã�����ϸ� �ۼ� �� �� ����. (���� �����̵�, n�� �ݺ� �̵�)
//		int num1 = -1;
//		for( ; num1 != 0; )
//			{
//				System.out.print( "���� �Է�" );
//				num1 = sc.nextInt();
//				
//			}
		
		// ���ѷ��� ���� ��Ű�� ���
		// 1. if���� ���ǽ��� �� �̵Ǹ� break ���� 
		// 2. for(; ���ǽ�; )
		// 3. return; - �ݺ��� �ڵ尡 �ִ� �޼ҵ带 �����Ű�� ������ �ݺ����� ���� �ȴ�.
		// 4. break; - �ݺ���, switch�� ��밡��   if�� �ܵ����� break ���Ұ�
		// if( 10>5 ) break; <<-- ��� �Ұ�
		
		// continue; - ���� �ݺ��� �ߴ��ϰ�, ���� �ݺ����� �Ѱ���
		
//		for( int i=1; i<=10; i++ )
//			{
//				System.out.println( i+"��° �ݺ� ����" );
//				if( i%3 == 0 )
//					continue;
//				System.out.println( i+"��° �ݺ� ������" );
//				System.out.println( i+"��° �ݺ� ����������" );
		
		// �ڹ��� ����
		
		// ������ ����( 1~50 )
		// ���� �� ��� ���
		// �������� 11�� ��� �� ��� �ݺ��� ����
//		int random = (int) Math.floor(Math.random()*50)+1;
//		for( ; true; )
//			{
////				int num1 = (int)Math.floor(Math.random()*50)+1;
//				int num1 = (int) (Math.random()*50)+1;
//				if( num1 %11 == 0) 
//					break;
//				System.out.println(num1);
//				
//			}
		
		
		// up & Down
		// ��ǻ�� �� ������ ���� ���߱�
		// ��ǻ�Ͱ� �����ϴ� ���ڴ� �������� (�������� 20~100)
		// ��ǻ�Ͱ� ������ ���ڰ� 74���
		// ���� �Է��� ���ڰ� 40�� ��� up�̶�� ���
		// ���� �Է��� ���ڰ� 80�� ��� Down�̶�� ���
		
//		int com = (int) (Math.random()*81)+20;
//		
//		for( int i=1; true; i++ )
//			{
//				System.out.println("���ڸ� �Է��ϼ��� : ");
//				int user = sc.nextInt();
//				if(user == com )
//				{
//					System.out.println(" ����! \n ��ǻ�� : "+com);
//					break;
//				}
//				else if(user<20)
//				{
//					System.out.println("20���� ū ���� �Է��ϼ���");
//				}
//				else if(user>100)
//				{
//					System.out.println("100���� ���� ���� �Է��ϼ���");
//				}
//				else if(user < com )
//				{
//					System.out.println("Up");
//					
//				}
//				else if( user > com )
//				{
//					System.out.println("Down");
//					
//					
//				}
//				
//				i++;
//			}
		
		// �̸��� �ִ� �ݺ���
		int sum = 0;

			���ϱ�:for( int i=1; i<=10; i++)
					{
					for( int k=1; k<=4; k++)
					{
						if( sum + k >= 40 ) continue ���ϱ�;
						sum = sum+k;
						
						System.out.println(" " + k);
					}
					System.out.println(i);
					sum = sum +i;
				}
				
				if(sum < 40 )
				{
					System.out.println( sum );
				}
				

				// ����Ų��� 31
				// ��ǻ�Ϳ� ���ϰ� ���� �Ѵ�.
				// �ѹ��� ������ �� �ִ� ���ڴ� �ּ� 1��, �ִ� 3��
				// 31�� �Է��ϸ� �й�
				
				int num = 1;
				����Ų:
				for(;;) //while(true)
				{
					System.out.println("���� � : ");
					int user = sc.nextInt();
					System.out.print("�� : ");
					for( int u = 1; u<=user; u++)
					{
						System.out.print( num + " " );
						if( num == 31) break ����Ų;
						num++;
					}
					
					System.out.println();
					
					int com = (int) (Math.random()*3)+1;
					System.out.println( "��ǻ�� : ");
					for( int c = 1; c<=com; c++)
					{
						System.out.print( num + " " );
						if( num == 31) break ����Ų;
						num++;
					}
					
					System.out.println();
				}
			
			
			
			
			
			
			}
		}	

	
