<%@page import="in.vamsoft.testutil.ReadExcel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type = "text/javascript" >

   function preventBack(){window.history.forward();}

    setTimeout("preventBack()", 0);

    window.onunload=function(){null};

</script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result Page</title>
</head>
<body>

	<h2>Hello ${sessionScope.name} Your Score Is</h2>
	<%!int result;
  String answer;%>

	<%
	  answer = ReadExcel.readAnswer(1, 6);

	  if (answer.equalsIgnoreCase(request.getParameter("Ans1"))) {
	    result++;
	  }

	  answer = ReadExcel.readAnswer(2, 6);
	  if (answer.equalsIgnoreCase(request.getParameter("Ans2"))) {
	    result++;
	  }

	  answer = ReadExcel.readAnswer(3, 6);
	  if (answer.equalsIgnoreCase(request.getParameter("Ans3"))) {
	    result++;
	  }

	  answer = ReadExcel.readAnswer(4, 6);
	  if (answer.equalsIgnoreCase(request.getParameter("Ans4"))) {
	    result++;
	  }

	  answer = ReadExcel.readAnswer(5, 6);
	  if (answer.equalsIgnoreCase(request.getParameter("Ans5"))) {
	    result++;
	  }

	  answer = ReadExcel.readAnswer(6, 6);
	  if (answer.equalsIgnoreCase(request.getParameter("Ans6"))) {
	    result++;
	  }

	  String answer6 = ReadExcel.readAnswer(7, 6);
	  if (answer6.equalsIgnoreCase(request.getParameter("Ans7"))) {
	    result++;
	  }

	  answer = ReadExcel.readAnswer(8, 6);
	  if (answer.equalsIgnoreCase(request.getParameter("Ans8"))) {
	    result++;
	  }

	  answer = ReadExcel.readAnswer(9, 6);
	  if (answer.equalsIgnoreCase(request.getParameter("Ans9"))) {
	    result++;
	  }

	  answer = ReadExcel.readAnswer(10, 6);
	  if (answer.equalsIgnoreCase(request.getParameter("Ans10"))) {
	    result++;
	  }
	%>

	<%="Total Score Is" + " "+ result + " Out of 10 "%><br><br><br>
	
	<a href="LogOut.jsp"><button>LogOut</button></a>
	  	  
	


</body>
</html>