package java_thread4;

public enum ThState 
{
	NEW, RUNNABLE, BLOCKED, WATING, TIME_WATING, TERMINATED
	
	
	
	
	
	
	
//	String num;
//	ThState(String num)
//	{
//		this.num = num;
//	}
//	
//	String getNum()
//	{
//		return this.num;
//	}
}

/*
 	상수들의 클래스처럼 사용할 수 있는 방법 - Enum
  
  
  
  
  
 	자바에서 상수 만드는 방법
 	final int num = 20;
 	num = 30; 오류
 
  	자바스크립트에서 상수 만드는 방법
  	const num = 10;
  	num = 30;  오류
  
  	menu <- 1.파일열기 2. 파일저장 3. 다른이름 저장 4. 환경설정 5. 종료
  	
  	enum Menu
  	{
  		OPEN, SAVE, SAVES, SET , EXIT
  		파일열기, 파일저장, 다른이름저장, 환경설정, 종료
  	}
  	
  	int menu = scan.nextInt();
  	
  	Switch( menu )
  	{
  		case Menu.파일열기 :
  		case Menu.파일저장 :
  		case Menu.SAVES :
  		case 4:
  		case 5:
  	}
  
  
  
  
  
  
  
 */
