package java0702;

public class ClassBasic {

	public static void main(String[] args) 
	{
		// ���ǵ� Ŭ���� Ÿ���� ������ ���� �Ѵ�.
		// ������ ������ �����͸� �����Ѵ�.
		// Ŭ���� Ÿ������ ������ ������ ��ü �Ǵ� �ν��Ͻ� ��� �Ѵ�.
		
		// Ŭ���� �ν��Ͻ� ���� - ������ �޼���
		Member member1 = new Member();
		Member member2 = new Member();
		
		System.out.println( member1 );
		
		member1.name = "�̼���";
		member1.age = 23;
		
		System.out.println( member1.name +"\n"+ member1.age );
		
		member2.name = "������";
		member2.age = 34;
		
		System.out.println( member2.name +"\n"+ member2.age );
		
		//java 495p , �޸�����ȭ��� - 893p
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "java";
		book1.page = 495;
		
		book2.title = "�޸�����ȭ���";
		book2.page = 893;
		
		// ����Ʈ�� ��ǰ��, �ü��, �޸�(ram)ũ�⿡ ���� 
		// ������ �� �ִ� Ŭ������ �����ϰ� �ν��Ͻ��� �����Ͽ�
		// �� ����,����ϼ���(����Ʈ��3��)
		
		����Ʈ�� phone1 = new ����Ʈ��();
		����Ʈ�� phone2 = new ����Ʈ��();
		����Ʈ�� phone3 = new ����Ʈ��();
		
		phone1.��ǰ�� = "������S20";
		phone1.�ü�� = "Android";
		phone1.�޸�ũ�� = 12;
		
		phone2.��ǰ�� = "������14";
		phone2.�ü�� = "IOS16";
		phone2.�޸�ũ�� = 8;
		
		phone3.��ǰ�� = "��������5";
		phone3.�ü�� = "Android";
		phone3.�޸�ũ�� = 150;
		
		
		System.out.println("����Ʈ��1 ��ǰ�� : "+ phone1.��ǰ�� + "\n       �ü�� : "+phone1.�ü�� + "\n       �޸�ũ�� : " + phone1.�޸�ũ�� + "G");
		System.out.println();
		System.out.println("����Ʈ��2 ��ǰ�� : "+ phone2.��ǰ�� + "\n       �ü�� : "+phone2.�ü�� + "\n       �޸�ũ�� : " + phone2.�޸�ũ�� + "G");
		System.out.println();
		System.out.println("����Ʈ��3 ��ǰ�� : "+ phone3.��ǰ�� + "\n       �ü�� : "+phone3.�ü�� + "\n       �޸�ũ�� : " + phone3.�޸�ũ�� + "G");
		
		
		
	}

}

//å ����� ������������ �����ϱ����� Ŭ���� ����
class ����Ʈ��
	{
		String ��ǰ��;
		String �ü��;
		int �޸�ũ��;
	}
class Book
	{
		String title;
		int page;
	}

// Ŭ������ ����� ���� ������ Ÿ�� �̶�� �Ѵ�.
class Member		// Member ��� �̸��� Ŭ���� ����
	{
		String name; //�̸�
		int age;	 //����
	}
