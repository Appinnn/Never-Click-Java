package java0627;

import java.util.Scanner;

public class Loop {
	
	static Scanner sc = new Scanner( System.in );

	public static void main(String[] args) 
	{
		// 반복문 - for, while, do~while
		// for(초기값; 조건식; 증감식)
		// {
		//   반복내용
		// }
		// 조건식이 거짓이 될 때까지 중괄호 내용이 계속 실행된다.
		// 순서는 초기값 -> 조건식비교 -> **참 일경우 -> 중괄호 -> 증감식 -> 조건식비교 -> **참 일경우 -> 중괄호 -> 증감식 -> 조건식비교 -> **거짓일경우 -> 종료
		
//		for(int i=1;i<=17; i++)
//		{
//			
//			System.out.println("아...반복문..." + (i));
//			i++;
//			
//		}
		
//		int num = 1;
//		int a=1;
//		num = num + a;
//		System.out.println(num); //2
//		a++;
//		num = num +a;
//		System.out.println(num); //4
//		a++;
//		num = num +a;
//		System.out.println(num); //7
//		
		// 1부터 내가 입력한 숫자까지의 총합을 구하세요.
		
//		System.out.println( "숫자를 입력하세요" );
		
//		int num = sc.nextInt();
//		int sum =0;
//		for(int i=1; i<=num; i++)
//		{
//			sum = sum+i;
//			System.out.println(sum);
//			
//		}
		
		// 반복문은 작성하려면 몇번 반복되는가, 언제 반복문이 종료되어야 하는가
		// 반복문 종료시점에 대해서 먼저 생각해야한다.
		// for문, while문,  do~while문 모두 언제 반복이 끝나야 하는가 를
		// 찾지못하면 작성 할 수 없다. (무한 루프이든, n번 반복 이든)
//		int num1 = -1;
//		for( ; num1 != 0; )
//			{
//				System.out.print( "정수 입력" );
//				num1 = sc.nextInt();
//				
//			}
		
		// 무한루프 종료 시키는 방법
		// 1. if문의 조건식이 참 이되면 break 실행 
		// 2. for(; 조건식; )
		// 3. return; - 반복문 코드가 있는 메소드를 종료시키기 때문에 반복문도 종료 된다.
		// 4. break; - 반복문, switch문 사용가능   if문 단독으로 break 사용불가
		// if( 10>5 ) break; <<-- 사용 불가
		
		// continue; - 현재 반복을 중단하고, 다음 반복으로 넘겨줌
		
//		for( int i=1; i<=10; i++ )
//			{
//				System.out.println( i+"번째 반복 시작" );
//				if( i%3 == 0 )
//					continue;
//				System.out.println( i+"번째 반복 진행중" );
//				System.out.println( i+"번째 반복 마지막내용" );
		
		// 자바의 랜덤
		
		// 랜덤의 범위( 1~50 )
		// 랜덤 값 계속 출력
		// 랜덤값이 11의 배수 일 경우 반복문 종료
//		int random = (int) Math.floor(Math.random()*50)+1;
//		for( ; true; )
//			{
////				int num1 = (int)Math.floor(Math.random()*50)+1;
//				int num1 = (int) (Math.random()*50)+1;
//				if( num1 %11 == 0) 
//					break;
//				System.out.println(num1);
//				
//			}
		
		
		// up & Down
		// 컴퓨터 가 제시한 숫자 맞추기
		// 컴퓨터가 제시하는 숫자는 랜덤으로 (랜덤범위 20~100)
		// 컴퓨터가 제시한 숫자가 74라면
		// 내가 입력한 숫자가 40일 경우 up이라고 출력
		// 내가 입력한 숫자가 80일 경우 Down이라고 출력
		
//		int com = (int) (Math.random()*81)+20;
//		
//		for( int i=1; true; i++ )
//			{
//				System.out.println("숫자를 입력하세요 : ");
//				int user = sc.nextInt();
//				if(user == com )
//				{
//					System.out.println(" 정답! \n 컴퓨터 : "+com);
//					break;
//				}
//				else if(user<20)
//				{
//					System.out.println("20보다 큰 값을 입력하세요");
//				}
//				else if(user>100)
//				{
//					System.out.println("100보다 작은 값을 입력하세요");
//				}
//				else if(user < com )
//				{
//					System.out.println("Up");
//					
//				}
//				else if( user > com )
//				{
//					System.out.println("Down");
//					
//					
//				}
//				
//				i++;
//			}
		
		// 이름이 있는 반복문
		int sum = 0;

			더하기:for( int i=1; i<=10; i++)
					{
					for( int k=1; k<=4; k++)
					{
						if( sum + k >= 40 ) continue 더하기;
						sum = sum+k;
						
						System.out.println(" " + k);
					}
					System.out.println(i);
					sum = sum +i;
				}
				
				if(sum < 40 )
				{
					System.out.println( sum );
				}
				

				// 베스킨라빈스 31
				// 컴퓨터와 나하고 둘이 한다.
				// 한번에 제시할 수 있는 숫자는 최소 1개, 최대 3개
				// 31을 입력하면 패배
				
				int num = 1;
				베스킨:
				for(;;) //while(true)
				{
					System.out.println("숫자 몇개 : ");
					int user = sc.nextInt();
					System.out.print("나 : ");
					for( int u = 1; u<=user; u++)
					{
						System.out.print( num + " " );
						if( num == 31) break 베스킨;
						num++;
					}
					
					System.out.println();
					
					int com = (int) (Math.random()*3)+1;
					System.out.println( "컴퓨터 : ");
					for( int c = 1; c<=com; c++)
					{
						System.out.print( num + " " );
						if( num == 31) break 베스킨;
						num++;
					}
					
					System.out.println();
				}
			
			
			
			
			
			
			}
		}	

	
