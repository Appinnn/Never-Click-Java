package Java0704_1;

import java.util.Scanner;

public class JavaMethod6 {

	public static void main(String[] args) 
	{
		//컴퓨터와 가위 바위 보 하기
		//컴퓨터의 가위바위보 값은 comInput 메서드를 사용한다.
		// 유저의 가위바위보는 한글로 입력한다.
		// 승,무,패 에 대해 출력한다.
		// 메서드 - 유저 가위바위보 입력 하고 저장하는 메서드
		// 		- 컴퓨터와 비교하여 결과를 출력하는 메서드
		// Game 클래스에 필요한 변수나 메서드 작성
		// main 메서드에서는 Game 클래스 객체로 메서드들 만 실행
		
		Game game = new Game();
		game.comInput();
		game.userInput();
		game.totalAndResult();

	}

}


class Game //rock-paper-scissors 게임
{
	String com;
	String user;
	
	void totalAndResult()
	{
		
		if(user.equals("가위") )
		{
			if(com.equals("가위"))
			{
				System.out.println("com 값 : " + com);
				System.out.println("user 값 : " + user);
				System.out.println("비김");
			}
			else if(com.equals("바위"))
			{
				System.out.println("com 값 : " + com);
				System.out.println("user 값 : " + user);
				System.out.println("com 승");
			}
			else if(com.equals("보"))
			{
				System.out.println("com 값 : " + com);
				System.out.println("user 값 : " + user);
				System.out.println("user 승");
			}
		}
		if(user.equals("바위"))
		{
			if(com.equals("바위"))
			{
				System.out.println("com 값 : " + com);
				System.out.println("user 값 : " + user);
				System.out.println("비김");
			}
			else if(com.equals("가위"))
			{
				System.out.println("com 값 : " + com);
				System.out.println("user 값 : " + user);
				System.out.println("user 승");
			}
			else if(com.equals("보"))
			{
				System.out.println("com 값 : " + com);
				System.out.println("user 값 : " + user);
				System.out.println("com 승");
			}
		}
		if(user.equals("보"))
		{
			if(com.equals("보"))
			{
				System.out.println("com 값 : " + com);
				System.out.println("user 값 : " + user);
				System.out.println("비김");
			}
			else if(com.equals("바위"))
			{
				System.out.println("com 값 : " + com);
				System.out.println("user 값 : " + user);
				System.out.println("user 승");
			}
			else if(com.equals("가위"))
			{
				System.out.println("com 값 : " + com);
				System.out.println("user 값 : " + user);
				System.out.println("com 승");
			}
		}
		
	}
	void userInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("가위,바위,보 중 입력");
		String input = sc.nextLine();
		this.user = input;
		
	}
	
	void comInput()
	{
		int temp = (int)(Math.random() *3);
		switch(temp)
		{
		case 0 : this.com = "가위"; break;
		case 1 : this.com = "바위"; break;
		case 2 : this.com = "보"; break;
		}
	}
}
