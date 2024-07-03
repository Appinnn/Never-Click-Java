package java0703_1;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Scanner;

public class JavaMethod2 {

	public static void main(String[] args) {
		
		Member member1 = new Member("�̼���",31,"����");
		Member member2 = new Member("������",29,"��������");
		Member member3 = new Member("�念��",45,"�����������");
		
		// �߻�Ŭ���� - ��ü�� ������ ���� �ֳ�? ��Ȯ���� �ʾƼ�(���� ����� ������ ���� ������ ����)
		// �߻� Ŭ������ �ڽ� Ŭ������ Ȱ���ؼ� ��ü ������ ����(���������δ� �Ұ�)
		
		// �¾ �⵵
		
		member1.birth();
		member2.birth();
		member3.birth();
		
		// ���� - 20���ΰ�? 30���ΰ�? 40���ΰ�? 50���ΰ�? 
		DataIdenti dataIdenti = new DataIdenti();
		
		dataIdenti.ageGroup(member1.name, member1.age);
		dataIdenti.ageGroup(member2.name, member2.age);
		dataIdenti.ageGroup(member3.name, member3.age);
		
		dataIdenti.nationalJob(member3.name, member3.job);
		
	
		
		// �����з� - �������� �з��� ���� ǥ��
		// ��� ���� - �̼��� : 05.����
		// ���� ���� �з�
		// ���� - 05.���� // �������� - 15.��� // ����������� - 18.�����Ǻ�  
		
//		System.out.println( today.getDayOfMonth() );
		
		// �⵵ - .getYear()
		// ��  - .getMonthValue()
		// ��  - .getDayOfMonth();
		// ���� - .getDayOfWeek().getValue();  - 1(������), 2(ȭ����), 3(������)...7(�Ͽ���)
		
		
		
//		Calendar cal = Calendar.getInstance();
//		int year = cal.get( Calendar.YEAR );
//		int �� = cal.get( Calendar.MONTH ) +1;
//		int �� = cal.get( Calendar.DAY_OF_MONTH );
//		int ���� =  cal.get( Calendar.DAY_OF_WEEK );
//		
//		System.out.println( year );
//		System.out.println( ���� );
		
//		Date today = new Date();
//		System.out.println(today.getMonth()+1 );
	}

}

// �޼��峪 �Լ��� ����ϴ� ����
// �迭, ���, �ܼ� ��� - �ݺ���
// �޼��带 ����ϸ� �ڵ��� ����� ��������, �������� ���� ����.
// �޼��带 ����ϸ� ����ȭ�� ���α׷����� �����ϴ�.



// ��Ʈ��(����)�� Ŭ���� - ������ ȣ������ , ��������� ���� Ŭ����, ������ Ŭ����
// 	Controller , 					Service , 		DTO �Ǵ� VO   <<- ���� ���

class DataIdenti // ���ɴ�, ���� �з� ��� ������ �з��� ���� Ŭ����
{
	void ageGroup( String name, int age )
	{
		String group = null;
		group = (age/10) + "0��";
		System.out.println( name+" : "+ group );
	}
	void nationalJob( String name, String job)
	{
		  String ncs = null;
		  
		  switch(job)		  
		  {
		  case "����": ncs = "05.����";
			  break;
		  case "�����������": ncs = "18.�����Ǻ�";
			  break;
		  
		  case "��������": ncs = "15.���";
			  break;
		  }
		  System.out.println( name + " : " + ncs);
		  
		  // ���� �ΰ� �Է¹޾� ���� ����ϱ�
//		  Calc calc = new Calc();
//		  calc.sum();
		  
		
	}
}


class Member
	{
		String name; // �̸�
		int age; // ����
		String job; // ����
		// �⺻ ������ �޼���
		Member(){}
		//�Ű������� �ִ� ������ �޼���
		Member(String name, int age, String job)
		{
			this.name = name;
			this.age = age;
			this.job = job;
		}
		//�¾ ���� �����ΰ� ����ϴ� �޼���
		void birth()
		{
			LocalDate today = LocalDate.now();
			int nowYear = today.getYear();
			// ȭ�� ��� - �̼��� �¾ �⵵ : 0000��
			
			int BirthYear1 = nowYear - this.age;
			System.out.printf( "%s �¾ �⵵ : %d�� \n", this.name,BirthYear1);
		}
	}

//class Calc
//{
//	void sum()
//	{
//		Scanner scan = new Scanner(System.in);
//		System.out.print("ù��° ���� :");
//		int num1 =  scan.nextInt();
//		System.out.print("�ι�° ���� :");
//		int num2 =  scan.nextInt();
//		int result = num1 + num2;
//		System.out.println("�� : " + result);
//	}
//}

	
