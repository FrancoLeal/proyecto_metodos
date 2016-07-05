package Modelo;

import java.util.Random;
import javax.swing.ImageIcon;
import java.awt.Color;
import Controlador.ControladorBatalla;
//Declaraacion clase
public class Dado {
    //Atributos

    public static final int[][] FORMA1 = {{0,0},{0,1},{0,2},{1,1},{2,1},{3,1}};
    public static final int[][] FORMA2 = {{0,0},{0,1},{1,1},{2,1},{3,1},{3,2}};
    private String [] caras;
    private Criatura criatura;
    //Constructor
    public Dado(){
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
}
