package Modelo;
import java.util.*;

public class PuzzleDeDados {
    private ArrayList<Dado> dados;
    public PuzzleDeDados(){
        this.dados=new ArrayList();
        String[] a = {"MAGIA","ATAQUE","INVOCAR","MOVIMIENTO","MOVIMIENTO","TRAMPA"};
        String[] b = {"MAGIA","ATAQUE","INVOCAR","INVOCAR","MOVIMIENTO","TRAMPA"};
        String[] c = {"MAGIA","ATAQUE","INVOCAR","INVOCAR","MAGIA","TRAMPA"};
        String[] d = {"MAGIA","ATAQUE","INVOCAR","INVOCAR","ATAQUE","TRAMPA"};
        this.dados.add(new Dado(new Criatura("C", null, 100, 10, 10, 0)));
        this.dados.add(new Dado(new Criatura("C", null, 100, 10, 10, 0)));
        this.dados.add(new Dado(new Criatura("C", null, 100, 10, 10, 0)));
        this.dados.add(new Dado(new Criatura("C", null, 100, 10, 10, 0)));
        this.dados.add(new Dado(new Criatura("C", null, 100, 10, 10, 0)));
        this.dados.add(new Dado(new Criatura("C", null, 100, 10, 10, 0)));
        this.dados.add(new Dado(new Criatura("C", null, 100, 10, 10, 0)));
        this.dados.add(new Dado(new Criatura("C", null, 100, 10, 10, 0)));
        this.dados.add(new Dado(new Criatura("C", null, 100, 10, 10, 0)));
        this.dados.add(new Dado(new Criatura("C", null, 100, 10, 10, 0)));
        this.dados.add(new Dado(new Criatura("C", null, 100, 10, 10, 0)));
        this.dados.add(new Dado(new Criatura("C", null, 100, 10, 10, 0)));
        this.dados.add(new Dado(new Criatura("C", null, 100, 10, 10, 0)));
        this.dados.add(new Dado(new Criatura("C", null, 100, 10, 10, 0)));
        this.dados.add(new Dado(new Criatura("C", null, 100, 10, 10, 0)));
        dados.get(0).setCaras(a);
        dados.get(1).setCaras(b);
        dados.get(2).setCaras(c);
        dados.get(3).setCaras(d);
        dados.get(4).setCaras(a);
        dados.get(5).setCaras(b);
        dados.get(6).setCaras(c);
        dados.get(7).setCaras(d);
        dados.get(8).setCaras(a);
        dados.get(9).setCaras(b);
        dados.get(10).setCaras(c);
        dados.get(11).setCaras(d);
        dados.get(12).setCaras(a);
        dados.get(13).setCaras(b);
        dados.get(14).setCaras(c);
    }
    /*public void setDados(Dado dado){
        this.dados.add(dado);
    }*/
    public ArrayList<Dado> getDados(){
        return this.dados;
    }
}
