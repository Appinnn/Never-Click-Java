package homeProduct;

public class Tv extends House
{
	int channel = 10; // ä��
	int vol = 5;     // �Ҹ�
	
	Tv() // ������ �޼���
	{
		super();
	}
	Tv(String brand, int price) // �Ű� ������ �ִ� ������ �޼���
	{
		super(brand,price); // �θ�Ŭ���� �����ڸ޼��� ȣ��
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
