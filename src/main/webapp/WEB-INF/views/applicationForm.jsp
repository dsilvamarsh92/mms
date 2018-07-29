<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<body>




	<div class="w3-container">

		<form:form modelAttribute="applicationForm" method="POST"
			action="addApplicationForm">
			<table>
				<tr>
					<td><form:label path="userName">User Name</form:label></td>
					<td><form:input path="userName" /></td>
				</tr>
				<tr>
					<td><form:label path="religion">Religion</form:label></td>
					<td><form:input path="religion" /></td>
				</tr>
				<tr>
					<td><form:label path="subCaste">Sub Caste</form:label></td>
					<td><form:input path="subCaste" /></td>
				</tr>
				<tr>
					<td><form:label path="education">Education</form:label></td>
					<td><form:input path="education" /></td>
				</tr>
				<tr>
					<td><form:label path="profession">Profession</form:label></td>
					<td><form:input path="profession" /></td>
				</tr>
				<tr>
					<td><input name="Register" value="Register" type="submit"></td>
				</tr>

			</table>


		</form:form>
	</div>

	<div class="w3-container">

		<table>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Religion</th>
				<th>Sub Caste</th>
				<th>Education</th>
				<th>Profession</th>
			</tr>
			<c:forEach items="${applicationFormList}" var="appForm">
				<tr>

					<td>${appForm.userId}</td>
					<td>${appForm.userName}</td>
					<td>${appForm.religion}</td>
					<td>${appForm.subCaste}</td>
					<td>${appForm.education}</td>
					<td>${appForm.profession}</td>


				</tr>

			</c:forEach>

		</table>


	</div>

	<div>
	
	<c:if test="${not empty lists}">

		<ul>
			<c:forEach var="listValue" items="${lists}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>

	</c:if>
	
	</div>
</body>
</html>