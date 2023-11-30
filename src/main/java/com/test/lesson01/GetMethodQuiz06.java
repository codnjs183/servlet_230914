package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz06")
public class GetMethodQuiz06 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json");
		
		// 리퀘스트
		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.parseInt(request.getParameter("number2"));

		
		// 프린터
		PrintWriter out = response.getWriter();
		
		// 연산
		int addi = number1 + number2;
		int subt = number1 - number2;
		int mult = number1 * number2;
		int divi = number1 / number2;
		
		// 출력
		// {"addition": 1570, "subtraction": 1430, "multiplication": 105000, "division": 21"}

		out.print("{\"addition\": " + addi 
				+ ", \"subtraction\": " + subt 
				+ ", \"multiplication\": " + mult 
				+ ", \"division\": " + divi + "}");

		
	}
}
