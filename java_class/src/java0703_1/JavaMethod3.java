package java0703_1;

import java.util.Scanner;

public class JavaMethod3 {

	public static void main(String[] args) {
		// ���� �ΰ� �Է¹޾� ���� ����ϱ�
//		  Calc calc = new Calc();
//		  calc.sum(40,10);
		  
		// calc.sum();
		  
		  // �������� ������ ���Ͽ� ����ϼ���
		  int kor = 89 , eng = 74 , mat = 43;
		  
		  //�޼��带 ȣ���Ͽ� "�޼��� ������~ " ��� ���
		  Calc calc = new Calc();
		  calc.call("�ż��� ��Ƴ�...");
		  calc.view(); // view �޼��� ȣ��
		  
		  //�޼��带 ȣ���Ͽ� �̸��� ���̸� ����ϼ���
		  // �Ű����� ���� �޼���, Ű���带 �Է� x
		  calc.info();
		  
		  //�޼��带 ȣ���Ͽ� �Ʒ��� �����͸� ����ϼ���
		  String animal = "��Ʈ����";
		  String ������ = "2024-07-01";
		  
		  TestMethod testMethod = new TestMethod();
		  testMethod.whosDog();
		  
		  //���� ��¥�߿��� ���� �ϸ� ����ϼ���
		  // ���ڿ� �޼��� substring �Ǵ� split ���
		  String examDate = "2024-08-13";
		  testMethod.date(examDate);
		  
		  // �� ����� ���� ��հ��� ���Ͽ� ����ϼ���
		  // ��հ��� ���� �Դϴ�.
		  int ��� = 31, ���� = 23, ���� = 28, ��� = 37;
		  
		  testMethod.age(���,����,����,���);
	}

}

//�ν��Ͻ� �޼���, �ν��Ͻ� ������ ��ü(�ν��Ͻ�)�� ���� ���
// Ŭ���� �޼���, Ŭ���� ������ Ŭ���� �̸����� ���

class TestMethod
{
	
	void age(int ��, int ��, int Ȳ , int ��)
	{	//int ��� = 31, ���� = 23, ���� = 28, ��� = 37;
		int total = ��+��+Ȳ+��;
		int avr = total/4;
		System.out.println(avr);
	}
	void date(String date)
	{
		String [] current = date.split("-");
		System.out.println( current[1] + "  "+ current[2]);
	}
	void whosDog()
	{
		String animal = "��Ʈ����";
		String ������ = "2024-07-01";
		System.out.println(animal +" "+ ������);
	}
}

class Calc
{
	void info()
	{
		String name = "�̼���";
		int age = 26;
		System.out.println("�̸� : " + name + " ���� : " + age);
	}
	void view() //���� a,b �� ���� ����ϴ� �ż���
	{
		int a=10, b=20;
		System.out.println(a+","+b);
		
	}
	void call(String call)
	{
		
		System.out.println(call);
	}
}


//class Calc()
//{
//	void sum(int num1, int num2)
//	{
//		int result = num1 + num2;
//		System.out.println("�� : " + result);
//	}
//	
//	void sum()
//	{
//		Scanner scan = new Scanner(System.in);
//		System.out.print("ù��° ���� :");
//		int num1 =  scan.nextInt();
//		System.out.print("�ι�° ���� :");
//		int num2 =  scan.nextInt();
//		int result = num1 + num2;
//		System.out.println("�� : " + result);
//	}
//}