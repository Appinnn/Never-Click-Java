package java0715_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetStudy1 {

	public static void main(String[] args) 
	{
		HashSet<String> ���� = new HashSet<>();
		HashSet<String> ��� = new HashSet<>();
		
		����.add("¥���"); ����.add("������"); ����.add("���"); ����.add("�޲ٹ̺���");
		
		���.add("��ġ������"); ���.add("������"); ���.add("¥���"); ���.add("���");
		System.out.println( ��� );
		
		// ������ - �ΰ� �̻��� �׷쿡 �������� ���� ����
		HashSet<String> ���� = new HashSet<>();
		
		Iterator<String> it = ����.iterator();
		while( it.hasNext() )
		{
			String ����food = it.next();
			if( ���.contains( ����food ) )
			{
				����.add( ����food );
			}
		}
		System.out.println( "����, ��� ������ : " + ���� );
		
		// ������ - A���տ��� B���հ��� �����յ����͸� ������ �������� ����
		HashSet<String> ������ = new HashSet<>();
		it = ����.iterator();
		while( it.hasNext() )
		{
			String ����food = it.next();
			if( !���.contains( ����food) )
			{
				������.add( ����food );
			}
		}
		System.out.println( "��ο� ���� ���� ������ : " + ������ );
		
		// ������ - A���հ� B������ �� ( �ߺ����� )
		HashSet<String> �� = new HashSet<>();
		�� = (HashSet<String>) ����.clone();
		��.addAll( ��� );
		System.out.println( �� );
		
		// ������ - addAll
		// ������ - retainAll     ����.retainAll(���);
		// ������ - removeAll     ����.removeAll(���);
		
//		HashSet<Integer> num1 = new HashSet<>();
		
//		while( num1.size() <= 10)
//		{
//			num1.add(Integer.valueOf( (int)(Math.random()*50)) );
//		}
//		System.out.println( num1 );
		
		// num1, num2, num3 ������ ������ �����
		// ���� 1~50������ ������ 15���� ���� �ϼ���
		// num1�� num3�� ������
		// num1�� num2�� ������
		// num2�� num3�� ������
		// num1,num2,num3�� ������
		
		HashSet<Integer> num1 = new HashSet<>();
		HashSet<Integer> num2 = new HashSet<>();
		HashSet<Integer> num3 = new HashSet<>();
		
		while( num1.size() <= 15 )
		{
			num1.add(Integer.valueOf((int)(Math.random()*50)+1 ));
		}
		
		while( num2.size() <= 15 )
		{
			num2.add(Integer.valueOf((int)(Math.random()*50)+1 ));
		}
		
		while( num3.size() <= 15 )
		{
			num3.add(Integer.valueOf((int)(Math.random()*50)+1 ));
		}
		System.out.println(num1 +"\n" + num2+ "\n" + num3);
		
		HashSet<Integer> ������1 = new HashSet<>();
		HashSet<Integer> ������1 = new HashSet<>();
		HashSet<Integer> ������2 = new HashSet<>();
		HashSet<Integer> ������1 = new HashSet<>();
		
		// num1�� num2�� ������
		Iterator<Integer> it1 = num1.iterator();
		while( it1.hasNext() )
		{
			int total = it1.next();
			if( num2.contains(total)  )
			{
				������1.add( total );
			}
		}
		System.out.println( "num1, num2 ������ : " + ������1 );
		
		//num2 �� num3�� ������
		Iterator<Integer> it2 = num2.iterator();
		while( it2.hasNext() )
		{
			int total = it2.next();
			if( num3.contains(total)  )
			{
				������2.add( total );
			}
		}
		System.out.println( "num2, num3 ������ : " + ������2 );
		
		//num1�� num2�� ������
		Iterator<Integer> it3 = num1.iterator();
		while( it3.hasNext() )
		{
			int total = it3.next();
			if( !num2.contains(total)  )
			{
				������1.add( total );
			}
		}
		System.out.println( "num1, num2 ������ : " + ������1 );
		
		//num1, num2, num3 �� ��
		HashSet<Integer> ���� = new HashSet<>();
		���� = (HashSet<Integer>) num1.clone();
		
		����.addAll( num2 );
		����.addAll( num3 );
		
		System.out.println("num1,num2,num3 �� ���� : " +  ���� );
		
		
		
		
		
		
		
		
		
		
		
//		HashSet<String> hash = new HashSet<>();
//		
//		hash.add("¥���");
//		hash.add("«��");
//		hash.add("���뱹��");
//		hash.add("���Į����");
//		hash.add("��������");
//		hash.add("¥���");
//		
//		System.out.println( hash );
//
//		hash.remove("«��");
//		System.out.println( hash );
//		
//		for( String food : hash)
//		{
//			System.out.println( food );
//		}
//		
//		ArrayList<String> list = new ArrayList<>( hash );
//		System.out.println( list );
//		System.out.println( list.get(3) );
		
	}

}

/*
 * Set �������̽�
 * 	- HashSet, TreeSet
 * 	- ������� ���� ���� �ʴ´�. = (�Է��� ������� ������� �ʴ´�)
 * 	- �ߺ������� ������� �ʴ´�.
 * 	- �ε����� ����.
 * 	- Set�� ����(�������� �׷�)�� �ٷ궧 ����Ѵ�.
 * 	- HashSet -> ������ ǥ���Ҷ� ����
 * 	- TreeSet -> (����)�˻��� �Ҷ� Ưȭ
 * */
