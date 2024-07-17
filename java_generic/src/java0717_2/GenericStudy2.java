package java0717_2;

import java.util.ArrayList;

public class GenericStudy2 
{

	public static void main(String[] args) 
	{
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add( new Book("B1234", "자바완전정복","김동형") );
		book.add( new Book("C4456", "자바정복실패","김실패") );
		book.add( new Book("D7689", "자바정복은꿈인가?","김의문") );
		
		dvd.add( new DVD("G0987","점심완전정복","박식사") );
		dvd.add( new DVD("H12356","배가고플때","박먹자") );
		dvd.add( new DVD("K5438","후식으로는역시","김커피") );
		
		//대여 하기
		Library lib = new Library();
		lib.addRental( book.get(0),"이순신");
		lib.addRental( dvd.get(2),"김춘추" );
		lib.showRentalList();
		
		
//		Rental<DVD> rent = new Rental<>( dvd.get(0), "이순신" );
//		System.out.println( rent );
//		
//		Rental<Book> brent = new Rental<>( book.get(1), "김춘추" );
//		System.out.println( brent );

	}

}

/*
 * 도서관에서 대여를 한다. 책을 대여 하거나 DVD를 대여할때 책과 DVD는 객체이기 때문에
 * 
 * 
 * */
