<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--html 태그 삭제 
    	
    	이름과 국어 수학 과학 성적을 받아서
    	평균이 90이상 이면 참 잘했어요
    	80 이상이면 잘했어요
    	70이상이면 노력해라
    	나머지는 이게 점수야!   출력
    
    --%>
    
    <% 
    	String name = request.getParameter("name");
    	int result = Integer.parseInt(request.getParameter("kor"));
    	int result2 = Integer.parseInt(request.getParameter("mat"));
    	int result3 = Integer.parseInt(request.getParameter("sci"));
    	
    	int total = (result+result2+result3);
    	int avr = total/3;
        
    %>
    <div>이름 : <%=name %></div>
    <div> 평균 : <%=avr %></div>
    <div> 종합평가 : <%if(avr>=90)
    {
    	out.println("참 잘했어요");
    }
    else if(avr>=80)
    {
    	out.println("잘했어요");
    }
    else if(avr>=70)
    {
    	out.println("노력해라");
    }
    else
    {
    	out.print("이게 점수야!");
    }
    %></div>
    <hr>
    <%@ include file="requestTest2.jsp" %>
    
    
    
    
    
