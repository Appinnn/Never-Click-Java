package java0627;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) 
	{
		// 반복문 - for, while, do~while
		// for(초기값; 조건식; 증감식)
		// {
		//   반복내용
		// }
		// 조건식이 거짓이 될 때까지 중괄호 내용이 계속 실행된다.
		// 순서는 초기값 -> 조건식비교 -> **참 일경우 -> 중괄호 -> 증감식 -> 조건식비교 -> **참 일경우 -> 중괄호 -> 증감식 -> 조건식비교 -> **거짓일경우 -> 종료
		
//		for(int i=1;i<=17; i++)
//		{
//			
//			System.out.println("아...반복문..." + (i));
//			i++;
//			
//		}
		
//		int num = 1;
//		int a=1;
//		num = num + a;
//		System.out.println(num); //2
//		a++;
//		num = num +a;
//		System.out.println(num); //4
//		a++;
//		num = num +a;
//		System.out.println(num); //7
//		
		// 1부터 내가 입력한 숫자까지의 총합을 구하세요.
		
		System.out.println( "숫자를 입력하세요" );
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int sum =0;
		for(int i=1; i<=num; i++)
		{
			sum = sum+i;
			System.out.println(sum);
			
		}
	}	

}
