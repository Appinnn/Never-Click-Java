package java0702_2;

public class JavaMethod {

	public static void main(String[] args) 
	{	// Ŭ���� �޼��� ������ ���� Ŭ���� ������ 
		// Ŭ���� �޼��常 ���� - �޸𸮿��ε�(����)�Ǵ� ���� �ν��Ͻ� ���� ����
		//  �̷������ ������ �ν��Ͻ� ������ �ν��Ͻ� �޼���� �ȵȴ�.
		int num = 300;
		 output( num );
		 a.out();
	}
	static void output( int a )
		{
			System.out.println( a );
			System.out.println("���� �޼��� �Դϴ�.");
		}
}

class a{
	int num = 10;
	
	static void out() { //Ŭ���� �޼���
		System.out.println();
	}
}
// main �޼��� -> JVM



// �ڹ� �޼���
// ��ȯŸ�� �޼����̸�(�Ű�����)
//	{
//		
//	}
// ��ȯ Ÿ�� - int, short, float, double, char, boolean, void, String
// �޼����� return ������ Ÿ��
//
// return 10; -> ��ȯŸ�� int,short,long
// 
// return income; -> income ������ Ÿ���� ��ȯŸ������ 

// void Ÿ���� ��ȯ���� ����. ��� �ǹ�

/*
 * 	
 * �ֹε�Ϲ�ȣ�� �������� �������� ����
 * String gender( String jumin )
 * 		{
 * 			String gen = jumin.substring( 7,8 );
 * 			if( gen.equals("1") || gen.euals("3") )
 * 				{
 * 					return "����";
 * 				}
 * 			else if(gen.equals("2") || gen.equals("4") )
 * 				{
 * 					return "����";
 * 				}
 * 		}	return "ȥ��";
 * 
 */









