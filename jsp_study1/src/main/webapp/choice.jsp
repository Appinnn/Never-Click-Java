<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<jsp:useBean id="lunch" class="test.Lunch"   />
<jsp:setProperty name="lunch" property="*"   />

식당 이름 : <jsp:getProperty name="lunch" property="restaurant"/> <br>
점심 메뉴 : <jsp:getProperty name="lunch" property="menu" /> <br>
음식 가격 : <jsp:getProperty name="lunch" property="price" /> 원




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
</body>
</html>