package java0703_1;

import java.util.Scanner;

public class JavaMethod3 {

	public static void main(String[] args) {
		// 정수 두개 입력받아 합을 출력하기
//		  Calc calc = new Calc();
//		  calc.sum(40,10);
		  
		// calc.sum();
		  
		  // 세과목의 총점을 구하여 출력하세요
		  int kor = 89 , eng = 74 , mat = 43;
		  
		  //메서드를 호출하여 "메서드 개쉽네~ " 라고 출력
		  Calc calc = new Calc();
		  calc.call("매서드 어렵네...");
		  calc.view(); // view 메서드 호출
		  
		  //메서드를 호출하여 이름과 나이를 출력하세요
		  // 매개변수 없는 메서드, 키보드를 입력 x
		  calc.info();
		  
		  //메서드를 호출하여 아래의 데이터를 출력하세요
		  String animal = "리트리버";
		  String 공고일 = "2024-07-01";
		  
		  TestMethod testMethod = new TestMethod();
		  testMethod.whosDog();
		  
		  //다음 날짜중에서 월과 일만 출력하세요
		  // 문자열 메서드 substring 또는 split 사용
		  String examDate = "2024-08-13";
		  testMethod.date(examDate);
		  
		  // 네 사람의 나이 평균값을 구하여 출력하세요
		  // 평균값은 정수 입니다.
		  int 흥민 = 31, 강인 = 23, 희찬 = 28, 재범 = 37;
		  
		  testMethod.age(흥민,강인,희찬,재범);
	}

}

//인스턴스 메서드, 인스턴스 변수는 객체(인스턴스)를 통해 사용
// 클래스 메서드, 클래스 변수는 클래스 이름으로 사용

class TestMethod
{
	
	void age(int 손, int 이, int 황 , int 박)
	{	//int 흥민 = 31, 강인 = 23, 희찬 = 28, 재범 = 37;
		int total = 손+이+황+박;
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
		String animal = "리트리버";
		String 공고일 = "2024-07-01";
		System.out.println(animal +" "+ 공고일);
	}
}

class Calc
{
	void info()
	{
		String name = "이순신";
		int age = 26;
		System.out.println("이름 : " + name + " 나이 : " + age);
	}
	void view() //변수 a,b 의 값을 출력하는 매서드
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
//		System.out.println("합 : " + result);
//	}
//	
//	void sum()
//	{
//		Scanner scan = new Scanner(System.in);
//		System.out.print("첫번째 정수 :");
//		int num1 =  scan.nextInt();
//		System.out.print("두번째 정수 :");
//		int num2 =  scan.nextInt();
//		int result = num1 + num2;
//		System.out.println("합 : " + result);
//	}
//}