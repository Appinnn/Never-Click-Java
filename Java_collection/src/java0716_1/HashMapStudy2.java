package java0716_1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapStudy2 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String,ImageBoard> board = new HashMap<>();
		
		ImageBoard temp = new ImageBoard("자바설치","javava","설치.jpg");
		board.put( temp.getTitle(), temp) ;
		temp = new ImageBoard("mysql설치방법","설치인생","mysql설치.jpg");
		board.put( temp.getTitle(), temp );
		temp = new ImageBoard("책안읽은사람","책읽자","책읽는방법.jpg");
		board.put( temp.getTitle(), temp );
		temp = new ImageBoard("책읽기싫은사람","멍때리기","멍때리는방법.jpg");
		board.put( temp.getTitle(), temp );
		temp = new ImageBoard("오늘의운세","전우치","운세보드.jpg");
		board.put( temp.getTitle(), temp );
		
		System.out.println( board.get("자바설치") );
		
		// 이미지 게시판의 글 제목을 출력하고
		// 보고싶은 글의 제목을 입력하면 해당
		// 글의 내용을 볼 수 있다.
		
		Set<String> titles = board.keySet();
		System.out.println( "=== 이미지 게시판 목록 ===" );
		
		titles.forEach( title -> System.out.println( title ) );
		
		System.out.println( "글 제목 입력 : ");
		String inputTitle = sc.nextLine();
		
		System.out.println( board.get(inputTitle) );
	}

}
