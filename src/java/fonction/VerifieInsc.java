/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonction;

import autre.Contact;
import connexion.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import pers.Docteur;


/**
 *
 * @author itu
 */
public class VerifieInsc {
   static Connection conn;
    static PreparedStatement stat;
    static PreparedStatement stat1;
     static Statement stm;
     static Statement stm1;
    
    /*public static java.sql.Date convertDate(String dateString){
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            java.sql.Date sql = null;
            try {

                Date parsed = format.parse(dateString);
                sql = new java.sql.Date(parsed.getTime());
               
                //String datef = formatter.format(date);

            } catch (ParseException e) {
                e.printStackTrace();
            }
             return sql;
        }*/
    
    public static String insert(Docteur i,String cont,String spe)
    {
        int status=0;
        conn = Connect.getCon();
        if(i.getNOMDOC()!="" && i.getPRENOMDOC()!="")
        {
            try
           {
               conn = Connect.getCon();
               stm1 = conn.createStatement();
               Statement stm2 = conn.createStatement();
                   ResultSet res = stm1.executeQuery("select * from Specialisation where special='"+spe+"'");
                   

                   while(res.next())
                   {
                       
                   ResultSet rs = stm2.executeQuery("SELECT nextval('seqdoc')");
                   
                       int idspe = res.getInt(1);
                       rs.next();
                       String sequence = rs.getString(1);
                       String ref = sequence+"doc";
                        stat = conn.prepareStatement("insert into docteur(idspe,nomdoc,prenomdoc,date_naissancedoc,refdoc) values("+idspe+",?,?,'1980-01-12','"+ref+"')");
                        System.out.println("insert into docteur(idspe,nomdoc,prenomdoc,date_naissancedoc,refdoc) values("+idspe+",?,?,'1980-01-12',"+ref+")");
                        stat.setString(1,i.getNOMDOC());
                        stat.setString(2,i.getPRENOMDOC());
                        status=stat.executeUpdate();
                        return ref;
                   
                   }

           }
           catch(Exception ex)
           {
               System.out.println(ex);
               return ("1"+ex.getMessage());
           }
            if(cont!="")
            {
                try
                {

                        stm = conn.createStatement ();
                        ResultSet rs = stm.executeQuery("select * from docteur where nomdoc='"+i.getNOMDOC()+"'");
                        //System.out.println(i.getNOMDOC());
                        ResultSetMetaData rsmd = rs.getMetaData();

                        //int nbCols = rsmd.getColumnCount();

                        while(rs.next())
                        {
                            int iddoc = rs.getInt("IDDOC");
                            stat1 = conn.prepareStatement("insert into contact(iddoc,contact) values("+iddoc+",'"+cont+"')");

                            stat1.executeUpdate();
                            
                        }
                        return "true";
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                    return "é"+e.getMessage();
                }
            }
        }
         return "true";
       
    }
}
