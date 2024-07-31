package study;

import javax.mail.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail 
{
	public static void sendEmail(String fromEmail, String title, String content)
	{
		// 문의글 등록되면 관리자 이메일로 전송하기
		final String adminEmail = "zerodimension@naver.com";
		final String password = "XL3HKFMBCLR1";
		
		// 관리자 이메일 환경설정 등록
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.naver.com"); // smtp 서버명
		prop.put("mail.smtp.port", "587");   // smtp 포트번호
		prop.put("mail.smtp.starttls.enable", "true"); // tls 사용여부
		prop.put("mail.smtp.auth", "true"); // smtp 서버인증
		
		// 문의글이 등록 되면 관리자 이메일로 전송 되어야 한다.
		// 보내는 사람과 받는 사람이 필요함.
		// 보내는 사람은 클라이언트 이지만 실제 클라이언트 메일에서 발송되는게 아니고 자바에서 발송하는것이기 때문에
		// 관리자가 보내고 받고를 해야한다.
		Session adminAuth = Session.getInstance(prop,
				new javax.mail.Authenticator()
				{
					protected PasswordAuthentication getPasswordAuthentication()
					{
						return new PasswordAuthentication(adminEmail, password);
					}
				}
					
				); // 보내는 사람 이메일 로그인 인증
		
		try
		{
			MimeMessage msg = new MimeMessage(adminAuth);
			msg.setFrom( new InternetAddress(adminEmail)); // 보내는 이메일 주소
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("dltkdals759@gmail.com")); // 받는 이메일 주소
			
			msg.setSubject("문의 글 등록[ "+title+" ]- "+fromEmail); // 이메일 제목
			msg.setText("<h3> 문의 내용 </h3> <b>"+content+				
					"</b> <div> <a href='http://localhost:8080/jsp_study1/study/?part=unquiry'>"
						+"문의글 확인 </a> </div>"
					); // 이메일 내용
			
			Transport.send(msg); // 메일 전송
					 
		}
		catch(MessagingException e)
		{
			e.printStackTrace();
			System.out.println("이메일 전송 실패");
		}
	}
}
