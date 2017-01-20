/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonction;

import connexion.Connect;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import pers.Specialisation;

/**
 *
 * @author itu
 */
public class InsertDAO {
    static Connection conn;
    static PreparedStatement stat;
    
    public static void insert(String spe)
    {
        
        try
        {
            conn = Connect.getCon();
            stat = conn.prepareStatement("insert into specialisation(special) values('"+spe+"')");
            //stat.setString(1,i.getSPECIAL());
            //stat.setDate(3, (Date) i.getDATE_NAISSANCEDOC());
            stat.executeUpdate();
            conn.close();
        }
        catch(Exception ex)

        {
            System.out.println(ex);
        }
    }
}
