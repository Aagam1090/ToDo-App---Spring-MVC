<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title><c:out value="${page}"></c:out></title>
</head>
<body>

	<div class="container mt-3">
		<h2 class="text-center">Welcome to TODO Manager</h2>

		<div class="row mt-4">
			<div class="col-md-2">
				<h3 class="text-center">Options</h3>
				<div class="list-group">
					<a href='<c:url value='/add'/>'
						class="list-group-item list-group-item-action active">Menu</a> <a
						href="home" class="list-group-item list-group-item-action">View
						Todo</a> <a href="add" class="list-group-item list-group-item-action">Add
						Todo</a>
				</div>
			</div>
			<div class="col-md-10">
				<c:if test="${not empty msg}">
					<div class="alert alert-success text-center">
						<b><c:out value="${msg}"></c:out></b>
					</div>
				</c:if>
				<c:if test="${page == 'home'}">
					<h4 class="text-center">All todos</h4>
					
					
					<c:forEach items="${todos }" var="t">
						<div class="card">
							<div class="card-body">
								<h3><c:out value = "${t.todoTitle }"/></h3>
								<p><c:out value="${t.todoContent }"/></p>
							</div>
						</div>
						<br>
					</c:forEach>
					
				</c:if>
				<c:if test="${page == 'add'}">
					<h4 class="text-center">Add To-Do</h4>
					<br>
					<form:form action="saveTodo" method="POST" modelAttribute="todo">
						<div class="form-group">
							<form:input path="todoTitle" cssClass="form-control"
								placeholder="Enter the Todo Title"></form:input>
						</div>
						<br>
						<div class="form-group">
							<form:textarea path="todoContent" cssClass="form-control"
								placeholder="Enter the Todo Content" cssStyle="height:200px"></form:textarea>
						</div>
						<br>
						<div class="container text-center">
							<button class="btn btn-outline-success">Add Todo</button>
						</div>
					</form:form>

				</c:if>
			</div>
		</div>
	</div>



	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>