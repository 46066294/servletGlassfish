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
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js"></script>
    <script src="https://cdn.firebase.com/js/client/2.2.4/firebase.js"></script>
    <script src="https://cdn.firebase.com/libs/angularfire/1.1.3/angularfire.min.js"></script>

    <title>ServidorXifratCesar</title>

    <!-- Importamos Bootstrap  -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

    <!-- Barra de navegación -->
    <nav class="navbar navbar-default">
        <div class="container-fluid">

            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand">Marc Cano | Poblenou </a>
            </div>

        </div>
    </nav>
</head>

<body>
<center>

    <h1>Xifrat Cesar</h1>
    <p>Introdueix text per xifrat Cesar</p>

    <form action="MarcCano" method="post">
        <input name="value" type="text"/>
        <input type="submit" value="Enviar"/>
    </form>

</center>
</body>
</html>
