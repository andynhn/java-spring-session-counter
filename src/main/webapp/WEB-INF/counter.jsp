<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="js/time.js"></script>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <!-- <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> -->
    <title>Counter Page</title>
</head>
<body>
    <div class="container">
        <p>You have visited localhost:8080 <c:out value="${count}"></c:out> times.</p>
        <p><a href="/">Test another visit?</a></p>
        <p><a href="/double">Double the count?</a></p>
        <p><a href="/reset">Reset</a></p>
    </div>
</body>
</html>