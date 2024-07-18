package java_thread2;

public class DaemonTh extends Thread
{
	@Override
	public void run()
	{
		System.out.println( "데몬 쓰레드 실행 ");
		while(true)
		{
			System.out.println("자동 저장");
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}


/*
  데몬 쓰레드
  	주 쓰레드를 보조 하는 쓰레드
  	주 쓰레드가 종료 되면 데몬쓰레드도 종료된다.
  	
  	주 쓰레드는 직접 제어를 해야 하지만
  	데몬 쓰레드는 주 쓰레드의 영향을 받지 않는다.
  	 영향을 받지 않기 때문에 별도의 제어를 하지 않아도 된다.
  
 */
