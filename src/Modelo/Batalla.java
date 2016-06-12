package Modelo;
public class Batalla {
    public Batalla(int cantidadDeJugadores){
        if(cantidadDeJugadores == 2){
            Jugador Jugador1 = new Jugador("Jugador 1", 1);
            JefeDeTerreno Jefe1 = new JefeDeTerreno(100, 0, 1);
            Jugador Jugador2 = new Jugador("Jugador 2", 2);
            JefeDeTerreno Jefe2 = new JefeDeTerreno(100, 0, 2);
            System.out.println("2");
        }
        else if (cantidadDeJugadores == 3){
            Jugador Jugador1 = new Jugador("Jugador 1", 1);
            JefeDeTerreno Jefe1 = new JefeDeTerreno(100, 0, 1);
            Jugador Jugador2 = new Jugador("Jugador 2", 2);
            JefeDeTerreno Jefe2 = new JefeDeTerreno(100, 0, 2);
            Jugador Jugador3 = new Jugador("Jugador 3", 3);
            JefeDeTerreno Jefe3 = new JefeDeTerreno(100, 0, 3);
        }
        else if (cantidadDeJugadores == 4){
            Jugador Jugador1 = new Jugador("Jugador 1", 1);
            JefeDeTerreno Jefe1 = new JefeDeTerreno(100, 0, 1);
            Jugador Jugador2 = new Jugador("Jugador 2", 2);
            JefeDeTerreno Jefe2 = new JefeDeTerreno(100, 0, 2);
            Jugador Jugador3 = new Jugador("Jugador 3", 3);
            JefeDeTerreno Jefe3 = new JefeDeTerreno(100, 0, 3);
            Jugador Jugador4 = new Jugador("Jugador 4", 4);
            JefeDeTerreno Jefe4 = new JefeDeTerreno(100, 0, 4);
            System.out.println("4");
        }
    }
}
