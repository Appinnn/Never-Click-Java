package java0715_2;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) 
	{
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(34); tree.add(45); tree.add(20); tree.add(9); tree.add(40); tree.add(15);
		tree.add(48); tree.add(2); tree.add(11); tree.add(39); tree.add(40);
		
		System.out.println( tree );
		System.out.println( tree.first() );
		System.out.println( tree.last() );
		
		//�Է°� ���� ū �� �߿��� ���� ����� �� �˻�
		System.out.println( tree.higher(25) );
		//�Է°� ���� ���� �� �߿��� ���� ����� �� �˻�
		System.out.println( tree.lower(19) );
		
		//�Է°����� ���� ��� �� �˻�
		System.out.println( tree.headSet(35) );
		//�Է°����� ū ��� �� �˻�
		System.out.println( tree.tailSet(30) );
		
		//�Է°����� ���̿� �ִ� ���� �˻�
		System.out.println( tree.subSet(9, 39) );
		
		
		TreeSet<String> word = new TreeSet<>();
		word.add("�̼���"); word.add("������"); word.add("�庸��"); word.add("������"); word.add("������"); word.add("���س�");
		word.add("����"); word.add("������"); word.add("���ƾ�");
		
		System.out.println( word );
		
		System.out.println( word.higher("��") );
		System.out.println( word.headSet("���") );
		System.out.println( word.subSet("��", "��") );

		System.out.println( word.subSet("��", "��") );
		
		// 90���̻� - ����10%, 70���̻� - ����30%, 40���̻� - ����80%
		
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Integer> rank = new TreeSet<>();
		rank.add(90); rank.add(70); rank.add(40);
		
		//���� ������ �Է��Ͽ� ���� ������ ���� ���
		
		System.out.println("�� ������ �´� ��ũ��? : ");
		
		int result = sc.nextInt();
		rank.add(result);
//		System.out.println("90���̻� - ����10%, 70���̻� - ����30%, 40���̻� - ����80%");
		
		if(result > rank.lower(90))
		{
			System.out.println("����10%");
		}
		else if(result > rank.lower(70))
		{
			System.out.println("����30%");
		}
		else 
		{
			System.out.println("����80%");
		}
		
		TreeSet<String> score = new TreeSet<>();
		score.add("89�� �̼���"); score.add("67�� ������"); score.add("45�� ������"); score.add("98�� �Ѽ���"); 
		score.add("72�� �ڹ���"); score.add("81�� ������"); score.add("59�� �̼���"); score.add("32�� �����"); 
		
		// �� ������ �Է��ϰ� ������ ������ ���� ����� ���
		
		
		String myscore = "80";
		System.out.println(score.tailSet(myscore));
		
		
		
		
	}

}


/*
 	Tree ������ �̿��Ͽ� ���� �����Ű�� TreeSet
 	- ���������� �����͸� �������� �ʴ´�.
 	- �ߺ������� ������� ����
 	- ����Ʈ���� ����ϱ� ������ �����Ͱ� ���ĵǾ� ��µȴ�.
 	- ���� �˻� �Ǵ� ������ �ߺ����� �� ���Ŀ� ���� �ϴ�.
  
  
  
  
  
  
  
 */
