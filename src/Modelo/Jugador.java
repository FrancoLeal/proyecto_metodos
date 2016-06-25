package Modelo;

public class Jugador {
    private final String nombre;
    //private final PuzzleDeDados puzzle;
    private int invocacion;
    public Jugador(String nombre/*, PuzzleDeDados puzzle*/){
        this.nombre = nombre;
        //this.puzzle = puzzle;
    }
    public void setCantidadInvocacion(int cantidad){
        this.invocacion=this.invocacion+cantidad;
    }
}
