package java0625;

public class StudyJava {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("자바테스트1223121"); // 출력
		// 코드실행 Lctrl + F11
		// 자바 변수 생성 방법
		// -> 데이터타입 변수이름 = 데이터
		// 자바에서 취급하는 기본 데이터 종류(타입)
		//	정수, 실수, 문자
		
		// 정수 - byte , short , int , long , **char
		// 문자 - **char
		// 실수 - float , double , longdouble
		byte num = 10; // 1byte 의 메모리 크기
		short num1 = 200; // 2byte
		int num2 = 2323; // 4byte
		long num3 = 234L; // 8byte // 데이터 뒤에 L을 붙이는걸 요망
		
		char ch = 'a'; // ''작은따옴표가 문자, ""큰따옴표가 문자열
		
		float fnum = 3.14f; // 데이터 뒤에 f를 꼭 붙여야 저장이 가능함.
		double dnum = 12.345;
		fnum = 35;
		
		boolean isTrue = false;
		
		String word = "이순신"; // string은 기본 데이터 타입이아님(글자 강조색 표시x) -> 클래스이다.
		// 클래스란 -> 사용자 정의 타입이라고 한다. 클래스의 이름시작은 반드시 대문자로 표시.
		
		// 사각형의 넓이를 구하시오(밑변과 높이는 정수이다.)
		int width = 15;
		int height = 20;
		int area = width * height;
		
		System.out.println( "넓이 : " + area );
		
		// 키보드를 30개 구매해야한다.
		// hp게이밍키보드의 가격이 8000원 이라면 총 구매금액은 얼마인가?
		
		int howMany = 30;
		int price = 8000;
		int total = price * howMany;
		
		System.out.println( "총 구매 가격 : " + total + "원" );
		System.out.print( "java 출력 방법 print" );
		System.out.print( " 줄바뀜이 안된다" );
		System.out.printf( " printf \n 출력 " ); // \n -> 엔터키를 문자화 시킨것(특수문자)
		// 서식 문자 -> 형식지정문자
		System.out.printf( "총 금액 : %d ", total );
		// %d = 10진수 정수
		// %u - 10진수 정수
		// %f - 10진수 실수 = 6자리까지 출력
		// %c - 문자
		// %s - 문자열
		// %b - boolean (false,true)
		// %o - 8진수 정수  %x - 16진수 정수

		System.out.printf( "\n 국어 : %d점 수학 : %d점 \n", 80,90 );
		
		System.out.printf(" %d %f", 90, 3.14);
		System.out.println("\n" + 172.315);
		System.out.print( 172.315 );
		System.out.printf(" \n %.1f \n", 172.315 );
		System.out.println( 3 );
		System.out.printf("%5d", 3 );
	}

}
