/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonction;

import connexion.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import static oracle.net.aso.C04.c;

/**
 *
 * @author itu
 */
public class Modifier {
    static Connection conn;
    static PreparedStatement stat;
    static Statement stm;
    static ResultSet rs;
    static PreparedStatement stat1;
    static Statement stm1;
    static ResultSet rs1;
    public void modifie(String nom,String prenom,String iddoc,String contact)
    {
        
        int id=Integer.parseInt(iddoc);
         conn = Connect.getCon();
        try
        {
            
                stm = conn.createStatement ();
                rs = stm.executeQuery("select * from docteur where iddoc="+id);
               
                while(rs.next())
                {
                    //System.out.println(rs.getString("NOMDOC"));
                   /*if(nom=="")
                   {
                       nom = rs.getString("NOMDOC");
                   }
                   if(prenom=="")
                   {
                       prenom = rs.getString("PRENOMDOC");
                   }*/
                   
                   System.out.println(prenom);
                   conn = Connect.getCon();
                    stat = conn.prepareStatement("UPDATE docteur SET NOMDOC='"+nom+"', PRENOMDOC='"+prenom+"' WHERE IDDOC="+id);
                    stat.executeUpdate();
                }
        }
        catch(Exception e)
        {
            
        }
        
        
        try
        {
            
                stm1 = conn.createStatement ();
                rs1 = stm1.executeQuery("select * from docteur where iddoc="+id);
               
                while(rs1.next())
                {
                    //System.out.println(rs.getString("NOMDOC"));
                   if(contact=="")
                   {
                       contact = rs.getString("CONTACT");
                   }
                   
                   //System.out.println(prenom);
                   conn = Connect.getCon();
                    stat1 = conn.prepareStatement("UPDATE contact SET CONTACT='"+contact+"' WHERE IDDOC="+id);
                    stat1.executeUpdate();
                }
        }
        catch(Exception e)
        {
            
        }
    }
}
