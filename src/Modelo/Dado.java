package Modelo;

import java.util.ArrayList;
import java.util.Random;
//Declaraacion clase
public class Dado {
    //Atributos

    public static final int[][] FORMA1 = {{0,0},{0,1},{0,2},{1,1},{2,1},{3,1}};
    public static final int[][] FORMA2 = {{0,0},{0,1},{1,1},{2,1},{3,1},{3,2}};
    private ArrayList<String> caras;
    private String ID_DADO;
    private String ID_CRIATURA;
    private Criatura criatura;
    //Constructor
    public Dado(String ID_DADO){
        this.ID_DADO=ID_DADO;
    }
    public Dado(String cara1, String cara2, String cara3, String cara4, String cara5, String cara6, String ID_CRIATURA){
        caras.add(cara1);
        caras.add(cara2);
        caras.add(cara3);
        caras.add(cara4);
        caras.add(cara5);
        caras.add(cara6);
        this.ID_CRIATURA=ID_CRIATURA;
    }
    //Métodos
    public String resultado(){
        Random rGenerador = new Random();
        return caras.get(rGenerador.nextInt(6));
    }
    public int[][] getForma1(){
        return this.FORMA1;
    }
    public int[][] getForma2(){
        return this.FORMA2;
    }
    public String getID(){
        return this.ID_DADO;
    }
    public void setCriatura(Criatura criatura){
        this.criatura=criatura;
    }
    public Criatura getCriatura(){
        return this.criatura;
    }
    public ArrayList<String> getCaras(){
        return this.caras;
    }
    public void setCaras(ArrayList<String> caras){
        this.caras=caras;
    }
    public int getIDInt(){
        return Integer.parseInt(this.ID_DADO);
    }
}
