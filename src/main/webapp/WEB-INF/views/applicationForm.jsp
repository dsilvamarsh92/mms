<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<body>

	<div class=" w3-container w3-yellow w3-display-topright">


		<h2>Family Commission, Vasai Dioceses</h2>
		<h3>Vadhu-Var Suchack Mandal</h3>


	</div>


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
					
					<td><form:button name="Submit" value="Register"/>Register</td>
				</tr>
		
			</table>


		</form:form>
	</div>


</body>
</html>