<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body>
	<div id="wrapper">
 		<%@ include file="header.jsp"%>
<!-- name、idの入力エリアを作成しなさい -->
		<table>
			<tr>
		 	<th>name</th>
			<td><input type="text"></td>
			</tr>
			<tr>
			<th>id</th><td><input type="text"></td>
			</tr>
		</table>
		<%@ include file="footer.jsp"%>
	</div>
</body>
</html>
