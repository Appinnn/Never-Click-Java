package java0708;

import java.util.Scanner;

public class DBTest {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Dao dao = new Dao();
		Member[] list; // Member Ŭ���� Ÿ�� �迭 �ּҸ� ���� �� ��������
		
		System.out.print("1. �Է�  2. ��� : ");
		int menu = sc.nextInt();
switch( menu ) 
	{
		
	case 1:
		
		System.out.print("�л� �̸� : ");
		String name = sc.nextLine();
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� : ");
		int mat = sc.nextInt();
		
		Member member = new Member(name,kor,eng,mat);
		total_avg(member);
		System.out.println( member );
		// �����ͺ��̽��� ����
		
		dao.insert(member);
		break;
		
	case 2: // ������ ���� ���	
		list = dao.select(); // �����ͺ��̽��� �����͸� Member Ŭ���� �迭�� ��������
		for( Member data : list)
		{
			System.out.println( data );
		}
		break;
	}

	}
	
	static void total_avg( Member m )
	{
	int total = m.getKor() + m.getEng() + m.getMat();
	m.setTotal( total );
	m.setStd_avg( total/3 );
		
	}

}
