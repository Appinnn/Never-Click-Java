package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy2 {
	
	static Scanner sc = new Scanner( System.in );
	
	public static void main(String[] args) 
	{
		// 음료를 검색하여 음료이름과 금액이 출력되게 하세요.
		// 카페 배열에 없는 음료 검색시 죄송합니다. 준비중입니다. 라고 출력
		
		String[] 카페 = new String[]
				{"아메리카노 : 2000원","화이트 아메리카노 : 2800원","카페라떼 : 3000원","돌체라떼 : 3800원",
				"카페모카 : 3800원","수박주스 : 4000원","써머아이스티 : 2900원","복숭아아이스티 : 2800원",
				"자두아이스티 : 2800원","유자에이드 : 3500원","레몬에이드 : 3500원","청포도에이드 : 3500원"};
		
		System.out.println( "음료검색 : ");
		String search = sc.nextLine();
		
		boolean isDrink = true;
		for( int i=0; i<카페.length; i++)
		{
			if( 카페[i].contains(search))
				{
					System.out.println("검색 결과 : " + 카페[i]);
					isDrink = false;
				}
		}
			if(isDrink)
				{
					System.out.println("죄송합니다. 준비중입니다...");	
				}
					
			
			
		
		
		
		
		
		
		
//		String[] name = new String[]
//				{"김유신","한석봉","양만춘","김춘추","정도전","정양용","이순신","이사부","이사람","한가인"};
//		
//		System.out.println( "이름검색 : ");
//		String search = sc.nextLine();
//		
//		for( int i=0; i<name.length; i++)
//			if( name[i].contains(search))
//				{
//					System.out.println("검색 결과 : " + name[i]);
//				}
		
		
		
		
		
		
		
		
//		String word = "i like banana";
//		
//		// 문자열에서 특정 문자나 문자열의 위치 찾기 - indexOf
//		System.out.println(word.indexOf("like"));
//		
//		// 문자열에서 특정 문자나 문자열의 존재유무 - true, false
//		System.out.println(word.contains( "ba" ));
//		String[] a = new String[] {"banana","orange"};
//		
//		a[0].indexOf("na"); // 2
//		a[1].contains("ge"); // true
		
		
		
		
		
		// name 배열의 문자열중에서 이성계,문익점,정도전,최영을
		// 선발대 배열에 저장하고 출력하세요
//		String[] name = new String[]
//		{"이순신","김유신","장보고","이성계","문익점","정도전","최영","양만춘"};
//		
//		String[] 선발대 = new String[4];
//		
//		System.arraycopy( name, 3, 선발대, 0, 4 ); 
//		
//		System.out.println( Arrays.toString( 선발대));
		
		
		
		
		
		
		
		
		
		// 6명의 키를 tall 배열에 저장하였다.
		// 키 175 미만을 출력하세요.
//		float[] tall = new float[] {173.4f, 175.1f, 169.5f, 181.4f, 185.3f};
//		
//		for( int i = 0 ; i< tall.length; i++ )
//			{
//				if(tall[i] < 175)
//				{
//					System.out.println("키 175 미만 : " + tall[i]);
//				}
//			}
		
		// 과자 배열에 좋아하는 과자의 판매가격을 키보드로 입력하여 저장하세요
		// 과자 배열에 저장된 판매가격들의 총 합과 평균을 구하세요.
		
//		int[] 과자 = new int[5];
//		int total = 0;
//		System.out.println("1번 과자 가격은 ? :");
//		과자[0] = sc.nextInt();
//		System.out.println("2번 과자 가격은 ? :");
//		과자[1] = sc.nextInt();
//		System.out.println("3번 과자 가격은 ? :");
//		과자[2] = sc.nextInt();
//		System.out.println("4번 과자 가격은 ? :");
//		과자[3] = sc.nextInt();
//		System.out.println("5번 과자 가격은 ? :");
//		과자[4] = sc.nextInt();
//		
//		for( int i=0; i< 과자.length; i++)
//			{
//				total = total + 과자[i];
//			}
//		int totalAvg = total/과자.length;
//		System.out.println("총 합 : "  + total );
//		System.out.println("총 합 평균 : " + totalAvg );
			
			
			

	}

}
