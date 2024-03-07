<jsp:useBean id="numeros" scope="request" type="java.util.ArrayList"/>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - PAGE</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>

<hr/>
EL : récupération d'un objet en Request ou en session :<br/>
${messageRequest}<br/>
${messageSession}<br/>
<hr/>
<br/>
<strong>Trois manières de faire la même chose</strong>
<hr/>
Affichage automatique d'une liste avec les EL :<br/>
${numeros}<br/>
<hr/>
Utilisation de TAGs spécifiques : Taglib jstl version 2.0: <br/>
Foreach sur la liste :<br/>
<c:forEach var="item" items="${numeros}">
    ${item}
</c:forEach>
<hr/>
Utilisation du java imbriqué dans la jsp pour afficher la liste :<br/>
<% for(int i = 0; i < numeros.size(); i+=1) { %>
<tr>
    <td><%=numeros.get(i)%></td>
</tr>
<% } %>
<hr/>
Lecture des paramètres de la requête entrante :<br/>
<c:forEach var="item" items="${param}">
    ${item.key} :  ${item.value}<br/>
</c:forEach>
<br>
<hr/>
TD SUR LES JSP : <br/>
USER AGENT:<br/>
<%
    String ua = request.getHeader("user-agent");
    response.getWriter().println(ua);

%>
${header["user-agent"]}<br/>
<c:out value="${header['user-agent']}" /><br/>
--------
${requestScope.keySet()}<br/>
${requestScope["jakarta.servlet.forward.context_path"]}
${requestScope["jakarta.servlet.forward.servlet_path"]}
--------------------<br/>
Variables :<br/>
<%
    request.setAttribute("var","var-request");
    session.setAttribute("var","var-session");
%>
${var}<br/>
${sessionScope.var}

</body>
</html>