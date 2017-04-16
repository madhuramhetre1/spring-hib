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
<h2>Consignee Registration</h2>
<form:form modelAttribute="consignee123" method="post">
		<table>
			<!-- <tr>
				<td>Consignee ID</td>
				<td><input type="text" name="consignmentId" /></td>
			</tr> -->
			<tr>
				<td>Consignee Name</td>
				<td><input type="text" name="consigneeName" /></td>
			</tr>
			<tr>
				<td>Consignee Address</td>
				<td><input type="text" name="consigneeAddress" /></td>
			</tr>
				<tr>
				<td>Consignment Date(mm/dd/yyyy)</td>
				<td><input type="date" name="consignmentDate" /></td>
			</tr>
			<tr>
				<td>Origin Place</td>
				<td><input type="text" name="originPlace" /></td>
			</tr>
			<tr>
				<td>Destination Place</td>
				<td><input type="text" name="destinationPlace" /></td>
			</tr>
			<tr>
				<td>Weight</td>
				<td><input type="text" name="weight" /></td>
			</tr>
			<tr>
				<td>Total Amount</td>
				<td><input type="text" name="rate" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>