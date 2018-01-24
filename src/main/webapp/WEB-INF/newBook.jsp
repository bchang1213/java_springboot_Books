<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>New Book</title>
	<style>
		fieldset{
			width: 180px;
		}
		errors{
			display: block;
		}
	</style>
</head>
<body>
	<fieldset>
		<legend>Create New Book</legend>
		<form:form method="POST" action="/books/new" modelAttribute="book">
		    <form:label path="title">Title
		    <form:errors path="title"/>
		    <form:input path="title"/></form:label>
		    <form:hidden path="id"/>
		    <form:label path="description">Description
		    <form:errors path="description"/>
		    <form:textarea path="description"/></form:label>
		    
		    <form:label path="language">language
		    <form:errors path="language"/>
		    <form:input path="language"/></form:label>
		    
		    <form:label path="numberOfPages">Pages
		    <form:errors path="numberOfPages"/>     
		    <form:input type="number" path="numberOfPages"/></form:label>
		    
		    <input type="submit" value="Submit"/>
		</form:form>
	</fieldset>
</body>
</html>