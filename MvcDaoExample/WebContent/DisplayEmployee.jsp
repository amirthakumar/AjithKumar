<%@page import="java.util.List"%>
<%@page import="in.vamsoft.daoimplfactory.EmployeeDaoImplFactory"%>
<%@page import="in.vamsoft.employeeDaoImpl.EmployeeDaoImpl"%>
<%@page import="in.vamsoft.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Employee Details</title>
</head>
<body>


	<%
	  EmployeeDaoImpl dao = EmployeeDaoImplFactory.getInstance();
	  List<Employee> list = dao.getAllemployees();
	%>
	<table>
		<thead>
			<tr>
				<td>Employee Id</td>
				<td>Employee Name</td>
				<td>Salary</td>
				<td>Date Of Join</td>
				<td>Department Id</td>
				<td>Update</td>
                <td>Delete</td>
		</thead>
		<%
		  for (Employee e : list) {
		%>
		<tbody>

			<tr>
				<td><%=e.getEmpId()%></td>
				<td><%=e.getName()%>
				<td><%=e.getSalary()%></td>
				<td><%=e.getDoj()%></td>
				<td><%=e.getDeptId()%></td>
				<td><a href="UpdateEmployee"><button>Update</button></a></td>
				<td><a href="DeleteEmployee?empid=<%=e.getEmpId()%>" ><button>Delete</button></a></td>
			</tr>
			<%
			  }
			%>

		</tbody>
	</table>


</body>
</html>