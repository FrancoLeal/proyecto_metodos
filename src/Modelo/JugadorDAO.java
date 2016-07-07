package Modelo;

import java.sql.*;
import java.util.ArrayList;

public class JugadorDAO {
    public Jugador obtenerIDJugador(String nombreJugador) throws SQLException{
        Jugador jugador = null;
        Conexion conexion = new Conexion();
        boolean resultado = conexion.conectar();
        if(resultado == true){
            Statement stmt = conexion.crearConsulta();
            final String consulta = "SELECT ID_USUARIO FROM USUARIO WHERE NOMBRE_USUARIO = '" + nombreJugador +"'"; 
            ResultSet resultados = null;
            if(stmt!=null){
                resultados=stmt.executeQuery(consulta);
                while(resultados.next()){
                    jugador = new Jugador(resultados.getInt(1));
                }
            }
            resultados.close();
            stmt.close();
            conexion.desconectar();
            return jugador;
        }
        else{
            conexion.desconectar();
            return null;
        }
    }
    public PuzzleDeDados obtenerPuzzleJugador(int ID_USUARIO) throws SQLException{
        PuzzleDeDados puzzle = null;
        Conexion conexion = new Conexion();
        boolean resultado = conexion.conectar();
        if(resultado == true){
            Statement stmt = conexion.crearConsulta();
            final String consulta = "SELECT ID_PUZLE FROM USUARIO WHERE ID_USUARIO = " + ID_USUARIO +""; 
            ResultSet resultados = null;
            if(stmt!=null){
                resultados=stmt.executeQuery(consulta);
                while (resultados.next()){
                    puzzle = new PuzzleDeDados(resultados.getInt("ID_PUZLE"));
                }
            }
            resultados.close();
            stmt.close();
            conexion.desconectar();
            return puzzle;
        }
        else{
            conexion.desconectar();
            return null;
        }
    }
    public ArrayList<Dado> obtenerDados(int ID_PUZLE) throws SQLException{
        ArrayList<Dado> dados = new ArrayList();
        Conexion conexion = new Conexion();
        boolean resultado = conexion.conectar();
        if(resultado == true){
            Statement stmt = conexion.crearConsulta();
            final String consulta = "SELECT ID_DADO1, ID_DADO2, ID_DADO3, ID_DADO4, ID_DADO5, ID_DADO6, ID_DADO7, ID_DADO8, ID_DADO9, ID_DADO10, ID_DADO11, ID_DADO12, ID_DADO13, ID_DADO14, ID_DADO15 FROM PUZLE WHERE ID_PUZLE = " + ID_PUZLE +""; 
            ResultSet resultados = null;
            if(stmt!=null){
                resultados=stmt.executeQuery(consulta);
                while (resultados.next()){
                    dados.add(new Dado(resultados.getString("ID_DADO1")));
                    dados.add(new Dado(resultados.getString("ID_DADO2")));
                    dados.add(new Dado(resultados.getString("ID_DADO3")));
                    dados.add(new Dado(resultados.getString("ID_DADO4")));
                    dados.add(new Dado(resultados.getString("ID_DADO5")));
                    dados.add(new Dado(resultados.getString("ID_DADO6")));
                    dados.add(new Dado(resultados.getString("ID_DADO7")));
                    dados.add(new Dado(resultados.getString("ID_DADO8")));
                    dados.add(new Dado(resultados.getString("ID_DADO9")));
                    dados.add(new Dado(resultados.getString("ID_DADO10")));
                    dados.add(new Dado(resultados.getString("ID_DADO11")));
                    dados.add(new Dado(resultados.getString("ID_DADO12")));
                    dados.add(new Dado(resultados.getString("ID_DADO13")));
                    dados.add(new Dado(resultados.getString("ID_DADO14")));
                    dados.add(new Dado(resultados.getString("ID_DADO15")));
                }
                resultados.close();
                stmt.close();
                conexion.desconectar();
                return dados;
            }
        }
        conexion.desconectar();
        return null;
    }
    public ArrayList<String> obtenerCaras(int ID_DADO) throws SQLException{
        ArrayList<String> caras = null;
        Conexion conexion = new Conexion();
        boolean resultado = conexion.conectar();
        if(resultado){
            Statement stmt = conexion.crearConsulta();
            final String consulta = "SELECT CARA_1, CARA_2, CARA_3, CARA_4, CARA_5, CARA_6 FROM DADO WHERE ID_DADO = " + ID_DADO +""; 
            ResultSet resultados = null;
            if(stmt!=null){
                resultados=stmt.executeQuery(consulta);
                caras = new ArrayList();
                while (resultados.next()){
                    caras.add(resultados.getString("CARA_1"));
                    caras.add(resultados.getString("CARA_2"));
                    caras.add(resultados.getString("CARA_3"));
                    caras.add(resultados.getString("CARA_4"));
                    caras.add(resultados.getString("CARA_5"));
                    caras.add(resultados.getString("CARA_6"));
                }
            }
            resultados.close();
            stmt.close();
            conexion.desconectar();
            return caras;
        }
        else{
            conexion.desconectar();
            return null;
        }
    }
    public Criatura obtenerCriatura(String ID_DADO, String dueño) throws SQLException{
        Criatura criatura = null;
        Conexion conexion = new Conexion();
        boolean resultado = conexion.conectar();
        if(resultado == true){
            Statement stmt = conexion.crearConsulta();
            final String consulta = "SELECT NOMBRE_CRIATURA, ATK_CRIATURA, DEF_CRIATURA, HP_CRIATURA, NIVEL_CRIATURA FROM CRIATURA WHERE ID_DADO = " + ID_DADO +""; 
            ResultSet resultados = null;
            if(stmt!=null){
                resultados=stmt.executeQuery(consulta);
                while (resultados.next()){
                    criatura = new Criatura(resultados.getString("NOMBRE_CRIATURA"),resultados.getInt("HP_CRIATURA"),resultados.getInt("ATK_CRIATURA"),resultados.getInt("DEF_CRIATURA"),resultados.getInt("NIVEL_CRIATURA"));
                    criatura.setDueño(dueño);
                }
            }
            resultados.close();
            stmt.close();
            conexion.desconectar();
            return criatura;
        }
        else{
            conexion.desconectar();
            return null;
        }
    }
    public Jugador obtenerIDJefe(int ID_USUARIO) throws SQLException{
        Jugador jugador=null;
        Conexion conexion = new Conexion();
        boolean resultado = conexion.conectar();
        if(resultado == true){
            Statement stmt = conexion.crearConsulta();
            final String consulta = "SELECT JEFE_DE_TERRENO FROM USUARIO WHERE ID_USUARIO = " + ID_USUARIO +""; 
            ResultSet resultados = null;
            if(stmt!=null){
                resultados=stmt.executeQuery(consulta);
                while (resultados.next()){
                    jugador=new Jugador();
                    jugador.setIDJefe(resultados.getInt("JEFE_DE_TERRENO"));
                }
            }
            resultados.close();
            stmt.close();
            conexion.desconectar();
            return jugador;
        }
        else{
            conexion.desconectar();
            return null;
        }
    }
    public JefeDeTerreno obtenerJefe(int ID_JEFE) throws SQLException{
        JefeDeTerreno jefe=null;
        Conexion conexion = new Conexion();
        boolean resultado = conexion.conectar();
        if(resultado){
            Statement stmt = conexion.crearConsulta();
            final String consulta = "SELECT NOMBRE_JEFE_TERRENO, HP_JEFE_TERRENO FROM JEFE_TERRENO WHERE ID_JEFE_TERRENO = " + ID_JEFE +""; 
            ResultSet resultados = null;
            if(stmt!=null){
                resultados=stmt.executeQuery(consulta);
                while (resultados.next()){
                    jefe = new JefeDeTerreno(resultados.getInt("HP_JEFE_TERRENO"),resultados.getString("NOMBRE_JEFE_TERRENO"));
                }
            }
            resultados.close();
            stmt.close();
            conexion.desconectar();
            return jefe;
        }
        else{
            conexion.desconectar();
            return null;
        }
    }
}
