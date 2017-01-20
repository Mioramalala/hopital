<%-- 
    Document   : selectD
    Created on : 10 nov. 2016, 14:18:04
    Author     : itu
--%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="connexion.Connect"%>
<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
     JSONObject obj = new JSONObject();
        JSONArray arr = new JSONArray();
            Connection c;
         c = Connect.getCon();
        try
              {
                Statement stm = c.createStatement ();
                ResultSet rs = stm.executeQuery("select * from patient");
                ResultSetMetaData rsmd = rs.getMetaData();
                //int nbCols = rsmd.getColumnCount();
                 
                while(rs.next())
                {
                        obj.put("id",rs.getString("IDPAT"));
                        obj.put("nom",rs.getString("NOMPAT"));
                        obj.put("prenom",rs.getString("PRENOMPAT"));
                        obj.put("naissance",rs.getDate("DATE_NAISSANCEPAT"));
                        obj.put("profession",rs.getString("PROFESSION"));
                        
                        
                        arr.put(obj);
                        
                        obj = new JSONObject();
                        
                      }
                      out.println(arr);
                
               }
                catch(Exception e)
                {

                }
        
    %>

