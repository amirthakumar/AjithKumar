<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<h2 >Hi Hello Ajith</h2>
<% String[] name={"Ajith","Kumar"}; %>
<button onclick="myFunction()">Click</button>
<script type="text/javascript">

function myFunction() {
	
	<%
	for(String s:name)
		{request.setAttribute("name",s ); 
		
		out.print(request.getAttribute("name"));
		}%>
	
}


</script>


</body>
</html>