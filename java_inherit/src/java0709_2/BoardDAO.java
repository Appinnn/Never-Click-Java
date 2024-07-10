package java0709_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BoardDAO 
{
	private Connection conn; 	  // �����ͺ��̽� �������� ����
	private Statement st; 		  // SQL ���ɾ� ���ް� ��� �ޱ�(����ó��,�ӵ�����)
	private PreparedStatement pt; // SQL���ɾ� ���ް� ��� �ޱ�(����ó��,�ӵ�����)
	private ResultSet rs; 		  // ������ ��ȸ ��� ����
	
	public BoardDAO()
	{
		DriverLoad(); // �����ͺ��̽� ����̺� �ε�
		Connect();    // �����ͺ��̽� ����
	}
	
	// test_board ���̺��� �����͸� �����ͼ� BoardŬ���� ��ü�� �����ϱ�
	public Board[] findByAll()
	{
		Board[] list = new Board[7]; // BoardŬ���� ��ü 7�� �����ϱ� ���� �迭
		
		String sql = "select * from test_board"; //sql ���ǹ�, ������
		
		// select ���� - executeQuery �޼���
		// insert,update,delete ���� - executeUpdate �޼���
		try
		{
			st = conn.createStatement(); // statement ��ü ����
			rs = st.executeQuery(sql);
			int i = 0; // �迭�� �ε��� ����
			while(rs.next() )
			{
				list[i] = new Board( rs.getInt("board_id"),rs.getString("title"),
						rs.getString("writer"),rs.getString("content"),
						rs.getInt("hit") );
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.println("������ �������� ����");
		}
		
		return list;
	}
	
	private void DriverLoad() // ����̹� �ε�
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e)
		{
			System.out.println("����̹� �ε� ����");
		}
	}
	
	private void Connect() // �����ͺ��̽� ����
	{
		String username = "Appin";
		String password = "alclssha12";
		String url = "jdbc:mysql://localhost:3306/appin";
		
		try
		{
			conn = DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			System.out.println("���� ����");
		}
	}
	
}


/*
 * Connection, Statement �Ǵ� preparedStatement, ResultSet
 * �������� �ʿ�
 * 
 * 1. �����ͺ��̽��� �����ϱ� ���� ����̹� �ε�
 * 		mySQL 5���� ���� - com.mysql.cj.jdbc.Driver
 * 		5���� ���� - com.mysql.jdbc.Driver
 * 
 * 		Class. forName("com.mysql.cj.jdbc.Driver");
 * 
 * 
 * 2. �����ͺ��̽��� ���� �ϱ�
 * 		�����ͺ��̽� ������, ��й�ȣ, �ּ�
 * 		DriverManager.getConnection( �ּ�, ������, ��й�ȣ );
 * 		
 * 		 ������ �õ��� ����� Connection�� ���������� ����
 * 		 conn = DriverManager.getConnection
 * 
 * 3. conn�� ���ؼ� Statement �Ǵ� preparedStatement�� ��ü�� �����Ͽ�
 * 	  SQL���ɾ� ������
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */