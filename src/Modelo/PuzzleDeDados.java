package Modelo;
import java.util.*;

public class PuzzleDeDados {
    private ArrayList<Dado> dados;
    private int ID_PUZLE;
    public PuzzleDeDados(int ID_PUZLE){
        this.dados=new ArrayList();
        this.ID_PUZLE=ID_PUZLE;
    }
    public ArrayList<Dado> getDados(){
        return this.dados;
    }
    public void setDados(ArrayList<Dado> dados){
        this.dados=dados;
    }
    public int getID(){
        return this.ID_PUZLE;
    }
}
