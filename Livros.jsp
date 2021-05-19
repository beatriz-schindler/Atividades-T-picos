<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<% if(request.getParameter("titulo") == null || request.getParameter("ano") == null || request.getParameter("autor") == null){
		out.println("<h2>Por favor, digite todos os parâmetros (título/ano/autor) na URL para melhor visualização</h2>"); 
		} else{
			out.println("<h2>Título: "+request.getParameter("titulo")+"<br>"+"Ano: "+request.getParameter("ano")+
					"<br>"+"Autor: "+request.getParameter("autor")+"</h2>");
		}
	%>
	

</body>
</html>