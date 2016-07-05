package Modelo;
import java.util.*;

public class PuzzleDeDados {
    private ArrayList<Dado> dados;
    public PuzzleDeDados(){
        this.dados=new ArrayList();
        String[] a = {"MAGIA","ATAQUE","INVOCAR","INVOCAR","MOVIMIENTO","TRAMPA"};
        String[] b = {"MAGIA","ATAQUE","INVOCAR","INVOCAR","MOVIMIENTO","TRAMPA"};
        String[] c = {"MAGIA","ATAQUE","INVOCAR","INVOCAR","MAGIA","TRAMPA"};
        String[] d = {"MAGIA","ATAQUE","INVOCAR","INVOCAR","ATAQUE","TRAMPA"};
        for(int i = 0 ; i<15 ; i++){
            dados.add(new Dado());
            dados.get(i).setCaras(a);
        }
    }
    public ArrayList<Dado> getDados(){
        return this.dados;
    }
}
