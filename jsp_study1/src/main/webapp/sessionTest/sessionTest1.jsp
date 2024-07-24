<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Enumeration"%>

    
    
<%
    // 세션 - 웹 서버에서 생성하며 서버에 저장되고 복사하여 클라이언트에게도 전달
    //	   - 클라이언트와 서버의 연결을 유지 시켜주기 위해 사용
    //	   tomcat에서 클라이언트가 최초로 요청할때 session 객체를 생성한다.
    
    // 세션 값 생성
    session.setAttribute("testUser", "12389");

	//세션 만료 시간 설정 - 클라이언트가 별도의 요청을 하지 않으면 지정한 시간 이후에 세션 제거
	session.setMaxInactiveInterval( 10 * 60 );
	
	//세션 값 삭제
	session.removeAttribute("testUesr");
	
	//세션 전체 삭제
	session.invalidate();

	// Iterator
	Enumeration attr = session.getAttributeNames();
	while(attr.hasMoreElements())
	{
		String name = (String)attr.nextElement();
		String value = (String)session.getAttribute( name );
		out.println(name+" , "+value);
	}
    
    
    
    
    
%>