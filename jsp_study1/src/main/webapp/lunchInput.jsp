<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>점심 메뉴 정하기</h3>
	<form method="post" action="choice.jsp">
		점심메뉴이름 : <input type="text" name="menu"> <br>
		식당이름 : <input type="text" name="restaurant"> <br>
		가격 : <input type="number" name="price" > <br>
		<button>등록</button>
	</form>
</body>
</html>