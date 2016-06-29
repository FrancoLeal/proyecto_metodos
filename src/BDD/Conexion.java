/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;



import java.sql.*;


public class Conexion {
    private static final String SERVIDOR = "localhost";
    private static final String PUERTO = "1527";
    private static final String NOMBRE_BD = "BDD";
    private static final String USUARIO = "Grupo1";
    private static final String PASSWORD = "juegos";
    public static final String URL_CONEXION = "jdbc:derby://" + SERVIDOR + ":"+ PUERTO +"/"+ NOMBRE_BD +";user="+ USUARIO +";password=" + PASSWORD;
    
    private Connection conexion = null;
    
    public boolean conectar() throws SQLException
    {
        this.conexion = DriverManager.getConnection(URL_CONEXION);
        if(this.conexion != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void desconectar() throws SQLException
    {
        if(this.conexion != null)
        {
            this.conexion.close();
        }
    }
    
    public Statement crearConsulta() throws SQLException
    {
        if(this.conexion != null)
        {
            return this.conexion.createStatement();
        }
        else
        {
            return null;
        }
    }
}


   
