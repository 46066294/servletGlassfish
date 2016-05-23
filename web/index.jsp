<%--
  Created by IntelliJ IDEA.
  User: Mat
  Date: 23/05/2016
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>ServidorXifratCesar</title>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <a class="navbar-brand">Marc Cano ECAIB --M06-- </a>
            </div>
        </nav>
    </head>

    <body>
        <h1>Xifrat Cesar</h1>
        <p>Introdueix text per xifrat Cesar</p>

        <form action="MarcCano" method="post">
            <input name="missatge" type="text"/>
            <input type="submit" value="Encriptar Cesar"/>
        </form>
    </body>
</html>
