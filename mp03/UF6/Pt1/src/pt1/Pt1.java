/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mirokshi
 */
public class Pt1 {
    
       static Connection connection = null;
       static Statement stmt = null;
   static  ResultSet rs = null;
   static String query;
   

      public void connectDatabase() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/mp03?allowMultiQueries=true";
	String user = "debian-sys-maint";
        String password = "VhwKTX3PssrBuWGp";
        
        try {
            
            // Database connect
            // Conectamos con la base de datos
            connection = DriverManager.getConnection(url, user, password);
            boolean valid = connection.isValid(50000);
            
            System.out.println(valid ? "Connection OK" : "Connection FAIL");
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
        }
    
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
