package homeProduct;

public class MainClass {

	public static void main(String[] args) 
	{
		Tv tv = new Tv();
		tv.brand = "�Ｚ";
		tv.power();
		tv.power();
		System.out.println(tv.brand);
		
		Aircon air = new Aircon();
		air.brand = "LG";
		air.power();
		air.power();
		System.out.println(air.brand);

	}

}

// Ŭ���� ���
// ��� �Ϸ��� (�ڽ�Ŭ�����̸�) �ڿ� extends (�θ�Ŭ�����̸�) ����
// extends - Ȯ��,����...
// Tv extends House -> TvŬ������ �ڽ��̰� House�� �θ�Ŭ���� �̴�.
// ����� �ϴ� ���� ū ������ - ������
// �θ�Ŭ������ �ν��Ͻ� ����, �ν��Ͻ� �޼���, Ŭ���� ����, Ŭ���� �޼��� ��밡���ϴ�.
// ��, �θ�Ŭ������ ���� ��������� ���Ѵ�. �Ϻ� ��� �ɷ��ִ� ������ �޼���� ��� �Ұ�.

// �����ڸ޼��带 ���� �ν��Ͻ� �������� �ʱ�ȭ��
// �ڽ�Ŭ������ ������ �ִ� ������ �ڽ�Ŭ���� ������ �޼��忡�� �ʱ�ȭ
// �θ�Ŭ������ ������ �ִ� ������ �θ�Ŭ���� ������ �޼��忡�� �ʱ�ȭ








