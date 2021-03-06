<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="css/registration.css" type="text/css" rel="stylesheet">
<link href="css/header.css" type="text/css" rel="stylesheet">
<link href="css/cart.css" type="text/css" rel="stylesheet">
<link href="css/jquery-ui.css" type="text/css" rel="stylesheet">
<link href="css/footer.css" type="text/css" rel="stylesheet">
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/header.js" type="text/javascript"></script>
<script src="js/jquery-ui.js" type="text/javascript"></script>
<script src="js/jquery.ui.dialog-clickoutside.js" type="text/javascript"></script>
<title>Увійти</title>
</head>
<body>
	<div id="wrapper">
		<jsp:include page="WEB-INF/header.jsp" />
		<div id="login">
			<h2>Увійти</h2>
			<c:if test="${requestScope.isRegistered}">
				<p id="error">Такий e-mail не існує, або не збігається пароль</p>
			</c:if>
			<form action="Login" method="POST" name="login">
				<p>
					E-mail<span class="required_star">*</span>:<br> <input class="datainput" type="text" name="email" required>
				</p>
				<p>
					Пароль<span class="required_star">*</span>:<br> <input class="datainput" type="password" name="password" maxlength="32" required>
				</p>
				<div id="confLog">
					<input class="conf" type="submit" name="login" value="Увійти">
				</div>
			</form>
		</div>
		<div class="clear"></div>
		<%@include file="WEB-INF/footer.jsp"%>
	</div>
</body>
</html>