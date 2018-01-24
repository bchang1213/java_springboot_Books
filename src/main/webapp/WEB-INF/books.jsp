<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Books</title>

</head>
<body>
	<h1>Books in a Table</h1>
	<a href="/books/new">Create New Book</a>
	<table class="table">
		<tr>
			<th>Book Name</th>
			<th>Description</th>
			<th>Language</th>
			<th>Number of Pages</th>
			<th>Actions</th>
		</tr>
		<c:forEach items="${books}" var="book">
		<tr>
		    <td><a href="/books/${book.id}"><c:out value="${book.title}"/></a></td>
		    <td><c:out value="${book.description}"/></td>
		    <td><c:out value="${book.language}"/></td>
		    <td><c:out value="${book.numberOfPages}"/></td>
		    <td>
		    		<a href="/books/${book.id}">info</a>
		    		<a href="/books/edit/${book.id}">edit</a>
		    		<a href="/books/delete/${book.id}">Delete</a>
		    </td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>