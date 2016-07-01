package Modelo;

import java.util.ArrayList;
import java.util.Random;

public class Batalla {
    private ArrayList<Jugador> jugadores= new ArrayList();
    private ArrayList<Jugador> turnoJugadores= new ArrayList();
    private ArrayList<JefeDeTerreno> jefes = new ArrayList();
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
    public void setBatalla(ArrayList<String> jugadores){
        if(jugadores.size() == 2){
            PuzzleDeDados puzzle1 = new PuzzleDeDados();
            Jugador Jugador1 = new Jugador(jugadores.get(0),new JefeDeTerreno(100, 0, "J",jugadores.get(0)),puzzle1);
            Jugador Jugador2 = new Jugador(jugadores.get(1),new JefeDeTerreno(100, 0, "J",jugadores.get(1)),puzzle1);
            this.jefes.add(Jugador1.getJefe());
            this.jefes.add(Jugador2.getJefe());
            this.jugadores.add(Jugador1);
            this.jugadores.add(Jugador2);
        }
        else if (jugadores.size() == 3){
            PuzzleDeDados puzzle1 = new PuzzleDeDados();
            Jugador Jugador1 = new Jugador(jugadores.get(0),new JefeDeTerreno(100, 0, "J",jugadores.get(0)),puzzle1);
            Jugador Jugador2 = new Jugador(jugadores.get(1),new JefeDeTerreno(100, 0, "J",jugadores.get(1)),puzzle1);
            Jugador Jugador3 = new Jugador(jugadores.get(2),new JefeDeTerreno(100, 0, "J",jugadores.get(2)),puzzle1);
            this.jefes.add(Jugador1.getJefe());
            this.jefes.add(Jugador2.getJefe());
            this.jefes.add(Jugador3.getJefe());
            this.jugadores.add(Jugador1);
            this.jugadores.add(Jugador2);
            this.jugadores.add(Jugador3);
        }
        else if (jugadores.size() == 4){
            PuzzleDeDados puzzle1 = new PuzzleDeDados();
            Jugador Jugador1 = new Jugador(jugadores.get(0),new JefeDeTerreno(100, 0, "J",jugadores.get(0)),puzzle1);
            Jugador Jugador2 = new Jugador(jugadores.get(1),new JefeDeTerreno(100, 0, "J",jugadores.get(1)),puzzle1);
            Jugador Jugador3 = new Jugador(jugadores.get(2),new JefeDeTerreno(100, 0, "J",jugadores.get(2)),puzzle1);
            Jugador Jugador4 = new Jugador(jugadores.get(3),new JefeDeTerreno(100, 0, "J",jugadores.get(3)),puzzle1);
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
  /*  public void setJefesDeTerreno(ArrayList<JefeDeTerreno> jefes, Casilla[][] board){
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
    }*/
    public ArrayList<Dado> generarDados(PuzzleDeDados puzzle, int cantidadDados){
        ArrayList<Dado> dados = new ArrayList();
        Random r = new Random();
        if(cantidadDados==1){
            dados.add(puzzle.getDados().get(r.nextInt(14)));
        }
        else if (cantidadDados==2){
            dados.add(puzzle.getDados().get(r.nextInt(14)));
            dados.add(puzzle.getDados().get(r.nextInt(14)));
        }
        else if(cantidadDados==3){
            dados.add(puzzle.getDados().get(r.nextInt(14)));
            dados.add(puzzle.getDados().get(r.nextInt(14)));
            dados.add(puzzle.getDados().get(r.nextInt(14)));
        }
        else if(cantidadDados==4){
            dados.add(puzzle.getDados().get(r.nextInt(14)));
            dados.add(puzzle.getDados().get(r.nextInt(14)));
            dados.add(puzzle.getDados().get(r.nextInt(14)));
            dados.add(puzzle.getDados().get(r.nextInt(14)));
        }
        return dados;
    }
}
