package java0703_1;

import java.util.Scanner;

public class JavaMethod4 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner( System.in );
		// 메서드를 통해서 숫자 10을 받아 출력하세요
		ReturnMth rm = new ReturnMth();
		
		int result = rm.sum();
		System.out.println( result );
		
		//다음 물음표에 들어갈 코드를 작성하여 이름과 나이가 출력되게 하세요
		String userName = rm.getName();
		int age=34;
		System.out.println( userName +" "+ age );
		
		// 국어, 영어, 수학 세 과목의 총점을 구하는 메서드
		// 세 과목의 평균을 구하는 메서드
		// 총점과 평균을 출력하세요
		
		
		int tot = rm.getTotal();
		int avg = rm.avg(tot);
		System.out.println( tot +" "+ avg);
		
		/*
		 * 주사위 게임
		 * j형준과 s석완이가 주사위 게임을 한다.
		 * 주사위는 하나, 육면이다.
		 * 주사위의 값이 큰 사람이 이긴다.
		 * 
		 * 주사위 값 구하는 메서드
		 * 
		 * 주사위 값 비교하여 누가 이겼는지 출력하는 메서드
		 * 
		 */
	}

}

class ReturnMth
{
	int getTotal()
	{
		int kor=89, eng=78, mat=50;
		return (kor+eng+mat);
	}
	int avg(int tot)
	{
		
		
		return 평균/3;
	}
	String getName()
	{
		String userName = "이순신";
		return userName;
	}
	int sum()
	{
		int num1 = 30, num2 = 45;
		int result = num1 + num2;
		return result;
	}
	int get()
	{
		return 10;
	}
}
