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
		System.out.println("국어 점수를 입력하세요 : ");
		int kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int mat = scan.nextInt();
	}

}

class ReturnMth
{
	int total()
	{
		int kor, eng, mat;
		
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
