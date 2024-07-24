<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<% 
	out.print("출력");
	out.newLine();
	out.println("정수,실수,문자,문자열 출력가능");

	//page == this
			
	String name = "이순신";
			
	pageContext.getRequest().getParameter(name);
	pageContext.setAttribute("age", 25);
	
	// pageContext.include("requestTest2.jsp");  // <%@ include file="경로">
	pageContext.forward( "내장객체1.jsp");

%>
    
   
<jsp:include  page="파일명" />
<jsp:forward page="파일명" />    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=pageContext.getAttribute("age") %>
</body>
</html>