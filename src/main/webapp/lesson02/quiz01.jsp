<%@page import="java.util.Iterator"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz01</title>
</head>
<body>

<%-- 1번 문제 --%>
<%!
public int sumNumbers(int num) {
	int sum = 0;
	for (int i = 1; i <= num; i++) {
		sum += i;
	}
	return sum;
}
%>
<h1>1부터 50까지의 합은 <%=sumNumbers(50)%>입니다.</h1>

<%-- 2번 문제 --%>
<%
int[] scores = {80, 90, 100, 95, 80};
int sumScores = 0;
for (int i = 0; i < scores.length; i++) {
	sumScores += scores[i];
}
double averageScore = (double)sumScores / scores.length;
%>
<h1>평균 점수는 <%=averageScore%>입니다.</h1>

<%-- 3번 문제 --%>
<%
List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
int numCorrAns = 0;

for (int i = 0; i < scoreList.size(); i++) {
	if (scoreList.get(i).equals("O")) {
		numCorrAns++;
	}
}
%>
<h1>채점 결과는 <%=numCorrAns * 10%>입니다.</h1>

<%-- 4번 문제 --%>
<%
String birthDay = "20010820";
int year = Integer.valueOf(birthDay.substring(0, 4));
int age = 2024 - year;
%>
<h1>20010820의 나이는 <%=age%>세 입니다.</h1>


</body>
</html>