package Modelo;

public class Jugador {
    private final String nombre;
    //private final PuzzleDeDados puzzle;
    private final int turno;
    private int cantidadInvocacion;
    public Jugador(String nombre/*, PuzzleDeDados puzzle*/, int turno){
        this.nombre = nombre;
        //this.puzzle = puzzle;
        this.turno = turno;
    }
    public void setCantidadInvocacion(int cantidad){
        this.cantidadInvocacion=this.cantidadInvocacion+cantidad;
    }
    public int  getTurno(){
        return this.turno;
    }
}
