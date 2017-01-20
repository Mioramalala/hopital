/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultation;

import connexion.Connect;
import fonction.Liste;
import static java.lang.Double.parseDouble;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author itu
 */
public class InsertConsultation {
    public static void consultation(String refpat,String refdoc,String dates,String temperature,String tensionH,String tensionB,String poids)
    {
        try
        {
             Connection c;
             c = Connect.getCon();
             Liste liste = new Liste();
             PreparedStatement stat1;

             Date dateC = liste.convertDate(dates);
             double temp = parseDouble(temperature);
             double tensH = parseDouble(tensionH);
             double tensB = parseDouble(tensionB);
             double poid = parseDouble(poids);
             String idpat = getIdPat(refpat);
             String iddoc = getIdDoc(refdoc);
             stat1 = c.prepareStatement("insert into patient(idprix,idpat,refpat,iddoc,refdoc,dateConsult,temperature,tensionh,tensionb,poids) values(1,'"+idpat+"','"+refpat+"','"+iddoc+"','"+refdoc+"','"+dateC+"','"+temp+"',,'"+tensH+"','"+tensB+"','"+poid+"')");

                                stat1.executeUpdate();
        }
        catch(Exception e)
        {
            out.print(e.getMessage());
        }
    }
    
    public static String getIdPat(String refpat)
    {
        Connection c;
         c = Connect.getCon();
        try
              {
                Statement stm = c.createStatement ();
                ResultSet rs = stm.executeQuery("select * from patient where refpat='"+refpat+"'");
                ResultSetMetaData rsmd = rs.getMetaData();
                //int nbCols = rsmd.getColumnCount();
                 
                while(rs.next())
                {
                    String ref= rs.getString(1);
                    return ref; 
                }}
                catch(Exception e)
                        {
                            out.print(e.getMessage());
                        }
        return "m";
    }
    public static String getIdDoc(String refdoc)
    {
        Connection c;
         c = Connect.getCon();
        try
              {
                Statement stm = c.createStatement ();
                ResultSet rs = stm.executeQuery("select * from docteur where refdoc='"+refdoc+"'");
                ResultSetMetaData rsmd = rs.getMetaData();
                //int nbCols = rsmd.getColumnCount();
                 
                while(rs.next())
                {
                    String ref= rs.getString(1);
                    return ref; 
                }}
                catch(Exception e)
                        {
                            out.print(e.getMessage());
                        }
        return "m";
    }
}
