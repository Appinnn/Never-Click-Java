package Java0704_1;

import java.util.Scanner;

public class JavaMethod5 {

	public static void main(String[] args) 
	{
		MethodUtill utill = new MethodUtill();
		//�ΰ��� ������ ��ȯ �ϱ�
		int[] num = utill.twoNum();
		
//		//�簢���� �ʺ�� ���̸� �����ϰ� ���̸� ����ϼ���.
//		//���̴� main�޼��忡�� ��µǰ� �ϼ���
//		Square square = new Square();
//		int result = square.WidthHeight();
//		System.out.println( "�簢���� ���� : " + result );
//		
//		// �α��� ������ ���̵�� skyblue , ��й�ȣ�� 1234sea
//		// login �޼��带 �����Ͽ� �α��� ���θ� ����ϼ���
//		// ���̵� ��й�ȣ�� ��ġ�ϸ� �α��� ���� ���
//		// �ϳ��� ����ġ�ϴٸ� �α��� ���� ���
//		// �α��� ���� ����� main����
//		
//		boolean  isFail = utill.login();
//		if( isFail )
//		{
//			System.out.println("�α��� ����!");
//		}
//		else
//		{
//			System.out.println("�α��� ����!");
//		}
		
		//���� 3���� Ű���带 ���� �Է� ��������.
		// �Է��� �� ������ ���� 100�� ������
		// 100 - ���� ����� ����ϰ�
		// 100�� ���� ������ �� ������ ���� ����ϼ���
		// main�޼��忡�� ���
		Result result = new Result();
		int �� = result.numbers();
		System.out.println(��);
				
		
		
		
	}

}
class Result
{
	int numbers()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���� �� �Է� : ");
		int num2 = sc.nextInt();
		System.out.println("����° ���� �� �Է� : ");
		int num3 = sc.nextInt();
		int totalNum = num1+num2+num3;
		
		if(totalNum > 100)
		return 100-totalNum;
		
		else
		return totalNum;
	}
}



class Square
{
	int WidthHeight()
	{
		int width = 45;
		int height = 50;
		int area = width * height;
		return area;
	}
}

class MethodUtill
{
	
	boolean login()
	{
		Scanner sc = new Scanner( System.in );
		System.out.print("���̵� : ");
		String id = sc.nextLine();
//		sc.nextLine();
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		boolean isSuccess = true;
		if(id.equals("skyblue") )
		{
			if(password.equals("1234sea") )
			{
				return isSuccess;
			}
		}
		return isSuccess=false;
	}	
	
	
	
	
	int[] twoNum()
	{
		int num1 = 20, num2 = 50;
		// int temp[] = new int[] {num1 , num2};
		return new int[] {num1 , num2};
		// return���� ��ȯ ��ų �� �ִ� ���� ���� ���̴�.
	}
}
