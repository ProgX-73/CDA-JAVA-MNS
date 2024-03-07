<%--
  Created by IntelliJ IDEA.
  User: frena
  Date: 29/02/2024
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scriplets</title>
</head>
<body>
<jsp:include page="includes/header.jsp"/>
Mélange de code java et de HTML<hr/>

<%
    String maVariable = "Hello Scriplets!";

    for (int i = 0; i<11; i++){
%>
une ligne html dans une boucle java, c'est moche !<br/>
<%
    }
%>
<br/>
Affiche maVariable : <%=maVariable%>
<hr/>
Dans un scriplet, on accède aux mêmes éléments que dans une servlet par les objets implicites (request, response, etc...):<br/>
Vous pouvez voir tous les objets à disposition en tapant :
request : <%=request.getQueryString()%><br/>
La ligne est null mais si on ajoute des paramètres dans l'url...par exemple ajoutez : ?nom=toto dans l'url et actualisez.<br/>
Vous voyez maintenant vos paramètres grâce à request.getQueryString().<br/>
<hr/>
Le code JAVA que l'on écrit dans un scriplet est quasi identique à celui que l'on écrirait dans une servlet.<br/>
Il est simplifié par les objets implicites uniquement.
<!-- Explorer les objets  < %=%>-->

<br/>
<%
    long time = session.getCreationTime();
%>
Creation de la session : <%=time%>
</body>
</html>
