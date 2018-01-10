<%@page import="java.util.List"%>
<%@page import="in.vamsoft.daoimplfactory.EmployeeDaoImplFactory"%>
<%@page import="in.vamsoft.employeeDaoImpl.EmployeeDaoImpl"%>
<%@page import="in.vamsoft.model.Department"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index Page</title>
</head>
<body>

	<form action="EmployeeDetails" method="post">

		<select name="id">
			<%
			  EmployeeDaoImpl emp = EmployeeDaoImplFactory.getInstance();
			  List<Department> list = emp.getAlldepartments();
			  for (Department list1 : list){
			%>
			<option value="<%=list1.getDepId()%>"><%=list1.getDepId()+":"+list1.getDepName()%></option>
            <% } %>
		</select>
        <input type="submit" value="Get Employees"/>
	</form>
	<br><br><br>
	
	<a href="AddEmployee.html"><button>Add New Employee</button></a>
	<br><br><br>
    <a href="DeleteEmployeeHtml.html"><button>Delete Employee</button></a>

</body>
</html>