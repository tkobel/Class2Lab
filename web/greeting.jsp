<%-- 
    Document   : greeting
    Created on : Jan 26, 2014, 7:10:06 PM
    Author     : Tracy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Greeting Page</h1>
        <p>
            <%=request.getAttribute("greetingMessage")%>
        </p>
    </body>
</html>
