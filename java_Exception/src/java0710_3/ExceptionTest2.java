package java0710_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) 
	{
		
			Scanner sc = new Scanner(System.in);
			int num=0;
			boolean is = true;
		do 
		{
			try 
			{				
				System.out.println("���� �Է� : ");
				num = sc.nextInt();			
				is = false;
			}
			catch(InputMismatchException e)
			{
				System.out.println("������ �Է��϶��!");				
			}
			finally
			{
				sc.nextLine();
			}
		}
		while(is);
			System.out.println( num + 100 );
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.println( name );

	}

}
