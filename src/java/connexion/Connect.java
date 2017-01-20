/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author itu
 */
public class Connect {
    static Connection conn;
  public static Connection getCon() {      
    try {
      Class.forName("org.postgresql.Driver");
      System.out.println("Driver O.K.");

      String url = "jdbc:postgresql://localhost:5432/Hopital";
      String user = "postgres";
      String passwd = "itu";

      conn = DriverManager.getConnection(url, user, passwd);
      conn.setAutoCommit(true);
      System.out.println("Connexion effective !");         
         
    } catch (Exception e) {
      e.printStackTrace();
    }   
    return conn;
  }
}

