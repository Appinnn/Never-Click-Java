package java0712_2;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) 
	{
		int[] �ϵ� = new int[] {8,12,23,29,35,41};
		
		ArrayList<Lotto> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ڵ� ����? : ");
		int howMany = sc.nextInt();
		
		for(int i=0; i<=howMany; i++)
		{
			int[] temp = new int[6];
			for(int k=0; k<temp.length; k++) // 6�� ���� �ߺ�����
			{
				temp[k] = (int)(Math.random()*45)+1;
				for(int j=0; j<k; j++)
				{
					if(temp[k] == temp[j] )
					{
						k--; break;
					}
				}
				
			}
			list.add( new Lotto(temp) );
		}
		
list.forEach( it -> System.out.println(it) );
	
	
	//���� ������ �ζ� ��ȣ�� �߿� 3���� 4���� ��ΰ�?
	// 3���� 5�����ڰ� ��ġ, 4���� 4���� ���ڰ� ��ġ
	int ��� =0;  
	int ��� = 0;
	for( Lotto lotto : list )
	{
		int cnt = 0;
			int[] temp =lotto.getNum();
			for(int i : temp )
			{
				
				for(int k : �ϵ�)
				{
					if( i == k )
						cnt++;
				}
			}
			if( cnt == 5) ���++;
			if( cnt == 4) ���++;
			
	}
	System.out.println("3�� "+ ���+"��");
	System.out.println("4�� "+ ���+"��");
	

}
}
