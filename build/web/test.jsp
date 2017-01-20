<%-- 
    Document   : test
    Created on : 8 déc. 2016, 19:11:51
    Author     : itu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String rep = request.getParameter("sel");
            %>
            <p><%=rep%></p>
        <h1>Hello World!</h1>
        <form action="#" method="POST">
            <select name="sel">
                <option value="1">1</option>
                <option value="2">2</option>
            </select>
            <input type="submit" value="ok"/>
        </form>
    </body>
</html>
