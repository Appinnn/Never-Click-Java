package study1;

import java.util.ArrayList;

public class study2 {

	public static void main(String[] args) 
	{
		// �ڹ��� �ڷᱸ��
		// �ڷᱸ���� �����͸� ȿ�������� ����, �����ϱ� ���� ����
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("�̼���");
		arr.add("�����");
		arr.add("�ۿ���");
		arr.add("�۹̿�");

		System.out.println( arr );  //�׽�Ʈ�� ��� 
		
		for(int i=0; i<arr.size(); i++)
		{
			System.out.println( arr.get(i) );
		}
		
		for(String name : arr)
		{
			System.out.println( name );
		}
	}

}