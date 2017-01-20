/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonction;

import connexion.Connect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import static oracle.net.aso.C04.c;
import pers.Docteur;

/**
 *
 * @author itu
 */
public class Login {
    public int verifiL(Docteur d)
    {
        Connection c;
         c = Connect.getCon();
         try
         {
            Statement stm = c.createStatement ();
            ResultSet rs = stm.executeQuery("select * from docteur where nomdoc!=''");
         }
         catch(Exception e)
         {
             
         }
        return 0;
    }
}
