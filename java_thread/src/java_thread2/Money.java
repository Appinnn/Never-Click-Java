package java_thread2;

public class Money 
{
	private int myMoney = 10000;
	public int getMymoney()
	{
		return myMoney;
	}
	
	//widhdraw �޼��带 �Ӱ迵������ ����
	public synchronized boolean widhdraw(int money)
	{
		if( myMoney >= money )
		{
			//���� ���� �ݾ׺��� ��� �ݾ��� �۰ų� ���ٸ� ���	
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {}
			
			// ���
			myMoney -= money;
			return true;
		}
		return false; // ��� �Ұ�(�� ����)
	}
}
