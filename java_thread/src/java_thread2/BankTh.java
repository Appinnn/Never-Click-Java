package java_thread2;

public class BankTh implements Runnable
{
	Money my = new Money();
	
	@Override
	public void run()
	{
		while(my.getMymoney() > 0 )
		{
			//��ݱݾ�
			int money = (int)((Math.random()*3)+1) * 1000;
			if( my.widhdraw(money) )
			{
				System.out.println( Thread.currentThread().getName() + " -> ��� : " +money+", �ܾ� : "+my.getMymoney());
			}
			else // ��� ���� - �ܾ׺���
			{
				System.out.println( "��� �ź� - �ܾ� ����" );
			}
		}
	}
}