<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--
	회원 가입을 위해 입력 값을 Member 클래스 객체로 저장하고 객체의 데이터를 데이터베이스에 저장한다.
--%>


<jsp:useBean id="newMem" class="study.Member" />
<jsp:setProperty property="*" name="newMem" />

<% 
	//newMem 객체의 데이터를 데이터베이스에 저장
	// 1. 데이터베이스 드라이버 로드
	// 2. 데이터베이스 계정 접속
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver";)
	}
	catch(Exception e)
	{
		System.out.println("드라이버 로드 실패");
	}
	
	//계정 접속
	String user="appin";
	String password="alclssha12";
	String url="jdbc:mysql//localhost:3306/Appin";
	
	Connection conn = null;
	PreparedStatement pt = null;
	try
	{
		
	}
	catch(SQLException e)
	{
		System.out.println("접속 실패");
	}

%>


