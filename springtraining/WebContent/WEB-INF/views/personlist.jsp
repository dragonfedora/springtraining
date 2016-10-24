<%@taglib prefix="spring-form"
	uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@include file="/WEB-INF/views/header.jsp"%>

<div class="container">
	<div class="page-header">
		<H1>All Person</H1>
	</div>
	<table>
		<caption>
			<h2>List OF Person</h2>
		</caption>
		<thread>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Adhaar Number</th>
			<th>Contact No</th>
			<th>Address</th>
		</tr>
		</thread>
		<c:forEach items="${personList}" var="person">
			<tr>
				<td>${person.firstName}</td>
				<td>${person.lastName}</td>
				<td>${person.adhaarNo}</td>
				<td>${person.contactNumber}</td>
				<td>${person.address}</td>
			</tr>

		</c:forEach>


	</table>
</div>
<%@include file="/WEB-INF/views/footer.jsp"%>