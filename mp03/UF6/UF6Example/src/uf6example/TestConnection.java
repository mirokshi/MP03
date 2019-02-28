
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf6example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mirokshi
 */
public class TestConnection {
    
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
  
  public static void createTable() throws SQLException{
      query = "CREATE TABLE ejemplo("
              + "id INT PRIMARY KEY,"
              + "nombre VARCHAR(30)"
              + ");";
      try {
          stmt = connection.createStatement();
      stmt.executeUpdate(query);
      } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
      }finally{
          if (stmt != null) { 
            stmt.close();
        } 
      }
  }
  
  public static void dropTable() throws SQLException{
      query="DROP TABLE IF EXISTS Socio;";
      
      try {
          stmt = connection.createStatement();
      stmt.executeUpdate(query);
      } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
      }finally{
          if (stmt != null) { 
            stmt.close();
        } 
      }
  }
  
  public static void insert() throws SQLException{
      query="INSERT INTO Socio(Codigo,Nombre,Edad) VALUES"
              + "(1,'Jose',34),"
              + "(2,'Mario',24),"
              + "(3,'Juan',14),"
              + "(4,'Martin',26),"
              + "(5,'Luis',40),"
              + "(6,'Eduardo',11),"
              + "(7,'Elizabet',20),"
              + "(8,'Carlos',56),"
              + "(9,'Adolfo',15),"
              + "(10,'Pedro',43);";
      
         try{
              stmt = connection.createStatement();
               stmt.executeUpdate(query);
          }catch(SQLException ex){
              
             System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());  
          }finally{
          if (stmt != null) { 
            stmt.close();
        } 
      }
  }
  
  public static void select() throws SQLException{
      
         query = "SELECT * FROM Socio";
        try {
            //Create Statement
            
            stmt = connection.createStatement();
            rs = stmt.executeQuery(query);
         System.out.println("+----+--------+------+");
         System.out.println("| ID | Nombre | Edad |");
         System.out.println("+----+--------+------+");
         while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("Codigo");
         String nombre = rs.getString("Nombre");
         int edad = rs.getInt("Edad");

         //Display values
         System.out.print("| "+ id +"  |"+" "+ nombre+ "  |"+" "+edad+"  |\n");

         }
        System.out.println("+----+--------+------+");
         
        } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }finally {
        if (stmt != null) { 
            stmt.close();
        } }
       
  }
  
  public static void updateColumn() throws SQLException{
       query="ALTER TABLE Socio ADD ("
              + "Apellido VARCHAR(255),"
              + "Edad INT"
              + ");";
      try{
      stmt = connection.createStatement();
      stmt.executeUpdate(query);
      }catch(SQLException ex) {
          
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            
        }finally {
                
        if (stmt != null) { 
            stmt.close();
        }
      }
      
  }
  
  public static void dropColumn() throws SQLException{
          query="ALTER TABLE Socio DROP Apellido;";
          try{
              stmt = connection.createStatement();
               stmt.executeUpdate(query);
          }catch(SQLException ex){
              
             System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());  
          }finally{
          if (stmt != null) { 
            stmt.close();
        } 
      }
      }
  
  public static void updateRegister(){
      query="UPDATE Socio SET Nombre='Maria Cinta',Edad=33 WHERE Codigo=1;UPDATE Socio SET Nombre='Paco',Edad=22 WHERE Codigo=2;";
              
      try{
              stmt = connection.createStatement();
               stmt.executeUpdate(query);
          }catch(SQLException ex){
              
             System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());  
          }
  }
  
  public static void dropRegister() throws SQLException{
//      query="DELETE FROM Socio WHERE Codigo=10;";
//        query="DELETE FROM Socio WHERE Edad<18;";
        query="DELETE FROM Socio;";
      
         try{
              stmt = connection.createStatement();
               stmt.executeUpdate(query);
          }catch(SQLException ex){
              
             System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());  
          }finally {
        if (stmt != null) { 
            stmt.close();
        } }
  
  }
    /**
     * Testing Java MySQL connection with host and port
     * Probando la conexión en Java a MySQL especificando el host y el puerto.
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        TestConnection javaMySQLBasic = new TestConnection();
        javaMySQLBasic.connectDatabase(); 

//       createTable();
       dropTable();
//         dropRegister();
//       insert();
//        updateRegister();
        select();


        
}       
}
