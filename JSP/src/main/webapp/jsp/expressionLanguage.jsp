<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Expression Language</title>
</head>
<body>
<jsp:include page="includes/header.jsp"/>
<%
    //Ici un peu de code java pour la démonstration.
    Integer maVariable = 10;
    //On place la variable en dans l'objet request,
    //Normalement c'est une servlet (ou un objet de service=classe métier=classe de mon modèle)
    // qui est chargé de faire ce travail.
    //puis on affichera la variable avec une EL
    //(Les El ${toto} recherchent dans les objets implicites automatiquement)
    request.setAttribute("maVariable",maVariable);
%>


<br/>
Pour vous simplifier la vie $ { }
valeur de maVariable : ${maVariable}  <br/>

Afficher ce qu'il y a dans une map : <br/>
<!-- ICI On utilise l'objet implicite header. c'est une MAP<String,String>
avec cette EL on accède à la valeur en indiquant la clef -->
${header['user-agent']}<br/>

<!-- les EL permettent de retrouver facilement les objets enregistrés dans Request, Session ou Application (servletContext)
On va stocker dans un sriplet une variable dans l'objet session et l'afficher simplement.-->
<%
    session.setAttribute("attribut2session", "helloSessionAttribute");
%>
Affichage de l'attribut stocké dans l'objet session : ${attribut2session}<br/>
<!-- voyez la doc pour retrouvez les champs dans un objet complexe. -->




</body>
</html>
