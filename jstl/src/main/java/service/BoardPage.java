package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardPage implements MainActive
{
	@Override
	public String action(HttpServletRequest req, HttpServletResponse res) {
		
		return "board/board,jsp";
	}
}
