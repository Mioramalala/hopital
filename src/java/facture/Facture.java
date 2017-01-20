/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facture;

import connexion.Connect;
import static consultation.InsertConsultation.getIdDoc;
import static consultation.InsertConsultation.getIdPat;
import fonction.Liste;
import static java.lang.Double.parseDouble;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author itu
 */
public class Facture {
    static Connection conn;
    static PreparedStatement stat;
    static PreparedStatement stat1;
     static Statement stm;
     
     public static Date convertDate(String dateString){
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
     
     public static int iddate(Date condition)
     {
         conn = Connect.getCon();
         try
         {
             stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("select * from date where dateedition='"+condition+"'");
             while(rs.next())
             {
                 int ret= rs.getInt(1);
                 return ret;
             }
         }
         catch(Exception e)
         {
             
         }
         return 0;
     }
     
     public static int idpatient(String condition)
     {
         conn = Connect.getCon();
         try
         {
             stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("select * from patient where nompat='"+condition+"'");
             while(rs.next())
             {
                 int ret= rs.getInt(1);
                 return ret;
             }
         }
         catch(Exception e)
         {
             
         }
         return 0;
     }
     
     public static int getMontant(String condition)
     {
         conn = Connect.getCon();
         try
         {
             stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("select * from categorielit where categorielit='"+condition+"'");
             while(rs.next())
             {
                ResultSet rs1 = stm.executeQuery("select * from prix where idcatlit='"+rs.getInt(1)+"'");
                 while(rs1.next())
                 {
                     int ret = rs1.getInt(3);
                     return ret;
                 }
             }
         }
         catch(Exception e)
         {
             
         }
         return 0;
     }
     
     public static int getIdLit(String condition)
     {
         conn = Connect.getCon();
         try
         {
             stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("select * from categorielit where categorielit='"+condition+"'");
             while(rs.next())
             {
                ResultSet rs1 = stm.executeQuery("select * from lit where idcatlit='"+rs.getInt(1)+"'");
                 while(rs1.next())
                 {
                     int ret = rs1.getInt(1);
                     return ret;
                 }
             }
         }
         catch(Exception e)
         {
             
         }
         return 0;
     }
     
     public static Date additionJour(int nombrJour)
  {
	  Calendar cal = Calendar.getInstance();
	  cal.add(Calendar.DATE, +nombrJour);
	  return cal.getTime();
  }
     
     public void insertFactM(String montant)
     {
         try
        {
             Connection c;
             c = Connect.getCon();
             Liste liste = new Liste();
             PreparedStatement stat1;

             Date datesEd = new Date();
             Date dateLi = additionJour(1);
             double mont = parseDouble(montant);
             Statement stm2  = c.createStatement();;
             ResultSet rs = stm2.executeQuery("SELECT nextval('seqfact')");
             rs.next();
             String sequence = rs.getString(1);
             String ref = sequence+"fact";
             stat1 = c.prepareStatement("insert into facturemere(montant,referencefm,dateedition,datelimite) values("+mont+",'"+ref+"','"+datesEd+"','"+dateLi+"')");
             stat1.executeUpdate();
        }
        catch(Exception e)
        {
            out.print(e.getMessage());
        }
     }
     
     public static int insert(String nom,String categorie,String dateEdition,String dateLivraison,String dateLimite)
     {
         int status = 0;
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
                try
            {
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
            }
            catch(Exception e)
            {
                
            }
         }
         return status;
     }
     public static String getrefF()
     {
         try
        {
             Connection c;
             c = Connect.getCon();
             
             PreparedStatement stat1;

             
             Statement stm2  = c.createStatement();;
             ResultSet rs = stm2.executeQuery("SELECT nextval('seqfact')");
             rs.next();
             String sequence = rs.getString(1);
             String ref = sequence+"fact";
             return ref;
             
        }
        catch(Exception e)
        {
            out.print(e.getMessage());
        }
         return "m";
     }
}
