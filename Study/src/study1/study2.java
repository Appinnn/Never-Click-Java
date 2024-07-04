package study1;

import java.util.ArrayList;

public class study2 {

	public static void main(String[] args) 
	{
		// 자바의 자료구조
		// 자료구조란 데이터를 효율적으로 저장, 관리하기 위한 구조
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("이순신");
		arr.add("김경제");
		arr.add("송영진");
		arr.add("송미연");

		System.out.println( arr );  //테스트용 출력 
		
		for(int i=0; i<arr.size(); i++)
		{
			System.out.println( arr.get(i) );
		}
		
		for(String name : arr)
		{
			System.out.println( name );
		}
	}

}
