package study1;

import java.util.ArrayList;

public class study2 {

	public static void main(String[] args) 
	{
		// 자바의 자료구조
		// 자료구조란 데이터를 효율적으로 저장, 관리하기 위한 구조
		
//		ArrayList<String> arr = new ArrayList<String>();
//		
//		arr.add("이순신");
//		arr.add("김경제");
//		arr.add("송영진");
//		arr.add("송미연");
//
//		System.out.println( arr );  //테스트용 출력 
//		
//		for(int i=0; i<arr.size(); i++)
//		{
//			System.out.println( arr.get(i) );
//		}
//		
//		for(String name : arr)
//		{
//			System.out.println( name );
//		}
		
		// ArrayList를 사용하기 - 어려우면 정적배열로 String[] 방식
		// 이름 10개 저장
		// 이름 중에서 김 씨만 출력하기
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("이순신");
		name.add("김이박");
		name.add("박세종");
		name.add("이명박");
		name.add("허경영");
		name.add("김유신");
		name.add("이방원");
		name.add("장영실");
		name.add("김춘추");
		name.add("이성계");
		
		for(String save : name)
		{
			if(save.contains("김"))
			{
				System.out.println(save);
			}
		}
//		for(int i=0; i<name.size(); i++)
//		{
//			if(name.contains("김"))
//				System.out.println(name);
//		}
	
	}

}
