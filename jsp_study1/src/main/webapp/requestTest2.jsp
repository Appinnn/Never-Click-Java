<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%-- 
    	학생 이름과 국어,수학,과학 성적 입력하여 제출 버튼을 클릭하기
    	전송 페이지 : result1.jsp
    	전송방식 : get
    
    
    --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="result1.jsp">
		<input type="text" name="name" placeholder="이름을 입력하세요">
		<br>
		<input type="text" name="kor" placeholder="국어 점수를 입력하세요"><br>
		<input type="text" name="mat" placeholder="수학 점수를 입력하세요"><br>
		<input type="text" name="sci" placeholder="과학 점수를 입력하세요"><br>
		
		<button> 입력 </button>
	
	
	</form>




</body>
</html>