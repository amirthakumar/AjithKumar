<%@page import="in.vamsoft.model.Employee"%>
<%@page import="in.vamsoft.service.EmployeeDetailsService"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="Index.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	List<Employee> list1 = (List<Employee>) session.getAttribute("EmployeeDetail");
	%>
	<table>

		<% if(list1.size()>0) {%>
		<thead>
			<tr>
				<td>EmployeeId</td>
				<td>EmployeeName</td>
				<td>Salary</td>
				<td>DateOfJoin</td>
			</tr>
		</thead>
		<tbody>
			<%
              for (Employee e : list1) {
            %>
			<tr>
				<td><%=e.getEmpId()%></td>
				<td><%=e.getName()%></td>
				<td><%=e.getSalary()%></td>
				<td><%=e.getDoj()%></td>
				<%
				  }
				%>

			</tr>
		</tbody>
		<%} else{ %>
		<h2>No Data Found</h2>
		<%} %>
	</table>

</body>
</html>