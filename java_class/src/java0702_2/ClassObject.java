package java0702_2;

public class ClassObject {

	public static void main(String[] args) 
	{
		
		
		
		Car car1 = new Car(); // carName, ��ⷮ, ���� �� ���� ����
		car1.carName = "�Ÿ";
		car1.���� = "�ֹ���";
		car1.������ = "���";
		
		Car car2 = new Car("�׷���",3000,"�ֹ���");
		
		Novel novel1 = new Novel("��ǿ�",4580,4.3f);
		Novel novel2 = new Novel("�����",3485,4.1f);
		Novel novel3 = new Novel("�����",90930,2.7f);
		Novel novel4 = new Novel("������",19200,3.1f);
		Novel novel11 = new Novel("��ǿ�",4.3f);
		Novel novel22 = new Novel("�����",4.1f);
		Novel novel33 = new Novel("�����",2.7f);
		Novel novel44 = new Novel("������",3.1f);
		
		System.out.println(novel1);
		System.out.println(novel2);
		System.out.println(novel3);
		System.out.println(novel4);
		System.out.println(novel11);
		
//		System.out.println(novel1.name +" "+ novel1.point+" "+ novel1.gpa);
//		System.out.println(novel2.name +" "+ novel2.point+" "+ novel2.gpa);
//		System.out.println(novel3.name +" "+ novel3.point+" "+ novel3.gpa);
//		System.out.println(novel4.name +" "+ novel4.point+" "+ novel4.gpa);
		
		
		/*
		 * ������ : �̸� , ����Ʈ , ����
		 * 		  ��ǿ� , 4580, 4.3
		 * 		  ����� , 3485, 4.1
		 * 	 	  ����� , 90930, 2.7
		 * 		  ������ , 19200, 3.1
		 * 
		 * ���Ҽ� �۰����� ������ ������, �Ҽ� �� Ƚ���� ���� ����Ʈ �����̴�.
		 * �� ������ ���� �� �� �ִ� Ŭ������ �����ϰ� ������ �Է� �� ����ϼ���
		 *	(�Ű����� �ִ� ������ �޼���� �ΰ� �̻� ����) 
		 * 
		 */
	}

	
}

// Ŭ���� ���ο� ����Ǵ� ����(�Ǵ� �迭)�� �ΰ����� �ִ�.
// Ŭ���� ���� , �ν��Ͻ� ����
// �ν��Ͻ� ���� ������ Ŭ���� ��ü ������ �ؾ߸� �޸� �Ҵ��� �ȴ�.
// Ŭ���� ��ü ������ new �����ڸ� ���Ѵ�.
// Ŭ���� ������ ���α׷� ���� �Ҷ� �޸𸮿� �ε��ϸ鼭 �����ȴ�.

// ������ �޼��� - ��ü(�ν��Ͻ�) ������ ������ �� ������ �ʱ�ȭ ���ִ� �޼���
// ������ �޼��� - return�� �������� �ʴ´�.
// 				return�� �ϸ� �ȵǴ� ������ ������ �޼��忡���� return Ÿ�� ������ �ȵǱ� ����
// �����ε� - �����ε� ���� ����
//			1. ���� Ŭ���� ���ο����� �����ϴ�.
//			2. �޼����� �̸��� ���ƾ� �Ѵ�.
//			3. �Ű������� Ÿ���� �ٸ��� ���� �Ǿ�� �Ѵ�.
//			4. �Ű������� ������ �޶�� �Ѵ�.
class Novel
	{
		String name;
		int point;
		float gpa;
		Novel(){}
		
		Novel(String name, float gpa)
			{
				this.name = name;
				this.gpa = gpa;
			}
		
		Novel( String name , int point , float gpa)
			{
				this.name = name;
				this.point = point;
				this.gpa = gpa;	
			}
		public String toString()
			{
				return name+" "+point+"�� "+ gpa;
			}
	}
class Car
	{
		static String ������ = "����"; // Ŭ���� ����
	
		String carName; // �ν��Ͻ� ����
		int ��ⷮ; // �ν��Ͻ� ����
		String ����; // �ν��Ͻ� ����
		
		//������ �޼���
		Car()
			{
				//������ �޼��� ���� - �ν��Ͻ� ������ �ʱⰪ ����
				���� = "�ֹ���"; // new �����ڿ� ���� ��ü ������ ���ắ���� "�ֹ���"�� ����ȴ�.
			}
		
		// �Ű������� �ִ� ������ �޼���
		Car( String ���� )
		 	{
				this.���� = ����;
		 	}
		Car( String name , int cc , String fuel )
			{
				this.carName = carName;
				��ⷮ = cc;
				this.���� = fuel;
			}
	}
