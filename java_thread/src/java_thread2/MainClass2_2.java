package java_thread2;

public class MainClass2_2 
{

	public static void main(String[] args) 
	{
		NormalTh th = new NormalTh("일반");
		th.start();
		
		
//		DaemonTh dm = new DaemonTh();
//		dm.setDaemon(true);
//		
//		
//		dm.start();
		
		try 
		{
			Thread.sleep(6000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		
		System.out.println( "Main 종료" );

	}

}
