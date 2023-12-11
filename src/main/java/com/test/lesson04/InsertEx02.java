package com.test.lesson04;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/leson04/ex02_insert")
public class InsertEx02 extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		// 응답을 직접 내리지 않기 때문에 response header에 세팅하는 content
		
		// 사용자 정보 request params 꺼내기
		String name = request.getParameter("name");
		String yyyymmdd = request.getParameter("yyyymmdd");
		String email = request.getParameter("email");
		String introduce = request.getParameter("introduce");

		
		// DB 연결
		
		// DB Insert 쿼리 수행
		
		// DB 연결 해제
		
		// 사용자 목록 화면으로 이동
	}

}
