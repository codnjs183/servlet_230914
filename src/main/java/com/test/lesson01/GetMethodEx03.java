package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/ex03")
public class GetMethodEx03 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/plain");
		response.setContentType("text/json");
		
		// Request Parameter
		String userId = request.getParameter("user_id");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age")); 
		
		PrintWriter out = response.getWriter();
		
		// {"user_id":"myid123", "name":"내이름", "age":99}
		out.print("{\"user_id\":\"" + userId + "\", \"name\":\"" + name + "\", \"age\":" + age + "}");
		
		
//		out.println("결과");
//		out.println("user_id: " + userId);
//		out.println("name: " + name);
//		out.println("age: " + age);
	}

}


// add comment to test 