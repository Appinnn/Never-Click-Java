package homeProduct;

public class Tv extends House
{
	private int channel = 10; // ä��
	private int vol = 5;     // �Ҹ�
	
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	
	
	
	public Tv() // ������ �޼���
	{
		super();
	}
	public Tv(String brand, int price) // �Ű� ������ �ִ� ������ �޼���
	{
		super(brand,price); // �θ�Ŭ���� �����ڸ޼��� ȣ��
	}
	
	public void channelUp()
	{
		this.channel++;
	}
	
	public void channelDown()
	{
		this.channel--;
	}
	
	@Override
	public void power()
	{
		super.onOff = !super.onOff;
		System.out.println("Tv���� : " + super.onOff);
	}
	
}
// �����ε��� - ���ο� �޼��带 �����ϴ°�
// �������̵��� - ������ �޼��带 ������ �ϴ°�


// �������̵� ����
// 1.�θ�Ŭ������ �ش� �޼��尡 �����ؾ��Ѵ�.
// 2.�������̵� �޼���� �ݵ�� ��ȯŸ��, �޼��� �̸�, �Ű������� ��� ���ƾ��Ѵ�.
// 3.�޼�����{ } ������ �޶� �ȴ�.
