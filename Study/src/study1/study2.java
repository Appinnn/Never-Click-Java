package study1;

import java.util.ArrayList;

public class study2 {

	public static void main(String[] args) 
	{
		// �ڹ��� �ڷᱸ��
		// �ڷᱸ���� �����͸� ȿ�������� ����, �����ϱ� ���� ����
		
//		ArrayList<String> arr = new ArrayList<String>();
//		
//		arr.add("�̼���");
//		arr.add("�����");
//		arr.add("�ۿ���");
//		arr.add("�۹̿�");
//
//		System.out.println( arr );  //�׽�Ʈ�� ��� 
//		
//		for(int i=0; i<arr.size(); i++)
//		{
//			System.out.println( arr.get(i) );
//		}
//		
//		for(String name : arr)
//		{
//			System.out.println( name );
//		}
		
		// ArrayList�� ����ϱ� - ������ �����迭�� String[] ���
		// �̸� 10�� ����
		// �̸� �߿��� �� ���� ����ϱ�
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("�̼���");
		name.add("���̹�");
		name.add("�ڼ���");
		name.add("�̸��");
		name.add("��濵");
		name.add("������");
		name.add("�̹��");
		name.add("�念��");
		name.add("������");
		name.add("�̼���");
		
		for(String save : name)
		{
			if(save.contains("��"))
			{
				System.out.println(save);
			}
		}
//		for(int i=0; i<name.size(); i++)
//		{
//			if(name.contains("��"))
//				System.out.println(name);
//		}
	
	}

}
