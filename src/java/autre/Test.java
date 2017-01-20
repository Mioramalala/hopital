/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autre;

import fonction.Liste;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author itu
 */
public class Test {
    public static void main(String[] args)throws Exception
    {
        /*JSONObject obj = new JSONObject();
        JSONArray arr = new JSONArray();
            Connection c;
         c = Connect.getCon();
        try
              {
                Statement stm = c.createStatement ();
                ResultSet rs = stm.executeQuery("select * from docteur where nomdoc!=''");
                 
                while(rs.next())
                {
                        obj.put("id", rs.getInt("IDDOC") );
                        obj.put("nom",rs.getString("NOMDOC"));
                        obj.put("prenom",rs.getString("PRENOMDOC"));
                        obj.put("naissance",rs.getDate("DATE_NAISSANCEDOC"));
                        int spe = rs.getInt("IDSPE");
                        try
                        {
                            ResultSet rs1 = stm.executeQuery("select (SPECIAL) from specilisation where IDSPE="+spe);
                                while(rs1.next())
                                {
                                    obj.put("specialisation",rs1.getString("SPECIAL"));
                                    arr.put(obj);
                                    obj = new JSONObject();
                                    out.println(arr);
                                }
                        }
                        catch(Exception e1)
                        {
                            
                        }
                        //arr.put(obj);
                        
                }
                      
                
               }
                catch(Exception e)
                {

                }*/
        Connection conn;
    PreparedStatement stat;
    PreparedStatement stat1;
    Statement stm;
        String nom = "MIORA";
        String categorie = "Simple";
        String dateEdition = "2016-12-05";
        String dateLivraison = "2016-12-06";
        String dateLimite = "2016-12-10";
        /*int status = 0;
         conn = Connect.getCon();
         if(nom!="" && dateEdition!="" && dateLivraison!=null && dateLimite!="")
         {
            Date dE = convertDate(dateEdition);
            Date dLivr = convertDate(dateLivraison);
            Date dLim = convertDate(dateLimite);
            try
            {
                
                stat = conn.prepareStatement("insert into date(dateedition,datelivraison,datelimite) values('"+dE+"','"+dLivr+"','"+dLim+"')");
                status=stat.executeUpdate();
            }
            catch(Exception e)
            {
                
            }
            try
            {
                int iddates = iddate(dE);
                int idpat = idpatient(nom);
                int montant = getMontant(categorie);
                stat = conn.prepareStatement("insert into facturemere(iddate,idpat,montant) values('"+iddates+"','"+idpat+"','"+montant+"')");
                status=stat.executeUpdate();
            }
            catch(Exception e)
            {
                
            }
            try
            {
                int idLit = getIdLit(categorie);
                int idPat = idpatient(nom);
               
                System.out.println(idLit);
             stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("select * from facturemere where idpat='"+idPat+"'");
             while(rs.next())
             {
               stat = conn.prepareStatement("insert into facturefille(idlit,idfactmere) values("+idLit+","+rs.getInt(1)+")");
                status=stat.executeUpdate();
             }
         
            }
            catch(Exception e)
            {
                
            }
         }*/
       
        /*Facture fact = new Facture();
        int ret = fact.getIdLit("Simple");
        System.out.println(ret);*/
        Liste liste = new Liste();
        Date date = new Date();
        System.out.println(additionJour(1));
        
        
    }
     private static Date additionJour(int nombrJour)
  {
	  Calendar cal = Calendar.getInstance();
	  cal.add(Calendar.DATE, +nombrJour);
	  return cal.getTime();
  }
}
