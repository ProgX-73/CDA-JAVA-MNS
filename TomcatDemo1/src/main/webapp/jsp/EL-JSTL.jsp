<%@ page import="beans.Personne" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: frena
  Date: 01/03/2024
  Time: 06:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;}
        .tg td{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
            overflow:hidden;padding:10px 5px;word-break:normal;}
        .tg th{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
            font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}
        .tg .tg-0lax{text-align:left;vertical-align:top;}
        .bleu {background-color: cornflowerblue;}
     </style>
</head>
<body>
<jsp:include page="includes/header.jsp"/>
<c:forEach var="i" begin="1" end="10" varStatus="status">
    Itération : ${status.index} <br/>
    status.first : ${status.first},
    status.last : ${status.last},
    status.begin : ${status.begin},
    status.end : ${status.end},
    <hr/>
</c:forEach>


<!-- Affichage d'une liste de personnes -->

<table class="tg">
<c:forEach var="item" items="${listPersonne}" varStatus="status">
    <tr  ${status.index%2==0? 'class="bleu"' : ''}>
    <td>${item} :</td><td>${item.nom} ${item.prenom} ${item.age}</td></tr>
</c:forEach>
</table>
Mais... d'où viennent ces personnes ?
</body>
</html>
