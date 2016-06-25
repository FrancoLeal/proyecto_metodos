package Modelo;

import java.util.ArrayList;
import java.util.Random;

public class Batalla {
    private ArrayList<String> jugadores= new ArrayList();
    private ArrayList<String> turnoJugadores= new ArrayList();
    public Batalla(){
        if(jugadores.size() == 2){
            Jugador Jugador1 = new Jugador(jugadores.get(0));
            JefeDeTerreno Jefe1 = new JefeDeTerreno(100, 0, 1);
            Jugador Jugador2 = new Jugador(jugadores.get(1));
            JefeDeTerreno Jefe2 = new JefeDeTerreno(100, 0, 2);
            System.out.println("2");
        }
        else if (jugadores.size() == 3){
            Jugador Jugador1 = new Jugador(jugadores.get(0));
            JefeDeTerreno Jefe1 = new JefeDeTerreno(100, 0, 1);
            Jugador Jugador2 = new Jugador(jugadores.get(1));
            JefeDeTerreno Jefe2 = new JefeDeTerreno(100, 0, 2);
            Jugador Jugador3 = new Jugador(jugadores.get(2));
            JefeDeTerreno Jefe3 = new JefeDeTerreno(100, 0, 3);
        }
        else if (jugadores.size() == 4){
            Jugador Jugador1 = new Jugador(jugadores.get(0));
            JefeDeTerreno Jefe1 = new JefeDeTerreno(100, 0, 1);
            Jugador Jugador2 = new Jugador(jugadores.get(1));
            JefeDeTerreno Jefe2 = new JefeDeTerreno(100, 0, 2);
            Jugador Jugador3 = new Jugador(jugadores.get(2));
            JefeDeTerreno Jefe3 = new JefeDeTerreno(100, 0, 3);
            Jugador Jugador4 = new Jugador(jugadores.get(3));
            JefeDeTerreno Jefe4 = new JefeDeTerreno(100, 0, 4);
            System.out.println("4");
        }
    }
    public ArrayList<String> getJugadores(){
        return this.jugadores;   
    }
    public ArrayList<String> getOrdenJugadores(){
        return this.turnoJugadores;   
    }
    public void setOrdenJugadores(){
        Random r = new Random();
        ArrayList<String> jugadoresTemporal = (ArrayList<String>)turnoJugadores.clone();
        while (!jugadoresTemporal.isEmpty()){
            int i = r.nextInt(jugadoresTemporal.size());
            this.turnoJugadores.add(jugadoresTemporal.get(i));
            turnoJugadores.remove(i);
        }
    }
}
