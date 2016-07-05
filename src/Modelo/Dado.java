package Modelo;

import java.util.Random;
//Declaraacion clase
public class Dado {
    //Atributos

    public static final int[][] FORMA1 = {{0,0},{0,1},{0,2},{1,1},{2,1},{3,1}};
    public static final int[][] FORMA2 = {{0,0},{0,1},{1,1},{2,1},{3,1},{3,2}};
    private String [] caras;
    private Criatura criatura;
    private String dueño;
    //Constructor
    public Dado(String dueño){
        criatura = new Criatura("Criatura",dueño,500,150,100,0);
        this.dueño=dueño;
    }
    //Métodos
    public String resultado(){
        Random rGenerador = new Random();
        return caras[rGenerador.nextInt(6)];
    }
    public int[][] getForma1(){
        return this.FORMA1;
    }
    public int[][] getForma2(){
        return this.FORMA2;
    }
    public void setCriatura(Criatura criatura){
        this.criatura=criatura;
    }
    public void setCaras(String[] caras){
        this.caras=caras;
    }
    public Criatura getCriatura(){
        return this.criatura;
    }
}
