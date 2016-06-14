/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;
/**
 *
 * @author Cristian Echegoyen H
 */
public class BDD2 {
static final String URL_BDD = "jdbc:derby://localhost:1527/BDD;user=Grupo1;password=juegos";


 public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   //If boton ingresar o registrarse :
   try{
      
      Class.forName("com.mysql.jdbc.Driver");

      
      System.out.println("Conectando a BDD");
      conn = DriverManager.getConnection(URL_BDD);
      System.out.println("Conectado a BDD");
      
     
      System.out.println("POBLANDO BDD");
      stmt = conn.createStatement();
      
  }catch(SQLException se){
   
      se.printStackTrace();
   }catch(Exception e){
     
      e.printStackTrace();
   }finally{
      
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
 
}
  
   
   
}
