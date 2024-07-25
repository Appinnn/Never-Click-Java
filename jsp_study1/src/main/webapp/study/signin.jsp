<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<div id="signinBox">
	<form id="signFm" method="post" action="signCheck.jsp">
		<div class="loginInput">
			<b>아이디</b>
			<input type="text" name="userId" id="userId">
			<p class="error"></p>
		</div>
		<div class="loginInput">
			<b>비밀번호</b>
			<input type="password" name="userPassword" id="userPassword">
			<p class="error"></p>
		</div>
		<button type="button" id="loginBt">로그인</button>
	</form>
	<p><a href="findUser.jsp">아이디/비밀번호 찾기</a></p>
	<p><a href="signup.jsp">회원가입</a></p>
</div>


<style>
	.error
	{
		color: red;
		font-size: 14px;
	}

</style>
<script>
	let bt = document.getElementById("loginBt");
	bt.addEventListener("click",function() // 로그인 버튼 클릭시 이벤트 등록 및 실행 함수를 정의
		{
			let id = document.getElementById("userId");
			let pw = document.getElementById("userPassword");
			if( id.value == '' ) // 아이디 입력을 하지 않은 경우
				{
					document.getElementsByClassName("error")[0].innerText="아이디를 입력하세요";
				}
			else if( pw.value == '' ) // 비밀번호 입력을 하지 않은 경우
				{
						
				}
		});

</script>


<%--
	로그인 페이지를 만드세요
	전송방식 : post
	전송 url : signCheck.jsp
	아이디 파라미터 : userId
	비밀번호 파라미터 : userPassword
	아이디/비밀번호 찾기 url : findUser.jsp
	회원가입 url : signup.jsp
--%>
