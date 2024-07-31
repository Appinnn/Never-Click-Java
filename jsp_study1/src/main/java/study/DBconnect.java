package study;
import java.sql.*;

public class DBconnect 
{
	public Connection conn;
	public PreparedStatement pt;
	public ResultSet rs;
	public DBconnect()
	{
		dblink();
	}
	private void dblink()
	{
		//드라이버 로드
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(Exception e)
			{
				System.out.println("드라이버 로드 실패");
			}
				
		//계정 접속
			String user = "Appin";
			String password = "alclssha12";
			String url = "jdbc:mysql://localhost:3306/appin";
				
				
			try
			{
				conn = DriverManager.getConnection(url, user, password);
			}
			catch(SQLException e)
			{
				System.out.println("접속 실패");
			}
	}
}
