<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${sessionScope.user123.role}:${sessionScope.user123.username}
<form:form modelAttribute="employee123" method="post">
		<table>
			<!-- <tr>
				<td>Employee ID</td>
				<td><input type="text" name="empId" /></td>
			</tr> -->
			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="empName" /></td>
			</tr>
			<tr>
				<td>Employee Address</td>
				<td><input type="text" name="empAddress" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>
                <form:radiobutton path="gender" value="male" />Male
                <form:radiobutton path="gender" value="Female"/>Female  
                </td>
			</tr>
			<tr>
				<td>Birth Date(mm/dd/yyyy)</td>
				<td><input type="date" name="dob" /></td>
			</tr>
			<tr>
				<td>Qualification</td>
				<td><input type="text" name="qualification" /></td>
			</tr>
			<tr>
				<td>Designation</td>
				<td><input type="text" name="designation" /></td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td><input type="text" name="mobileno" /></td>
			</tr>
			<tr>
				<td>Email ID</td>
				<td><input type="text" name="emailId" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>