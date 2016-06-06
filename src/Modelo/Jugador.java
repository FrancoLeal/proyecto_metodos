package Modelo;

public class Jugador {
    private final String nombre;
    private final PuzzleDeDados puzzle;
    private final int turno;
    public Jugador(String nombre, PuzzleDeDados puzzle, int turno){
        this.nombre = nombre;
        this.puzzle = puzzle;
        this.turno = turno;
    }
    
}
