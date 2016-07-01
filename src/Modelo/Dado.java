package Modelo;

import java.util.Random;
import javax.swing.ImageIcon;
import java.awt.Color;
import Controlador.ControladorBatalla;
//Declaraacion clase
public class Dado {
    //Atributos
    private int i;
    private int j;
    public static int[][] FORMA1 = {{0,0},{0,1},{0,2},{1,1},{2,1},{3,1}};
    public static int[][] FORMA2 = {{0,0},{0,1},{1,1},{2,1},{3,1},{3,2}};
    private String [] caras;
    private Criatura criatura;
    //Constructor
    public Dado(Criatura criatura){
        String[] a ={"MAGIA","ATAQUE","INVOCAR","MOVIMIENTO","MOVIMIENTO","TRAMPA"};       
        this.caras = a;
        this.criatura=criatura;
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
    public Criatura getCriatura(){
        return this.criatura;
    }
}
