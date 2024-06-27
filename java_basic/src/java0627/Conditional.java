package java0627;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) 
	{
		// ���ǹ� - if, switch
		// �ݺ��� - for , while , do~while
		
		// if���� ���ǽ� - �񱳿����ڿ� �������ڷ� ���� �����.
		//              ��, �� �� ������ ���ü� �ִ� ��
		// Ű�� 150�̻��̴�.     Ű >= 150
		// 10�� �� ���� ���� 	��ü���⳯¥ �� == 10
		// 32000�� �̻��� ���� ���� 	����� >= 32000
		// �Ǹ����� ��ǰ�鸸 ��� 		��ǰ���� == �Ǹ� , ������ > 0
		
		int tall = 135;
		if( tall >= 150)
		{
			// Ű�� 150�̻��� �´ٸ� ������ �� ������
		}
		else
		{
			// Ű�� 150�̻��� �ƴ϶�� ������ �� ������
		}
		
		// ���� �հݱ��� = �հ�(60���̻�), ���հ�(60�� �̸�)
		
		int score = 72;
		if( score >= 60)
		{
			System.out.println("�հ�");
		}
		else
		{
			System.out.println("���հ�");
		}
		
		// if~else - ���ǽ��� ��,������ ���� ����Ǵ� ������ �ٸ����
		// �ϳ��� ���ǿ� �ΰ��� ������ �ִ°�쿡 if~else ������ �ۼ�
		
		//���� ���� ��� - A(90���̻�) , B(80���̻�), C(70���̻�), D(������)
		
		score = 89;
		if( score >= 90 )
		{
			System.out.println( "A" );
		}
		
		else if( score >= 80 )
		{
			System.out.println( "B" );
		}
		
		else if( score >= 70 )
		{
			System.out.println( "C" );
		}
		
		else
		{
			System.out.println( "D" );
		}
		
		
		
		//switch - ���� ������ case�� �����Ͽ� case�� ��ġ�ϴ� ���� ��� �ߵ� �Ǵ� ���ǹ�
		
		// ������ ������ �����. ����Ű�� w a s d �̰�
		// p Ű�� �Ͻ�����, OŰ�� ����ϱ�, iŰ�� ó������ �ٽý���
		// ctrl + s �� ���� �����̶�� �Ѵٸ�
		
		/* 
		 * 	switch(Ű���尪)
		 * {
		 * 		case 'w' : ���೻��
		 * 		case 'a' : ���೻��
		 * 		case 's' : ���೻��
		 *		case 'd' : ���೻�� 
		 *		case 'p' : ���೻��
		 *		case 'o' : ���೻��
		 *		case 'i' : ���೻��
		 *		case 'ctrl' : 
		 *				switch
		 * }
		 * 
		 * 
		 * 
		 * 
		 *  ���α׷� �޴� ����
		 *  	switch(menu)
		 *  	{
		 *  		case "open"  :
		 *  		case "save"  :
		 * 			case "build" :
		 * 			case "git"   :
		 * 			case "exit"  :
		 *  	}
		 *  
		 *  ���ǽ��� == �����ڰ� ���ȴٸ� switch �� �����ϴ°��� ��� �غ���.
		 *  
		 *  
		 *  
		 */
		
		// ���� ��ư�� Ŭ���ϸ� ������ �����ϰ�
		// ���� ��ư�� Ŭ���ϸ� ������ �����ϰ�
		// ���� ��ư�� Ŭ���ϸ� ������ �����Ѵ�.
		
		String button = "����";
		
		switch( button )
			{
				case "����" :
					System.out.println( "���� ����" );
					break;
				case "����" :
					System.out.println( "���� ����" );
					break;
				case "����" :
					System.out.println( "���� ����" );
					break;
			}
		
		// ���ο� ������ ���̸� Ű����� �Է��ϼ��� (������ �Ű澲������)
		// ���ΰ� �Ǵ� ������ ���̰� ũ�ٸ� �����簢��
		// ���ο� ������ ���̰� ���ٸ� ���簢�� �̶�� ����ϼ���
		// switch ������ (if�� ���� ��������)
		
		Scanner sc = new Scanner( System.in );
		System.out.println( "������ ���̸� �Է��ϼ��� : " );
		int ���� = sc.nextInt();
		
		System.out.println( "������ ���̸� �Է��ϼ��� : " );
		int ���� = sc.nextInt();
		
		int ���� = ���� - ����;
		
		switch(����)
		{
			case 0:
			
				System.out.println("���簢��");
				break;
			
			default :
				System.out.println("���簢��");
				
		}
		
		// switch ������ default�� �ѹ��� ���
		// switch�� ���� ���� case�� ��ġ�ϴ°� ���ٸ� default ����ȴ�.
		// �־��� case �� ��ġ�ϴ°� �ϳ��� ������ default�� ���� �ϰ� ����
		
	}

}
