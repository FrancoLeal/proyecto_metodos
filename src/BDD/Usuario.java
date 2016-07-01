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
        save();
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
        final String consulta = "insert into JUGADOR (NOMBRE_JUGADOR,CONTRASENIA_JUGADOR) values" + "('" + this.nombre + "','" + this.password + ")";
        stmt.executeUpdate(consulta);
    }
    
    public static Usuario obtener(String nombre,String password2) throws SQLException{
        Conexion conexion = new Conexion();
        boolean resultado = conexion.conectar();
        Statement stmt = conexion.crearConsulta();
        final String consulta = "SELECT NOMBRE_JUGADOR,CONTRASENIA_JUGADOR FROM JUGADOR WHERE NOMBRE_JUGADOR = '" + nombre +"' AND CONTRASENIA_JUGADOR='" + password2 +"";        
        
        ResultSet resultados;
        resultados = stmt.executeQuery(consulta);
        
        
        
        if (resultados.next()==true) {
            String nombre2 = resultados.getString("NOMBRE_JUGADOR");
            String password = resultados.getString("CONTRASENIA_JUGADOR");
            return new Usuario(nombre2, password);
        }
        else {
            System.out.println("No Existe");
            return null;
        }
        
    }
}