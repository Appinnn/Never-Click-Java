package java0710_3;

public class ExceptionTest3 {

	public static void main(String[] args) 
	{
		try
		{
			throw new NullPointerException("aa");
		}
		catch(Exception e)
		{
			System.out.println("���� ���� �߻�");
		}

	}

}
