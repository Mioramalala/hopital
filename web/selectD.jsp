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
                ResultSet rs = stm.executeQuery("select * from docteur where nomdoc!=''");
                ResultSetMetaData rsmd = rs.getMetaData();
                //int nbCols = rsmd.getColumnCount();
                 
                while(rs.next())
                {
                        obj.put("id", rs.getInt("IDDOC") );
                        obj.put("nom",rs.getString("NOMDOC"));
                        obj.put("prenom",rs.getString("PRENOMDOC"));
                        obj.put("naissance",rs.getDate("DATE_NAISSANCEDOC"));
                        Statement stm1 = c.createStatement ();
                        ResultSet rs1 = stm1.executeQuery("select * from contact where IDDOC="+rs.getInt("IDDOC"));
                        System.out.println("miora");
                            //rsmd = rs.getMetaData();
                            while(rs1.next())
                            {
                                obj.put("contact",rs1.getString("CONTACT"));
                            }
                        Statement stm2 = c.createStatement ();
                        ResultSet rs2 = stm2.executeQuery("select * from Specialisation where IDSPE="+rs.getInt("IDSPE"));
                        System.out.println("miora");
                            //rsmd = rs.getMetaData();
                            while(rs2.next())
                            {
                                obj.put("specialisation",rs2.getString("SPECIAL"));
                            }
                        arr.put(obj);
                        obj = new JSONObject();
                      }
                      out.println(arr);
                
               }
                catch(Exception e)
                {

                }
        
    %>

