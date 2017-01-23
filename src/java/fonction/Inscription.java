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
import java.sql.Statement;
import pers.Utilisateur;

/**
 *
 * @author itu
 */
public class Inscription {
    static Connection conn;
     static Statement stm1;
     static PreparedStatement stat;
    static PreparedStatement stat1;
    public static boolean verifieMail(String email)
    {
        int indice=0;
        int indice1=0;
            for(int j = 0;j<email.length();j++)
            {
                if(email.charAt(j)=='@')
                {
                    indice++;
                }
                if(email.charAt(j)=='@')
                {
                    indice1++;
                }
            }
        return indice==1 && indice1==1;
    }
    
    public static boolean verifieMdp(String mdp)
    {
        String majuscule ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chiffre = "0123456789";
        String carctereSpecial = "#'(-_@]=*,?;.:/!";
        boolean estMajuscule = false;
        for(int i = 0;i<majuscule.length();i++)
        {
            for(int j = 0;j<mdp.length();j++)
            {
                if(mdp.charAt(j)==majuscule.charAt(i))
                {
                    estMajuscule = true;
                    break;
                }
            }
        }
        boolean estchiffre = false;
        for(int i = 0;i<chiffre.length();i++)
        {
            for(int j = 0;j<mdp.length();j++)
            {
                if(mdp.charAt(j)==chiffre.charAt(i))
                {
                    estchiffre = true;
                    break;
                }
            }
        }
        boolean estCaractere = false;
        for(int i = 0;i<carctereSpecial.length();i++)
        {
            for(int j = 0;j<mdp.length();j++)
            {
                if(mdp.charAt(j)==carctereSpecial.charAt(i))
                {
                    estCaractere = true;
                    break;
                }
            }
        }
        return estMajuscule && estchiffre && estCaractere;
    }
    public void insertUtilisateur(Utilisateur u)
    {
        conn = Connect.getCon();
        if(u.getNOMUTILISATEUR()!="" && u.getPRENOMUTILISATEUR()!="" && u.getEMAILUTILISATEUR()!="" && u.getMDPUTILISATEUR()!="")
        {
            try
            {
               conn = Connect.getCon();
               
                        stat = conn.prepareStatement("insert into utilisateur(nomutilisateur,prenomutilisateur,emailutilisateur,mdputilisateur) values(?,?,?,?)");
                        //System.out.println("insert into docteur(idspe,nomdoc,prenomdoc,date_naissancedoc,refdoc) values("+idspe+",?,?,'1980-01-12',"+ref+")");
                        stat.setString(1,u.getNOMUTILISATEUR());
                        stat.setString(2,u.getPRENOMUTILISATEUR());
                        stat.setString(3,u.getEMAILUTILISATEUR());
                        stat.setString(4,u.getMDPUTILISATEUR());
                        stat.executeUpdate();
                        //return ref;
                   conn.close();
                   

           }
           catch(Exception ex)
           {
               System.out.println(ex);
               //return ("1"+ex.getMessage());
           }
        }
    }
    public static void main(String[] args)
    {
        System.out.println(verifieMail("@vf@,.1G"));
    }
}
