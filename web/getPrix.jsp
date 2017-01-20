<%-- 
    Document   : getPrix
    Created on : 21 déc. 2016, 10:10:18
    Author     : itu
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="connexion.Connect"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String nom = request.getParameter("id").trim();
    Connection c;
         c = Connect.getCon();
        try
              {
                Statement stm = c.createStatement ();
                ResultSet rs = stm.executeQuery("select * from medicament where nommed='"+nom+"'");
                ResultSetMetaData rsmd = rs.getMetaData();
                //int nbCols = rsmd.getColumnCount();
                 
                while(rs.next())
                {
                    int idprix = rs.getInt(2);
                    Statement stm1 = c.createStatement ();
                    ResultSet rs1 = stm1.executeQuery("select * from prix where idprix="+idprix);
                    while(rs1.next())
                    {
                            out.print(rs1.getInt(2));
                    }
                }}
                catch(Exception e)
                        {
                            out.print(e.getMessage());
                        }
                %>
