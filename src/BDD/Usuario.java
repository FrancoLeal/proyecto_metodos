package BDD;

import java.sql.*;
import Controlador.ControladorRegistro;

public class Usuario {
    private String nombre;
    private String password;
    private int jefeTerreno;
    
    public Usuario(String nombre, String password) throws SQLException{
        this.nombre = nombre;
        this.password = password;
    }
    
    public Usuario(String nombre, String password, int jefeTerreno){
        this.nombre = nombre;
        this.password = password;
        this.jefeTerreno = jefeTerreno;
    }


    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public int getJefeTerreno(){
        return jefeTerreno;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setJefeTerrano(int jefeTerreno) {
        this.jefeTerreno = jefeTerreno;
    }
    
    
    // Funciones BDD
    
    public void save() throws SQLException{
        Conexion conexion = new Conexion();
        boolean resultado = conexion.conectar();
        Statement stmt = conexion.crearConsulta();
        final String consulta = "INSERT INTO USUARIO (NOMBRE_USUARIO,CONTRASENIA_USUARIO,ESPNJ_USUARIO) VALUES " + "('" + this.nombre + "','" + this.password + "',0)";
        stmt.executeUpdate(consulta);
    }
    
    public static Usuario obtener(String nombre,String password2) throws SQLException{
        Conexion conexion = new Conexion();
        boolean resultado = conexion.conectar();
        Statement stmt = conexion.crearConsulta();
        final String consulta = "SELECT NOMBRE_USUARIO,CONTRASENIA_USUARIO FROM USUARIO WHERE NOMBRE_USUARIO = '" + nombre +"'";        
        
        ResultSet resultados;
        resultados = stmt.executeQuery(consulta);
        
        if (resultados.next()==true) {
            String nombre2 = resultados.getString("NOMBRE_USUARIO");
            String password = resultados.getString("CONTRASENIA_USUARIO");
            return new Usuario(nombre2, password);
        }
        else {
            //System.out.println("No Existe");
            return null;
        }
        
    }
    
    public static boolean obtener(String nombre) throws SQLException{
        Conexion conexion = new Conexion();
        boolean resultado = conexion.conectar();
        Statement stmt = conexion.crearConsulta();
        final String consulta = "SELECT NOMBRE_USUARIO FROM USUARIO WHERE NOMBRE_USUARIO = '" + nombre + "'";      
        
        ResultSet resultados;
        resultados = stmt.executeQuery(consulta);
        
        return resultados.next(); //String nombre2 = resultados.getString("NOMBRE_USUARIO");
        //System.out.println("El usuario "+nombre2+" ya existe.");
        //System.out.println("El usuario "+nombre+" no existe.");
    }
}