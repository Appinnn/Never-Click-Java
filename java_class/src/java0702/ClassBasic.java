package java0702;

public class ClassBasic {

	public static void main(String[] args) 
	{
		// 정의된 클래스 타입의 공간을 생성 한다.
		// 생성된 공간에 데이터를 저장한다.
		// 클래스 타입으로 생성된 공간을 객체 또는 인스턴스 라고 한다.
		
		// 클래스 인스턴스 생성 - 생성자 메서드
		Member member1 = new Member();
		Member member2 = new Member();
		
		System.out.println( member1 );
		
		member1.name = "이순신";
		member1.age = 23;
		
		System.out.println( member1.name +"\n"+ member1.age );
		
		member2.name = "김유신";
		member2.age = 34;
		
		System.out.println( member2.name +"\n"+ member2.age );
		
		//java 495p , 메모리최적화기법 - 893p
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "java";
		book1.page = 495;
		
		book2.title = "메모리최적화기법";
		book2.page = 893;
		
		// 스마트폰 제품명, 운영체제, 메모리(ram)크기에 대해 
		// 저장할 수 있는 클래스를 정의하고 인스턴스를 생성하여
		// 값 저장,출력하세요(스마트폰3개)
		
		스마트폰 phone1 = new 스마트폰();
		스마트폰 phone2 = new 스마트폰();
		스마트폰 phone3 = new 스마트폰();
		
		phone1.제품명 = "갤럭시S20";
		phone1.운영체제 = "Android";
		phone1.메모리크기 = 12;
		
		phone2.제품명 = "아이폰14";
		phone2.운영체제 = "IOS16";
		phone2.메모리크기 = 8;
		
		phone3.제품명 = "갤럭시탭5";
		phone3.운영체제 = "Android";
		phone3.메모리크기 = 150;
		
		
		System.out.println("스마트폰1 제품명 : "+ phone1.제품명 + "\n       운영체제 : "+phone1.운영체제 + "\n       메모리크기 : " + phone1.메모리크기 + "G");
		System.out.println();
		System.out.println("스마트폰2 제품명 : "+ phone2.제품명 + "\n       운영체제 : "+phone2.운영체제 + "\n       메모리크기 : " + phone2.메모리크기 + "G");
		System.out.println();
		System.out.println("스마트폰3 제품명 : "+ phone3.제품명 + "\n       운영체제 : "+phone3.운영체제 + "\n       메모리크기 : " + phone3.메모리크기 + "G");
		
		
		
	}

}

//책 제목과 총페이지수를 저장하기위한 클래스 정의
class 스마트폰
	{
		String 제품명;
		String 운영체제;
		int 메모리크기;
	}
class Book
	{
		String title;
		int page;
	}

// 클래스는 사용자 정의 데이터 타입 이라고 한다.
class Member		// Member 라는 이름의 클래스 정의
	{
		String name; //이름
		int age;	 //나이
	}
