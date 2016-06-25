package Modelo;

public class Jugador {
    private final String nombre;
    //private final PuzzleDeDados puzzle;
    private int invocacion;
    private int magia;
    private int trampa;
    private int ataque;
    private int mover;
    public Jugador(String nombre/*, PuzzleDeDados puzzle*/){
        this.nombre = nombre;
        //this.puzzle = puzzle;
    }
    public void setInvocacion(int invocacion){
        this.invocacion=this.invocacion+invocacion;
    }
    public void setMagia(int magia) {
        this.magia = magia;
    }

    public void setTrampa(int trampa) {
        this.trampa = this.trampa+trampa;
    }

    public void setAtaque(int ataque) {
        this.ataque = this.ataque+ataque;
    }

    public void setMover(int mover) {
        this.mover = this.mover+mover;
    }

    public String getNombre() {
        return nombre;
    }

    public int getInvocacion() {
        return invocacion;
    }

    public int getMagia() {
        return magia;
    }

    public int getTrampa() {
        return trampa;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getMover() {
        return mover;
    }
}
