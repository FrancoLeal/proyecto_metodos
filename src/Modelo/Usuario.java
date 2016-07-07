package Modelo;

import java.sql.*;

public class Usuario {
    private String nombre;
    private String password;
    private final int PNJ=0;
    private int ID_PUZZLE;
    private int ID_JEFE_TERRENO;
    
    public Usuario(String nombre, String password) throws SQLException{
        this.nombre = nombre;
        this.password = password;
    }
    
    public Usuario(String nombre, String password,int ID_PUZZLE, int ID_JEFE_TERRENO){
        this.nombre = nombre;
        this.password = password;
        this.ID_PUZZLE=ID_PUZZLE;
    }


    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public int getJefeTerreno(){
        return ID_JEFE_TERRENO;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public void setID_PUZZLE(int ID_PUZZLE) {
     
        this.ID_PUZZLE = ID_PUZZLE;
    }

    public void setID_JEFE_TERRENO(int ID_JEFE_TERRENO) {
        this.ID_JEFE_TERRENO = ID_JEFE_TERRENO;
    }
    
    
    
    // Funciones BDD
    
    public void save() throws SQLException{
        Conexion conexion = new Conexion();
        boolean resultado = conexion.conectar();
        Statement stmt = conexion.crearConsulta();
        final String consulta = "INSERT INTO USUARIO (NOMBRE_USUARIO,CONTRASENIA_USUARIO,ID_PUZLE,JEFE_DE_TERRENO) VALUES " + "('" + this.nombre + "','" + this.password + "',"+this.ID_PUZZLE+","+this.ID_JEFE_TERRENO+")";
        stmt.executeUpdate(consulta);
        stmt.close();
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
            resultados.close();
            stmt.close();
            conexion.desconectar();
            return new Usuario(nombre2, password);
        }
        else {
            //System.out.println("No Existe");
            conexion.desconectar();
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
        
        return resultados.next();
        //String nombre2 = resultados.getString("NOMBRE_USUARIO");
        //System.out.println("El usuario "+nombre2+" ya existe.");
        //System.out.println("El usuario "+nombre+" no existe.");
    }
}