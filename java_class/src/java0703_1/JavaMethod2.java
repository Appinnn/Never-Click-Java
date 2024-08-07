package java0703_1;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Scanner;

public class JavaMethod2 {

	public static void main(String[] args) {
		
		Member member1 = new Member("이순신",31,"군인");
		Member member2 = new Member("문익점",29,"기계공학자");
		Member member3 = new Member("장영실",45,"섬유공장사장");
		
		// 추상클래스 - 객체를 만들지 못함 왜냐? 명확하지 않아서(쓰는 사람의 관점에 따라 내용이 따름)
		// 추상 클래스의 자식 클래스를 활용해서 객체 생성은 가능(독자적으로는 불가)
		
		// 태어난 년도
		
		member1.birth();
		member2.birth();
		member3.birth();
		
		// 나이 - 20대인가? 30대인가? 40대인가? 50대인가? 
		DataIdenti dataIdenti = new DataIdenti();
		
		dataIdenti.ageGroup(member1.name, member1.age);
		dataIdenti.ageGroup(member2.name, member2.age);
		dataIdenti.ageGroup(member3.name, member3.age);
		
		dataIdenti.nationalJob(member3.name, member3.job);
		
	
		
		// 직업분류 - 국가직무 분류에 따라 표기
		// 출력 내용 - 이순신 : 05.국방
		// 국가 직무 분류
		// 군인 - 05.국방 // 기계공학자 - 15.기계 // 섬유공장사장 - 18.섬유의복  
		
//		System.out.println( today.getDayOfMonth() );
		
		// 년도 - .getYear()
		// 월  - .getMonthValue()
		// 일  - .getDayOfMonth();
		// 요일 - .getDayOfWeek().getValue();  - 1(월요일), 2(화요일), 3(수요일)...7(일요일)
		
		
		
//		Calendar cal = Calendar.getInstance();
//		int year = cal.get( Calendar.YEAR );
//		int 월 = cal.get( Calendar.MONTH ) +1;
//		int 일 = cal.get( Calendar.DAY_OF_MONTH );
//		int 요일 =  cal.get( Calendar.DAY_OF_WEEK );
//		
//		System.out.println( year );
//		System.out.println( 요일 );
		
//		Date today = new Date();
//		System.out.println(today.getMonth()+1 );
	}

}

// 메서드나 함수를 사용하는 이유
// 배열, 계산, 단순 출력 - 반복문
// 메서드를 사용하면 코드의 재사용과 유지보수, 가독성이 좋아 진다.
// 메서드를 사용하면 구조화된 프로그래밍이 가능하다.



// 컨트롤(제어)용 클래스 - 동작을 호출해줌 , 실제기능의 동작 클래스, 데이터 클래스
// 	Controller , 					Service , 		DTO 또는 VO   <<- 실제 용어

class DataIdenti // 연령대, 직업 분류 등등 데이터 분류를 위한 클래스
{
	void ageGroup( String name, int age )
	{
		String group = null;
		group = (age/10) + "0대";
		System.out.println( name+" : "+ group );
	}
	void nationalJob( String name, String job)
	{
		  String ncs = null;
		  
		  switch(job)		  
		  {
		  case "군인": ncs = "05.국방";
			  break;
		  case "섬유공장사장": ncs = "18.섬유의복";
			  break;
		  
		  case "기계공학자": ncs = "15.기계";
			  break;
		  }
		  System.out.println( name + " : " + ncs);
		  
		  // 정수 두개 입력받아 합을 출력하기
//		  Calc calc = new Calc();
//		  calc.sum();
		  
		
	}
}


class Member
	{
		String name; // 이름
		int age; // 나이
		String job; // 직업
		// 기본 생성자 메서드
		Member(){}
		//매개변수가 있는 생성자 메서드
		Member(String name, int age, String job)
		{
			this.name = name;
			this.age = age;
			this.job = job;
		}
		//태어난 연도 언제인가 출력하는 메서드
		void birth()
		{
			LocalDate today = LocalDate.now();
			int nowYear = today.getYear();
			// 화면 출력 - 이순신 태어난 년도 : 0000년
			
			int BirthYear1 = nowYear - this.age;
			System.out.printf( "%s 태어난 년도 : %d년 \n", this.name,BirthYear1);
		}
	}

//class Calc
//{
//	void sum()
//	{
//		Scanner scan = new Scanner(System.in);
//		System.out.print("첫번째 정수 :");
//		int num1 =  scan.nextInt();
//		System.out.print("두번째 정수 :");
//		int num2 =  scan.nextInt();
//		int result = num1 + num2;
//		System.out.println("합 : " + result);
//	}
//}

	
