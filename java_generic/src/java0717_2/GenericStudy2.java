package java0717_2;

import java.util.ArrayList;

public class GenericStudy2 
{

	public static void main(String[] args) 
	{
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add( new Book("B1234", "�ڹٿ�������","�赿��") );
		book.add( new Book("C4456", "�ڹ���������","�����") );
		book.add( new Book("D7689", "�ڹ����������ΰ�?","���ǹ�") );
		
		dvd.add( new DVD("G0987","���ɿ�������","�ڽĻ�") );
		dvd.add( new DVD("H12356","�谡���ö�","�ڸ���") );
		dvd.add( new DVD("K5438","�Ľ����δ¿���","��Ŀ��") );
		
		//�뿩 �ϱ�
		Library lib = new Library();
		lib.addRental( book.get(0),"�̼���");
		lib.addRental( dvd.get(2),"������" );
		lib.showRentalList();
		
		
//		Rental<DVD> rent = new Rental<>( dvd.get(0), "�̼���" );
//		System.out.println( rent );
//		
//		Rental<Book> brent = new Rental<>( book.get(1), "������" );
//		System.out.println( brent );

	}

}

/*
 * ���������� �뿩�� �Ѵ�. å�� �뿩 �ϰų� DVD�� �뿩�Ҷ� å�� DVD�� ��ü�̱� ������
 * 
 * 
 * */
