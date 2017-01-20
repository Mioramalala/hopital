<%-- 
    Document   : insertPat
    Created on : 20 déc. 2016, 16:43:22
    Author     : itu
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.util.Date"%>
<%@page import="fonction.Liste"%>
<%@page import="connexion.Connect"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String nom = request.getParameter("nom");
    String prenom = request.getParameter("prenom");
    String dates = request.getParameter("date");
    String profession = request.getParameter("profession");
    try
    {
    Connection c;
         c = Connect.getCon();
         Liste liste = new Liste();
         PreparedStatement stat1;
         Statement stm2  = c.createStatement();;
         ResultSet rs = stm2.executeQuery("SELECT nextval('seqpat')");
         rs.next();
                       String sequence = rs.getString(1);
                       String ref = sequence+"pat";
         Date naissance = liste.convertDate(dates);
         stat1 = c.prepareStatement("insert into patient(nomppat,prenompat,date_naissancepat,profession,refpat) values('"+nom+"','"+prenom+"','"+naissance+"','"+profession+"','"+ref+"')");

                            stat1.executeUpdate();
    }
    catch(Exception e)
    {
        out.print(e.getMessage());
    }
    %>
