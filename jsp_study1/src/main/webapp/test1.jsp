<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList , java.util.LinkedList"%>
<%@ page import="java.util.Date" errorPage="error500.jsp" buffer="10kb" autoFlush="false" 
	import="java.util.Scanner"%>

<%! //include 동작전 
	//String name ="이순신";
	//out.println(name);
	int age;
	
	int sum(int a, int b) // 번수 선언
	{
		return a+b;	
	}
	
	class mem  // 클래스 정의
	{
		String userName;
	}
	// if,for 같은 제어문 사용불가
	// sum(10,20); 메서드 호출 안됨
			
	
%>



<% //스크립틀릿
	sum(10,20); //메서드 호출 가능
			if( age > 15 ) //제어문 사용가능
			{	
			}
	String job = "군인"; // 변수 선언 가능
	
	// void print() 메서드, 클래스 정의는 불가
	// {
	//	 out.println("출력출력")
	// }
	
	

%>





<%@ include file="menu.jsp"%>    


 <% 
    // int num = 10/0;
 	out.println("테스트");
 %>  
<%--
	<%@ - JSP 지시어 스크립트 작성 부분
	 지시어란 해당 JSP 페이지의 설정을 하기 위한 부분이다.
	 page -> jsp페이지의 속성을 지정 하는 역할
	 		language    : 페이지에 사용할 언어셋 설정
	 		contentType : 페이지 문서 타입 지정
	 		pageEncoding : 현재 페이지의 인코딩 타입 지정
	 		import      : 다른 패키지의 클래스나 메서드를 추가
	 		session     : 세션 사용여부를 지정
	 		isErrorPage : true일 경우 현재 페이지를 에러 페이지로 지정
	 		errorPage   : 현제페이지에 에러 발생시 사용될 페이지로 지정
	 				  클라이언트 브라우저에는 서버언어(Java)가 노출되면 안된다.
	 		info        : 페이지의 설명
	 		extends     : 현제 페이지에 상속받을 클래스 지정
	 		buffer      : jsp 페이지의 출력버퍼값 지정(기본 8kb)
	 		autoFlush   : 출력버퍼가 기본보다 초과되면 수행할 기능 지정
	 					true 일 경우 버퍼가 100% 상태 일때의 내용을 브라우저 화면에 출력
	 					false 일 경우 IOException 발생
	 					
	 					예외처리 에서 throw를 하는 이유와 같이 기록(log)을 남겨두기 위해
	 					false 로 사용하기도 한다.
	 					
	 		
	 include -> 다른 JSP 페이지를 추가하기( 현제 페이지에 내용을 포함)
	 taglib -> 태그라이브러리 태그를 사용할 경우에 사용




	JSP 주석 - 사용자 브라우저에서는 확인되지 않는다.
			  오직 서버 컴퓨터에서만 동작한다.(사용자에게 노출 X)
			  
	웹 흐름
	서버컴퓨터란 - 서비스를 제공하는 컴퓨터이다.
	 클라이언트가 주소에 의한 요청을 하면 서버컴퓨터는 요청에 대한 응답을 한다.
	  페이지를 보기 위해 해당 페이지에 대한 주소를 요청하면 -> 서버는 해당 페이지를 찾아서 페이지 내부의 서버언어(Java)를 실행 시키고
	  클라이언트언어(HTML,CSS,JS) 부분을 클라이언트에게 전송한다.
	   클라이언트는 서버로 부터 받은 부분 내용을 클라이언트 컴퓨터 내부의 브라우저가 실행 하여 화면에 출력 시킨다.


 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>