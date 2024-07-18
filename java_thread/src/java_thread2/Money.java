package java_thread2;

public class Money 
{
	private int myMoney = 10000;
	public int getMymoney()
	{
		return myMoney;
	}
	
	//widhdraw 메서드를 임계영역으로 설정
	public synchronized boolean widhdraw(int money)
	{
		if( myMoney >= money )
		{
			//현재 보유 금액보다 출금 금액이 작거나 같다면 출금	
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {}
			
			// 출금
			myMoney -= money;
			return true;
		}
		return false; // 출금 불가(돈 부족)
	}
}
