package Java0712;

import java.util.ArrayList;

public class ArrayListStudy2 {

	public static void main(String[] args) 
	{
		ArrayList<Asset> list = new ArrayList<>();
		
		list.add( new Asset("우리은행", 3450000, "이순신", "1004-91-12345") );
		list.add( new Asset("농협", 513350, "김유신", "34-123-349393") );
		list.add( new Asset("신한은행", 891003, "박팽년", "394-3412-2323") );
		list.add( new Asset("국민은행", 899900, "최무선", "39-2384-19939") );
		list.add( new Asset("우리은행", 28300, "문익점", "1002-93-878888") );
		list.add( new Asset("신한은행", 98000, "이율곡", "293-0123-1234") );
		list.add( new Asset("우리은행", 1920000, "김시민", "1006-23-123456") );
		list.add( new Asset("국민은행", 932000, "이율곡", "23-2555-29991") );
		
		System.out.println("\n=== 우리 은행을 이용하는 사람 ===\n");
		for( Asset 우리 : list )
			if(우리.getBank().equals ("우리은행"))
				System.out.println( 우리 );
			
		System.out.println("\n=== 잔액이 100만원 이상인 사람 ===\n");
		list.forEach
		(
				백만 ->
				{
					if(백만.getBalance() > 1000000)
					{
						System.out.println(백만);
					}
				}
		);
		// list.forEach( a -> 실행코드);  //내용이 한줄일 경우
		// list.forEach( a -> {실행코드; 실행코드;} ); // 내용이 여러줄 일 경우
		
		
		System.out.println("\n=== 최무선이 우리은행 계좌? ===");
		Asset asset = new Asset("우리은행", 0, "최무선", "1007-23-128954");
		if( !list.contains(asset) )
		{
			list.add(asset);
		}
		
		list.forEach( info -> System.out.println( info) );
				
		
		
//		for( Asset m : list )
//			if(m.getHolder("최무선") !== m.getBank("우리은행"))
//				list.add( new Asset("우리은행", 0 ,"최무선", "1007-23-128954") );
			
	}
	
}
