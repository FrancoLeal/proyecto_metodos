package Modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

public class Batalla {
    private ArrayList<Jugador> jugadores= new ArrayList();
    private ArrayList<Jugador> turnoJugadores= new ArrayList();
    private ArrayList<JefeDeTerreno> jefes = new ArrayList();
    private ArrayList<Dado> dados = new ArrayList();
    private JugadorDAO DAO = new JugadorDAO();
    public Batalla(){
    }
    public ArrayList<Jugador> getJugadores(){
        return this.jugadores;
    }
    public ArrayList<Jugador> getOrdenJugadores(){
        return this.turnoJugadores;   
    }
    public void setOrdenJugadores(){
        Random r = new Random();
        ArrayList<Jugador> jugadoresTemporal = (ArrayList<Jugador>) jugadores.clone();
        while (!jugadoresTemporal.isEmpty()){
            int i = r.nextInt(jugadoresTemporal.size());
            this.turnoJugadores.add(jugadoresTemporal.get(i));
            jugadoresTemporal.remove(i);
        }
    }
    public ArrayList<String> getJefesNombres(){
        ArrayList<String> nombreJefes = new ArrayList();
        for(JefeDeTerreno jefe : this.jefes){
            nombreJefes.add(jefe.getNombre());
        }
        return nombreJefes;
    }
    public ArrayList<JefeDeTerreno> getJefesDeTerreno(){
        return this.jefes;
    }
    public void setBatalla(ArrayList<String> jugadores) throws SQLException{
        if(jugadores.size() == 2){
            Jugador jugador1=DAO.obtenerIDJugador(jugadores.get(0));
            PuzzleDeDados puzzlej1 = DAO.obtenerPuzzleJugador(jugador1.getID());
            ArrayList<Dado> dadosj1 = DAO.obtenerDados(puzzlej1.getID());
            puzzlej1.setDados(dadosj1);
            for(Dado dado : puzzlej1.getDados()){
                dado.setCriatura(DAO.obtenerCriatura(dado.getID()));
            }
            JefeDeTerreno jefe1 = DAO.obtenerJefe(DAO.obtenerIDJefe(jugador1.getID()).getID());
            Jugador jugador2=DAO.obtenerIDJugador(jugadores.get(1));
            PuzzleDeDados puzzlej2 = DAO.obtenerPuzzleJugador(jugador2.getID());
            ArrayList<Dado> dadosj2 = DAO.obtenerDados(puzzlej2.getID());
            puzzlej2.setDados(dadosj2);
            for(Dado dado : puzzlej2.getDados()){
                dado.setCriatura(DAO.obtenerCriatura(dado.getID()));
            }
            JefeDeTerreno jefe2 = DAO.obtenerJefe(DAO.obtenerIDJefe(jugador2.getID()).getID());
            Jugador Jugador1 = new Jugador(jugadores.get(0),jefe1,puzzlej1);
            Jugador Jugador2 = new Jugador(jugadores.get(1),jefe2,puzzlej2);
            this.jefes.add(Jugador1.getJefe());
            this.jefes.add(Jugador2.getJefe());
            this.jugadores.add(Jugador1);
            this.jugadores.add(Jugador2);
        }
        else if (jugadores.size() == 3){
            Jugador jugador1=DAO.obtenerIDJugador(jugadores.get(0));
            PuzzleDeDados puzzlej1 = DAO.obtenerPuzzleJugador(jugador1.getID());
            ArrayList<Dado> dadosj1 = DAO.obtenerDados(puzzlej1.getID());
            puzzlej1.setDados(dadosj1);
            for(Dado dado : puzzlej1.getDados()){
                dado.setCriatura(DAO.obtenerCriatura(dado.getID()));
            }
            JefeDeTerreno jefe1 = DAO.obtenerJefe(DAO.obtenerIDJefe(jugador1.getID()).getID());
            Jugador jugador2=DAO.obtenerIDJugador(jugadores.get(1));
            PuzzleDeDados puzzlej2 = DAO.obtenerPuzzleJugador(jugador2.getID());
            ArrayList<Dado> dadosj2 = DAO.obtenerDados(puzzlej2.getID());
            puzzlej2.setDados(dadosj2);
            for(Dado dado : puzzlej2.getDados()){
                dado.setCriatura(DAO.obtenerCriatura(dado.getID()));
            }
            JefeDeTerreno jefe2 = DAO.obtenerJefe(DAO.obtenerIDJefe(jugador2.getID()).getID());
            Jugador jugador3=DAO.obtenerIDJugador(jugadores.get(2));
            PuzzleDeDados puzzlej3 = DAO.obtenerPuzzleJugador(jugador3.getID());
            ArrayList<Dado> dadosj3 = DAO.obtenerDados(puzzlej3.getID());
            puzzlej3.setDados(dadosj3);
            for(Dado dado : puzzlej3.getDados()){
                dado.setCriatura(DAO.obtenerCriatura(dado.getID()));
            }
            JefeDeTerreno jefe3 = DAO.obtenerJefe(DAO.obtenerIDJefe(jugador3.getID()).getID());
            Jugador Jugador1 = new Jugador(jugadores.get(0),jefe1,puzzlej1);
            Jugador Jugador2 = new Jugador(jugadores.get(1),jefe2,puzzlej2);
            Jugador Jugador3 = new Jugador(jugadores.get(2),jefe3,puzzlej3);
            this.jefes.add(Jugador1.getJefe());
            this.jefes.add(Jugador2.getJefe());
            this.jefes.add(Jugador3.getJefe());
            this.jugadores.add(Jugador1);
            this.jugadores.add(Jugador2);
            this.jugadores.add(Jugador3);
        }
        else if (jugadores.size() == 4){
            Jugador jugador1=DAO.obtenerIDJugador(jugadores.get(0));
            PuzzleDeDados puzzlej1 = DAO.obtenerPuzzleJugador(jugador1.getID());
            ArrayList<Dado> dadosj1 = DAO.obtenerDados(puzzlej1.getID());
            puzzlej1.setDados(dadosj1);
            for(Dado dado : puzzlej1.getDados()){
                dado.setCriatura(DAO.obtenerCriatura(dado.getID()));
            }
            JefeDeTerreno jefe1 = DAO.obtenerJefe(DAO.obtenerIDJefe(jugador1.getID()).getID());
            Jugador jugador2=DAO.obtenerIDJugador(jugadores.get(1));
            PuzzleDeDados puzzlej2 = DAO.obtenerPuzzleJugador(jugador2.getID());
            ArrayList<Dado> dadosj2 = DAO.obtenerDados(puzzlej2.getID());
            puzzlej2.setDados(dadosj2);
            for(Dado dado : puzzlej2.getDados()){
                dado.setCriatura(DAO.obtenerCriatura(dado.getID()));
            }
            JefeDeTerreno jefe2 = DAO.obtenerJefe(DAO.obtenerIDJefe(jugador2.getID()).getID());
            Jugador jugador3=DAO.obtenerIDJugador(jugadores.get(2));
            PuzzleDeDados puzzlej3 = DAO.obtenerPuzzleJugador(jugador3.getID());
            ArrayList<Dado> dadosj3 = DAO.obtenerDados(puzzlej3.getID());
            puzzlej3.setDados(dadosj3);
            for(Dado dado : puzzlej3.getDados()){
                dado.setCriatura(DAO.obtenerCriatura(dado.getID()));
            }
            JefeDeTerreno jefe3 = DAO.obtenerJefe(DAO.obtenerIDJefe(jugador3.getID()).getID());
            Jugador jugador4=DAO.obtenerIDJugador(jugadores.get(3));
            PuzzleDeDados puzzlej4 = DAO.obtenerPuzzleJugador(jugador4.getID());
            ArrayList<Dado> dadosj4 = DAO.obtenerDados(puzzlej4.getID());
            puzzlej4.setDados(dadosj4);
            for(Dado dado : puzzlej4.getDados()){
                dado.setCriatura(DAO.obtenerCriatura(dado.getID()));
            }
            JefeDeTerreno jefe4 = DAO.obtenerJefe(DAO.obtenerIDJefe(jugador4.getID()).getID());
            Jugador Jugador1 = new Jugador(jugadores.get(0),jefe1,puzzlej1);
            Jugador Jugador2 = new Jugador(jugadores.get(1),jefe2,puzzlej2);
            Jugador Jugador3 = new Jugador(jugadores.get(2),jefe3,puzzlej3);
            Jugador Jugador4 = new Jugador(jugadores.get(3),jefe4,puzzlej4);
            this.jefes.add(Jugador1.getJefe());
            this.jefes.add(Jugador2.getJefe());
            this.jefes.add(Jugador3.getJefe());
            this.jefes.add(Jugador3.getJefe());
            this.jugadores.add(Jugador1);
            this.jugadores.add(Jugador2);
            this.jugadores.add(Jugador3);
            this.jugadores.add(Jugador4);
        }
    }
    public void setJefesDeTerreno(ArrayList<JefeDeTerreno> jefes, Casilla[][] board){
        if(jefes.size()==2){
            board[0][7].setJefeDeTerreno(jefes.get(0));
            board[14][7].setJefeDeTerreno(jefes.get(1));
        }
        else if(jefes.size()==3){
            board[0][7].setJefeDeTerreno(jefes.get(0));
            board[14][7].setJefeDeTerreno(jefes.get(1));
            board[7][0].setJefeDeTerreno(jefes.get(2));
        }
        else if(jefes.size()==4){
            board[0][7].setJefeDeTerreno(jefes.get(0));
            board[14][7].setJefeDeTerreno(jefes.get(1));
            board[7][0].setJefeDeTerreno(jefes.get(2));
            board[7][14].setJefeDeTerreno(jefes.get(3));
        }
    }
}