package Modelo;

import java.util.ArrayList;
import java.util.Random;

public class Batalla {
    private ArrayList<String> jugadores= new ArrayList();
    private ArrayList<String> turnoJugadores= new ArrayList();
    private ArrayList<String> jefes = new ArrayList();
    public Batalla(){
    }
    public ArrayList<String> getJugadores(){
        return this.jugadores;   
    }
    public ArrayList<String> getOrdenJugadores(){
        return this.turnoJugadores;   
    }
    public void setOrdenJugadores(){
        Random r = new Random();
        ArrayList<String> jugadoresTemporal = (ArrayList<String>)jugadores.clone();
        while (!jugadoresTemporal.isEmpty()){
            int i = r.nextInt(jugadoresTemporal.size());
            this.turnoJugadores.add(jugadoresTemporal.get(i));
            jugadoresTemporal.remove(i);
        }
    }
    public ArrayList<String> getJefes(){
        return this.jefes;
    }
    public void setBatalla(){
        if(jugadores.size() == 2){
            Jugador Jugador1 = new Jugador(jugadores.get(0),"J");
            JefeDeTerreno Jefe1 = new JefeDeTerreno(100, 0, 1);
            Jugador Jugador2 = new Jugador(jugadores.get(1),"J");
            JefeDeTerreno Jefe2 = new JefeDeTerreno(100, 0, 2);
            System.out.println("2");
            this.jefes.add(Jugador1.getJefe());
            this.jefes.add(Jugador2.getJefe());
        }
        else if (jugadores.size() == 3){
            Jugador Jugador1 = new Jugador(jugadores.get(0),"J");
            JefeDeTerreno Jefe1 = new JefeDeTerreno(100, 0, 1);
            Jugador Jugador2 = new Jugador(jugadores.get(1),"J");
            JefeDeTerreno Jefe2 = new JefeDeTerreno(100, 0, 2);
            Jugador Jugador3 = new Jugador(jugadores.get(2),"J");
            JefeDeTerreno Jefe3 = new JefeDeTerreno(100, 0, 3);
            this.jefes.add(Jugador1.getJefe());
            this.jefes.add(Jugador2.getJefe());
            this.jefes.add(Jugador3.getJefe());
        }
        else if (jugadores.size() == 4){
            Jugador Jugador1 = new Jugador(jugadores.get(0),"J");
            JefeDeTerreno Jefe1 = new JefeDeTerreno(100, 0, 1);
            Jugador Jugador2 = new Jugador(jugadores.get(1),"J");
            JefeDeTerreno Jefe2 = new JefeDeTerreno(100, 0, 2);
            Jugador Jugador3 = new Jugador(jugadores.get(2),"J");
            JefeDeTerreno Jefe3 = new JefeDeTerreno(100, 0, 3);
            Jugador Jugador4 = new Jugador(jugadores.get(3),"J");
            JefeDeTerreno Jefe4 = new JefeDeTerreno(100, 0, 4);
            System.out.println("4");
            this.jefes.add(Jugador1.getJefe());
            this.jefes.add(Jugador2.getJefe());
            this.jefes.add(Jugador3.getJefe());
            this.jefes.add(Jugador3.getJefe());
        }
    }
}
