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
<form:form modelAttribute="consigneeEdit123" method="post">
		<table>
		    <tr>
				<td>Consignment ID</td>
				<td><input type="text" name="consignmentId" /></td>
			</tr>
			<tr>
			<td><input type="submit" value="Update" /></td>
			</tr>
		</table>
	</form:form>
	<a h>
</body>
</html>