package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz10")
public class PostMethodQuiz10 extends HttpServlet {
	
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "marobiana");
	        put("password", "qwerty1234");
	        put("name", "신보람");
	    }
	};
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		// param request
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		
		PrintWriter out = response.getWriter();
		
		boolean loginSuccess = true;
		
		out.print("<html><head><title>로그인 정보</title></head><body>");
		
		if(userId.equals(userMap.get("id")) == false) {
			out.print("id가 일치하지 않습니다.<br>");
			loginSuccess = false;
		}
		if(userPw.equals(userMap.get("password")) == false) {
			out.print("password가 일치하지 않습니다.<br>");
			loginSuccess = false;
		}
		if(loginSuccess) {
			out.print(userMap.get("name") + "님 환영합니다!");
		}
		out.print("</body></html>");
		
	}

}
