<%-- 
    Document   : result
    Created on : 27 oct. 2016, 11:20:06
    Author     : itu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="fonction.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="obj" class="pers.Specialisation"/>
        <jsp:setProperty property="*" name="obj"/>
        <%
            int status=InsertDAO.insert(obj);
            if(status>0)
            {
                out.println("reussi");
            }
            else
            {
                out.println("erreur");
            }
        %>
    </body>
</html>
