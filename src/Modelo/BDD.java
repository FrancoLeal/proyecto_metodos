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
public class BDD {
String str ="jdbc:derby://localhost:1527/BDD;user=Grupo1;password=juegos"  ;

java.sql.Connection conn= DriverManager.getConnection(str);

java.sql.Statement stmt;

    public BDD() throws SQLException {
        this.stmt = conn.createStatement();
    }

}
