package java0710_3;

public class ExceptionTest1 {

	public static void main(String[] args) 
	{
		
		try 
		{
			String name = null;
			String a = "aaa";
			String b = "bbb";
			String c = null;
			name.length();
			a.length();
			b.length();
			c.length();
			System.out.println( 10/0 );
			
			
		}
		catch(NullPointerException n)
		{
			n.printStackTrace(); //�����޼��� Ȯ�� - �׽�Ʈ�� 
			System.out.println(n.getMessage());
			System.out.println(n.getClass());
		}
		catch(Exception e)
		{
			System.out.println("0 ���� ������ �ϸ� �ȵ�");
		}
		
		
		System.out.println(" ���Ⱑ ���α׷� ��");	
	}

}

/*
  ����ó��
  - ���α׷� �����߿� ������ �߻��ϸ� ��� ���α׷��� ���� �ȴ�.
  	 ����ó���� ���ָ� ������ �߻��ص� ���α׷��� ������� �ʵ��� �� �� �ִ�.
  - ����ڰ� �߸��� ���� �Է��� ��쿡 �˷��� �� �ִ�.
  - ������ ������ �ذ��ϴ� ����� �ƴϰ�, ȸ���ϴ� ����̴�.
  		
  
  
  
  
  
 */