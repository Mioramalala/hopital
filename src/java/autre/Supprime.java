/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autre;

import connexion.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author itu
 */
public class Supprime {
    static Connection conn;
    static PreparedStatement stat;
    static PreparedStatement stat1;
    static Statement stm;
    static ResultSet rs;
    public void supprContact(String iddoc)
    {
        int id=Integer.parseInt(iddoc);
         conn = Connect.getCon();
       try
        {
                   conn = Connect.getCon();
                   stat = conn.prepareStatement("DELETE FROM contact where iddoc="+id);
                    //stat = conn.prepareStatement("DELETE FROM docteur where iddoc="+id);
                    //System.out.println("malala");
                    stat.executeUpdate();
                    
        }
        catch(Exception e)
        {
            
        }
    }
    
    public void supprDocteur(String iddoc)
    {
        int id=Integer.parseInt(iddoc);
         conn = Connect.getCon();
       try
        {
                   conn = Connect.getCon();
                   stat = conn.prepareStatement("DELETE FROM docteur where iddoc="+id);
                    //stat = conn.prepareStatement("DELETE FROM docteur where iddoc="+id);
                   
                    stat.executeUpdate();
                    
        }
        catch(Exception e)
        {
            
        }
    }
    
    
}
