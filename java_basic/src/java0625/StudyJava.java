package java0625;

public class StudyJava {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("�ڹ��׽�Ʈ1223121"); // ���
		// �ڵ���� Lctrl + F11
		// �ڹ� ���� ���� ���
		// -> ������Ÿ�� �����̸� = ������
		// �ڹٿ��� ����ϴ� �⺻ ������ ����(Ÿ��)
		//	����, �Ǽ�, ����
		
		// ���� - byte , short , int , long , **char
		// ���� - **char
		// �Ǽ� - float , double , longdouble
		byte num = 10; // 1byte �� �޸� ũ��
		short num1 = 200; // 2byte
		int num2 = 2323; // 4byte
		long num3 = 234L; // 8byte // ������ �ڿ� L�� ���̴°� ���
		
		char ch = 'a'; // ''��������ǥ�� ����, ""ū����ǥ�� ���ڿ�
		
		float fnum = 3.14f; // ������ �ڿ� f�� �� �ٿ��� ������ ������.
		double dnum = 12.345;
		fnum = 35;
		
		boolean isTrue = false;
		
		String word = "�̼���"; // string�� �⺻ ������ Ÿ���̾ƴ�(���� ������ ǥ��x) -> Ŭ�����̴�.
		// Ŭ������ -> ����� ���� Ÿ���̶�� �Ѵ�. Ŭ������ �̸������� �ݵ�� �빮�ڷ� ǥ��.
		
		// �簢���� ���̸� ���Ͻÿ�(�غ��� ���̴� �����̴�.)
		int width = 15;
		int height = 20;
		int area = width * height;
		
		System.out.println( "���� : " + area );
		
		// Ű���带 30�� �����ؾ��Ѵ�.
		// hp���̹�Ű������ ������ 8000�� �̶�� �� ���űݾ��� ���ΰ�?
		
		int howMany = 30;
		int price = 8000;
		int total = price * howMany;
		
		System.out.println( "�� ���� ���� : " + total + "��" );
		System.out.print( "java ��� ��� print" );
		System.out.print( " �ٹٲ��� �ȵȴ�" );
		System.out.printf( " printf \n ��� " ); // \n -> ����Ű�� ����ȭ ��Ų��(Ư������)
		// ���� ���� -> ������������
		System.out.printf( "�� �ݾ� : %d ", total );
		// %d = 10���� ����
		// %u - 10���� ����
		// %f - 10���� �Ǽ� = 6�ڸ����� ���
		// %c - ����
		// %s - ���ڿ�
		// %b - boolean (false,true)
		// %o - 8���� ����  %x - 16���� ����

		System.out.printf( "\n ���� : %d�� ���� : %d�� \n", 80,90 );
		
		System.out.printf(" %d %f", 90, 3.14);
		System.out.println("\n" + 172.315);
		System.out.print( 172.315 );
		System.out.printf(" \n %.1f \n", 172.315 );
		System.out.println( 3 );
		System.out.printf("%5d", 3 );
	}

}
