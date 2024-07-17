package java0716_1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapStudy2 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String,ImageBoard> board = new HashMap<>();
		
		ImageBoard temp = new ImageBoard("�ڹټ�ġ","javava","��ġ.jpg");
		board.put( temp.getTitle(), temp) ;
		temp = new ImageBoard("mysql��ġ���","��ġ�λ�","mysql��ġ.jpg");
		board.put( temp.getTitle(), temp );
		temp = new ImageBoard("å���������","å����","å�д¹��.jpg");
		board.put( temp.getTitle(), temp );
		temp = new ImageBoard("å�б�������","�۶�����","�۶����¹��.jpg");
		board.put( temp.getTitle(), temp );
		temp = new ImageBoard("�����ǿ","����ġ","�����.jpg");
		board.put( temp.getTitle(), temp );
		
		System.out.println( board.get("�ڹټ�ġ") );
		
		// �̹��� �Խ����� �� ������ ����ϰ�
		// ������� ���� ������ �Է��ϸ� �ش�
		// ���� ������ �� �� �ִ�.
		
		Set<String> titles = board.keySet();
		System.out.println( "=== �̹��� �Խ��� ��� ===" );
		
		titles.forEach( title -> System.out.println( title ) );
		
		System.out.println( "�� ���� �Է� : ");
		String inputTitle = sc.nextLine();
		
		System.out.println( board.get(inputTitle) );
	}

}
