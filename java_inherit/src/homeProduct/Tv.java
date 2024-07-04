package homeProduct;

public class Tv extends House
{
	int channel = 10; // 채널
	int vol = 5;     // 소리
	
	Tv() // 생성자 메서드
	{
		super();
	}
	Tv(String brand, int price) // 매개 변수가 있는 생성자 메서드
	{
		super(brand,price); // 부모클래스 생성자메서드 호출
	}
	
	void channelUp()
	{
		this.channel++;
	}
	
	void channelDown()
	{
		this.channel--;
	}
	
}
