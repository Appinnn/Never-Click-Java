package java0702_2;

public class ClassObject {

	public static void main(String[] args) 
	{
		
		
		
		Car car1 = new Car(); // carName, 배기량, 연료 의 변수 생성
		car1.carName = "쏘나타";
		car1.연료 = "휘발유";
		car1.제조사 = "기아";
		
		Car car2 = new Car("그랜져",3000,"휘발유");
		
		Novel novel1 = new Novel("김건우",4580,4.3f);
		Novel novel2 = new Novel("김경제",3485,4.1f);
		Novel novel3 = new Novel("박재범",90930,2.7f);
		Novel novel4 = new Novel("서석완",19200,3.1f);
		Novel novel11 = new Novel("김건우",4.3f);
		Novel novel22 = new Novel("김경제",4.1f);
		Novel novel33 = new Novel("박재범",2.7f);
		Novel novel44 = new Novel("서석완",3.1f);
		
		System.out.println(novel1);
		System.out.println(novel2);
		System.out.println(novel3);
		System.out.println(novel4);
		System.out.println(novel11);
		
//		System.out.println(novel1.name +" "+ novel1.point+" "+ novel1.gpa);
//		System.out.println(novel2.name +" "+ novel2.point+" "+ novel2.gpa);
//		System.out.println(novel3.name +" "+ novel3.point+" "+ novel3.gpa);
//		System.out.println(novel4.name +" "+ novel4.point+" "+ novel4.gpa);
		
		
		/*
		 * 데이터 : 이름 , 포인트 , 평점
		 * 		  김건우 , 4580, 4.3
		 * 		  김경제 , 3485, 4.1
		 * 	 	  박재범 , 90930, 2.7
		 * 		  서석완 , 19200, 3.1
		 * 
		 * 웹소설 작가들의 구독자 평점과, 소설 뷰 횟수에 따른 포인트 점수이다.
		 * 위 내용을 저장 할 수 있는 클래스를 정의하고 데이터 입력 후 출력하세요
		 *	(매개변수 있는 생성자 메서드는 두개 이상 구현) 
		 * 
		 */
	}

	
}

// 클래스 내부에 선언되는 변수(또는 배열)는 두가지가 있다.
// 클래스 변수 , 인스턴스 변수
// 인스턴스 변수 공간은 클래스 객체 생성을 해야만 메모리 할당이 된다.
// 클래스 객체 생성은 new 연산자를 통한다.
// 클래스 변수는 프로그램 실행 할때 메모리에 로드하면서 생성된다.

// 생성자 메서드 - 객체(인스턴스) 공간을 생성할 때 공간을 초기화 해주는 메서드
// 생성자 메서드 - return이 존재하지 않는다.
// 				return을 하면 안되는 이유는 생성자 메서드에서는 return 타입 지정이 안되기 때문
// 오버로딩 - 오버로딩 구현 조건
//			1. 같은 클래스 내부에서만 가능하다.
//			2. 메서드의 이름은 같아야 한다.
//			3. 매개변수의 타입은 다르게 선언 되어야 한다.
//			4. 매개변수의 갯수가 달라야 한다.
class Novel
	{
		String name;
		int point;
		float gpa;
		Novel(){}
		
		Novel(String name, float gpa)
			{
				this.name = name;
				this.gpa = gpa;
			}
		
		Novel( String name , int point , float gpa)
			{
				this.name = name;
				this.point = point;
				this.gpa = gpa;	
			}
		public String toString()
			{
				return name+" "+point+"점 "+ gpa;
			}
	}
class Car
	{
		static String 제조사 = "현대"; // 클래스 변수
	
		String carName; // 인스턴스 변수
		int 배기량; // 인스턴스 변수
		String 연료; // 인스턴스 변수
		
		//생성자 메서드
		Car()
			{
				//생성자 메서드 내용 - 인스턴스 변수의 초기값 지정
				연료 = "휘발유"; // new 연산자에 의해 객체 생성시 연료변수에 "휘발유"가 저장된다.
			}
		
		// 매개변수가 있는 생성자 메서드
		Car( String 연료 )
		 	{
				this.연료 = 연료;
		 	}
		Car( String name , int cc , String fuel )
			{
				this.carName = carName;
				배기량 = cc;
				this.연료 = fuel;
			}
	}
