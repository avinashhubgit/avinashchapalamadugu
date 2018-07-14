<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1 style="color: red; text-align: center">Employee reords</h1>
<c:choose>
	<c:when test="${!empty listrdto}">
		<table border="1" bgcolor="cyan">
			<c:forEach var="rdto" items="${listrdto }">
				<tr bgcolor="#oooFFo">
					<td><c:out value="${rdto.sno }" /></td>
					<td><c:out value="${rdto.empno}" /></td>
					<td><c:out value="${rdto.ename }" /></td>
					<td><c:out value="${rdto.job }" /></td>
					<td><c:out value="${rdto.sal }" /></td>
					<td><c:out value="${rdto.deptno }" /></td>
					<td><c:out value="${rdto.mgr }" /></td>
					<td><c:out value="${rdto.comm }" /></td>
				<tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
	 no records found
	</c:otherwise>
</c:choose>