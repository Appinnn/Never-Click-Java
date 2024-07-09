package java0709_2;

public class ObjectArray3 {

	public static void main(String[] args) 
	{
		BoardDAO dao = new BoardDAO();
		Board[] list = dao.findByAll();
		
//		for( Board board : list)
//		{
//			if( board.getTitle().contains("동") )
//			{
//				System.out.println( board );
//			}
//		}
//		
//		//hit 값이 50 이상인 것 출력
//		for( Board board : list )
//			if( board.getHit()>=50 )
//			{
//				System.out.println( board );
//			}
//		// 제목의 글자수가 10자 이상인것만 출력
//		for( Board board : list )
//			if( board.getTitle().length() >= 10 )
//			{
//				System.out.println( board );
//			}
//		
//		// content의 글자수가 10자 이하인 객체의
//		// title과 writer만 출력
//		for( Board board : list )
//			if( board.getContent().length() <= 10 )
//			{
//				System.out.println(board.getTitle()+ " " + board.getWriter() );
//			}
//		
//			
//		System.out.println("\n hit수가 100이상인 객체들을 추출하여 hot 배열에 저장");
//		Board[] hot = new Board[ list.length ];
//		
		int i=0; //hot 배열에 사용할 인덱스
//		for( Board board : list )
//		{
//			if( board.getHit() >= 100 )
//			{
//				hot[i++] = board;
//				
//			}
//		}
//		for( Board data : hot )
//		{
//			if( data == null ) break;
//			System.out.println( data );
//		}
		
		// writer에 신이 포함된 객체만 추출하여
		//sin 배열에 저장 후 출력하세요
		Board[] sin = new Board[list.length];
		for( Board board : list)
		{
			if(board.getWriter().contains("신"))
			{
				sin[i] = board;
				i++;
			}
		}
		for(Board sin2 : sin)
		{
			if( sin2 == null) break;
			System.out.println( sin2 );
		}
	}
		
	
}
