package java_thread1;

public class MeThread extends Thread
{
	public static int num = 10; // 클래스 변수
	private int time; // sleep에 적용할 시간
	public MeThread(int time, String name)
	{
		super(name);
		this.time = time;
	}
	
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		for( int i=1; i<=5; i++)
		{
			System.out.println( "쓰레드명 : " + name +" 공유num : " + num );
			
			num++;
			if( num == 17) break;
			
			try 
			{
				Thread.sleep( time );
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}



/*
  	sleep(밀리세컨드) - 지정된 시간 만큼 대기
  	start() - 쓰레드 시작, run 메서드 호출
  	join() - 해당 쓰레드가 끝날때까지 다음 쓰레드 대기 상태로 지정
  	run() - 쓰레드가 제일 처음으로 실행되는 메서드
  	stop() - 쓰레드를 중단( 사용을 권장하지 않음)
  	interrupt() - 쓰레드를 중단
  	setPriority(정수값) - 쓰레드의 우선순위 설정
  	getPriority() - 설정된 쓰레드의 우선순위값 가져오기
  	isAlive() - 현재 쓰레드가 살아있냐? 살아있다면 true, 종료되었다면 false
  	
  	suspend() - 쓰레드를 일시 정지 시킨다. ( 사용을 권장하지 않음)
  	resume() - 일시정지된 쓰레드를 다시 실행 (사용을 권장하지 않음)
  	
  	yield() - 다른 쓰레드에게 현재 실행 상태를 양보하고 대기 상태로 들어감.  (일시정지 상태와 동일)
  	notify() - 현재 대기 상태에 있는 쓰레드를 다시 실행대기 상태로 변환
  				실행대기 상태에 있는 쓰레드는 실행 상태로 변환된다.
  */

















