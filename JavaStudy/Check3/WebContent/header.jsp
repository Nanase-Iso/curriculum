<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.text.SimpleDateFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body>
	<div class="header">
		<div class="header-label1">login</div>
		<div class="header-label2">
			<% Date date = new Date();
     		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
     		String formatDate = sdf.format(date);%>
  		<%= formatDate %>
  		</div>
  	</div>
