<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<jsp:include page="jsp/includes/header.jsp"/>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet !</a><br/>
<a href="hello-servlet?nom=toto&age=29&taille=1m76&poids=69">Hello Servlet. Appel avec paramètres</a><br/>
<hr/>
LES JSP :<br/>
<a href="jsp/scriplets.jsp">Les scriplets</a><br/>
<a href="jsp/expressionLanguage.jsp">El : Expression Language $</a><br/>
<a href="jsp/EL-JSTL.jsp">taglib JSTL Core</a><br/>
</body>
</html>