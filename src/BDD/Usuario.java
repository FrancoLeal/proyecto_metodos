package BDD;

import java.sql.*;

public class Usuario {
    private String nombre;
    private String password;
    private int jefeTerreno;
    
    public Usuario(String nombre, String password){
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
        final String consulta = "insert into USUARIOS (USUARIO,PASSWORD,FIELD_BOSS) values" + "('" + this.nombre + "','" + this.password + "'," + this.jefeTerreno + ")";
        stmt.executeUpdate(consulta);
    }
    
    public static Usuario obtener(String nombre,String password2) throws SQLException{
        Conexion conexion = new Conexion();
        boolean resultado = conexion.conectar();
        Statement stmt = conexion.crearConsulta();
        final String consulta = "SELECT USUARIO,PASSWORD FROM USUARIOS WHERE USUARIO = '" + nombre +"' AND PASSWORD='" + password2 +"' AND IS_CPU=FALSE";        
        
        ResultSet resultados;
        resultados = stmt.executeQuery(consulta);
        
        
        
        if (resultados.next()==true) {
            String nombre2 = resultados.getString("USUARIO");
            String password = resultados.getString("PASSWORD");
            return new Usuario(nombre2, password);
        }
        else {
            System.out.println("No Existe");
            return null;
        }
    }
}