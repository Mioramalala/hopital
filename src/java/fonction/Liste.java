/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonction;

import connexion.Connect;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author itu
 */
public class Liste {
     static Connection conn;
     
     public static JSONArray listeDoc(String nom,String rech)
    {
        conn = Connect.getCon();
        ResultSet rs;
        //Docteur[] docs;
        String name;
        JSONObject obj = new JSONObject();
        JSONArray arr = new JSONArray();
        try
        {
            Statement stm = conn.createStatement ();
            rs = stm.executeQuery("Select (NOMDOC) From Docteur where "+nom+"='"+rech+"'");

            while(rs.next()) {       
		obj.put("id", rs.getString(1));
                arr.put(1,obj);
                return arr;
            }
            /*while(rs.next())
            {
                name = rs.getString(1);
                return name;
            }*/
        }
        catch(Exception e)
        {

        }
        return arr;
     }
     public String nom(String id)
     {
         Connection c;
         c = Connect.getCon();
        try
              {
                Statement stm = c.createStatement ();
                ResultSet rs = stm.executeQuery("select * from docteur where IDDOC="+id);
                 
                while(rs.next())
                {
                    return rs.getString("NOMDOC");
                }
        }
        catch(Exception e)
        {
            
        }
     return "ml";
    }
     
     public String contact(String id)
     {
        
         Connection c;
         c = Connect.getCon();
        try
              {
                  int idd = parseInt(id);
                Statement stm = c.createStatement ();
                ResultSet rs = stm.executeQuery("select * from contact where IDDOC="+idd);
                 int i = 0;
                while(rs.next())
                { 
                    String cont ;
                    cont=rs.getString("CONTACT");
                    return cont;
                    //System.out.println(cont[0]);
                    
                }
        }
        catch(Exception e)
        {
            
        }
     return "m";
    }
     
     public Date convertDate(String dateString){
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;

            try {

                date = format.parse(dateString);
               
                //String datef = formatter.format(date);

            } catch (Exception e) {
                e.printStackTrace();
            }
             return date;
        }
}