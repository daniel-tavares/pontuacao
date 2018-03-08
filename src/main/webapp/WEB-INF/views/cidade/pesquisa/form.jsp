<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<c:url value="/resources" var="resourcePath" />

<link rel="stylesheet" href="${resourcePath}/assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${resourcePath}/assets/jAlert/jAlert.css">
<link rel="stylesheet" href="${resourcePath}/css/style.css">
</head>
<body>
     
    
    <div id="spinner" class="spinner" style="display:none;">
	  <img id="img-spinner" src="${resourcePath}/img/spinner.gif" alt="Loading"/>
	</div>
	<div class="container">
		<form class="formPesquisa form-inline">
			<div class="form-group">
				<label for="cidade">Cidade:</label> 
				<input id="cidade" type="text" name="cidade" class="form-control">
			</div>
			<div class="form-group">
				<label for="estado">Estado:</label> 
				<input id="estado" type="text" name="estado" class="form-control">
			</div>
			<button id="btn-pesquisar" type="button" class="btn btn-primary">Pesquisar</button>
		</form>

		<div class="resultadoPesquisa">
			<div id="result"></div>
		</div>
    </div>
	<script src="${resourcePath}/assets/jquery/jquery-3.3.1.min.js"></script>
	<script src="${resourcePath}/assets/bootstrap/js/bootstrap.min.js"></script>
	<script src="${resourcePath}/assets/jAlert/jAlert.js"></script>
	<script src="${resourcePath}/js/script.js"></script>
</body>

</html>