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
<form:form modelAttribute="consigneeEdit123" method="post">
		<table>
			 <tr>
				<td>Consignee ID</td>
				<td><form:input type="text" path="consignmentId" readonly="true"/></td>
			</tr> 
			
			 <tr>
				<td>Consignee Name</td>
				<td><form:input type="text" path="consigneeName" readonly="true"/></td>
			</tr>
			<tr>
				<td>Consignee Address</td>
				<td><form:input type="text" path="consigneeAddress"  readonly="true"/></td>
			<tr>
			</tr> 
				<tr>
				<td>Delivery Date(mm/dd/yyyy)</td>
				<td><form:input type="date" path="deliveryDate" /></td>
			</tr>
		 <tr>
			     <td>Origin Place</td>
				<td><form:input type="text" path="originPlace" readonly="true"/></td>
			</tr>
			<tr>
				<td>Destination Place</td>
				<td><form:input type="text" path="destinationPlace" readonly="true" /></td>
			</tr>
			<tr>
				<td>Weight</td>
				<td><form:input type="text" path="weight" readonly="true" /></td>
			</tr>
			<tr>
				<td>Total Amount</td>
				<td><form:input type="text" path="rate" readonly="true"/></td>
			</tr> 
			<tr>
				<td>Delivery Boy</td>
				<td><form:input type="text" path="deliveryBoy" /></td>
			</tr>
			<tr>
				<td>Mobile No</td>
				<td><form:input type="text" path="consigneeMobileno" readonly="true"/></td>
			</tr>
			<tr>
				<td>Courier Status</td>
				<td>
				    <select name="status">
				    <option value="At local centre">At local centre</option>
				    <option value="Dispatched">Dispatched</option>
				    <option value="At destination centre">At destination centre</option>
				    <option value="On delivery">On delivery</option>
				    <option value="Delivered successfully">Delivered successfully</option>
				    </select>
				</td>
			</tr>
			
			<tr>
			<td><input type="submit" value="Update" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>