package java0626;

import java.util.Scanner;

public class input2 {

	public static void main(String[] args) 
	{
		/* 문자열 - " " 큰따옴표로 표현하여 작성한다.
		 * 문자열은 String 클래스타입을 사용해야한다.
		 * 코드 작성하기전에 해야할일 - 문제파악, 요구사항도출
		 * 
		 * 문제2.
		 * 직원 이름, 소속부서명, 월 급여액 을 키보드를 통해 입력받는다.
		 * 세금은 8%를 낸다. 실수령액은 얼마인지 출력
		 * 이름,부서,실수령액 출력하세요
		 * 두명의 직원에 대해 출력하세요
		 * */
		
		Scanner sc = new Scanner( System.in);
		System.out.println("직원1의 이름은? : ");
		String 직원1 = sc.next();
		System.out.println("직원1의 소속부서는? : ");
		String 부서1 = sc.next();
		System.out.println("직원1의 월 급여액은? : ");
		int 월급여1 = sc.nextInt();
		
		System.out.println("직원2의 이름은? : ");
		String 직원2 = sc.next();
		System.out.println("직원2의 소속부서는? : ");
		String 부서2 = sc.next();
		System.out.println("직원2의 월 급여액은? : ");
		int 월급여2 = sc.nextInt();
		
		float 세율 = 8;
		float 세금율 = 세율/100;
		float 세금1 = 세금율*월급여1;
		float 세금2 = 세금율*월급여2;
		
		float 실수령액1 =월급여1-세금1; 
		float 실수령액2 =월급여2-세금2; 
		
		System.out.println(" 직원1의 이름 : " + 직원1 +"\n 직원1의 소속부서 : " + 부서1
							+"\n 직원1의 월급 실 수령액 : " + 실수령액1+"만원");
		System.out.println(" 직원2의 이름 : " + 직원2 +"\n 직원2의 소속부서 : " + 부서2
				+"\n 직원2의 월급 실 수령액 : " + 실수령액2 +"만원");
		
		
		
	}

}
