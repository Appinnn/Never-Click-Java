package Java0704_1;

import java.util.Scanner;

public class JavaMethod6 {

	public static void main(String[] args) 
	{
		//��ǻ�Ϳ� ���� ���� �� �ϱ�
		//��ǻ���� ���������� ���� comInput �޼��带 ����Ѵ�.
		// ������ ������������ �ѱ۷� �Է��Ѵ�.
		// ��,��,�� �� ���� ����Ѵ�.
		// �޼��� - ���� ���������� �Է� �ϰ� �����ϴ� �޼���
		// 		- ��ǻ�Ϳ� ���Ͽ� ����� ����ϴ� �޼���
		// Game Ŭ������ �ʿ��� ������ �޼��� �ۼ�
		// main �޼��忡���� Game Ŭ���� ��ü�� �޼���� �� ����
		
		Game game = new Game();
		game.comInput();
		game.userInput();
		game.totalAndResult();

	}

}


class Game //rock-paper-scissors ����
{
	String com;
	String user;
	
	void totalAndResult()
	{
		
		if(user.equals("����") )
		{
			if(com.equals("����"))
			{
				System.out.println("com �� : " + com);
				System.out.println("user �� : " + user);
				System.out.println("���");
			}
			else if(com.equals("����"))
			{
				System.out.println("com �� : " + com);
				System.out.println("user �� : " + user);
				System.out.println("com ��");
			}
			else if(com.equals("��"))
			{
				System.out.println("com �� : " + com);
				System.out.println("user �� : " + user);
				System.out.println("user ��");
			}
		}
		if(user.equals("����"))
		{
			if(com.equals("����"))
			{
				System.out.println("com �� : " + com);
				System.out.println("user �� : " + user);
				System.out.println("���");
			}
			else if(com.equals("����"))
			{
				System.out.println("com �� : " + com);
				System.out.println("user �� : " + user);
				System.out.println("user ��");
			}
			else if(com.equals("��"))
			{
				System.out.println("com �� : " + com);
				System.out.println("user �� : " + user);
				System.out.println("com ��");
			}
		}
		if(user.equals("��"))
		{
			if(com.equals("��"))
			{
				System.out.println("com �� : " + com);
				System.out.println("user �� : " + user);
				System.out.println("���");
			}
			else if(com.equals("����"))
			{
				System.out.println("com �� : " + com);
				System.out.println("user �� : " + user);
				System.out.println("user ��");
			}
			else if(com.equals("����"))
			{
				System.out.println("com �� : " + com);
				System.out.println("user �� : " + user);
				System.out.println("com ��");
			}
		}
		
	}
	void userInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("����,����,�� �� �Է�");
		String input = sc.nextLine();
		this.user = input;
		
	}
	
	void comInput()
	{
		int temp = (int)(Math.random() *3);
		switch(temp)
		{
		case 0 : this.com = "����"; break;
		case 1 : this.com = "����"; break;
		case 2 : this.com = "��"; break;
		}
	}
}
