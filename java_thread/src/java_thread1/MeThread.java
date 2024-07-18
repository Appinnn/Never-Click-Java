package java_thread1;

public class MeThread extends Thread
{
	public static int num = 10; // Ŭ���� ����
	private int time; // sleep�� ������ �ð�
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
			System.out.println( "������� : " + name +" ����num : " + num );
			
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
  	sleep(�и�������) - ������ �ð� ��ŭ ���
  	start() - ������ ����, run �޼��� ȣ��
  	join() - �ش� �����尡 ���������� ���� ������ ��� ���·� ����
  	run() - �����尡 ���� ó������ ����Ǵ� �޼���
  	stop() - �����带 �ߴ�( ����� �������� ����)
  	interrupt() - �����带 �ߴ�
  	setPriority(������) - �������� �켱���� ����
  	getPriority() - ������ �������� �켱������ ��������
  	isAlive() - ���� �����尡 ����ֳ�? ����ִٸ� true, ����Ǿ��ٸ� false
  	
  	suspend() - �����带 �Ͻ� ���� ��Ų��. ( ����� �������� ����)
  	resume() - �Ͻ������� �����带 �ٽ� ���� (����� �������� ����)
  	
  	yield() - �ٸ� �����忡�� ���� ���� ���¸� �纸�ϰ� ��� ���·� ��.  (�Ͻ����� ���¿� ����)
  	notify() - ���� ��� ���¿� �ִ� �����带 �ٽ� ������ ���·� ��ȯ
  				������ ���¿� �ִ� ������� ���� ���·� ��ȯ�ȴ�.
  */

















