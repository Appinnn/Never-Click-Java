<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Scanner"%>
    
    
<%--
	JSP 스크립트릿
		JSP 스크립트릿 : <%  %>
				자바 로직 코드를 작성 ( 일반적인 코드 작성 )
		선언문 : <%!  %>
				자바 변수나 메서드, 클래스 정의 할 때
		표현식 : <%=  %>


 --%>  
 
 <%= 100 %>
 <%= "<br> 이순신" %>
 
 <%
 Scanner scan = new Scanner(System.in);
 int num = scan.nextInt();
 
 %>
 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>