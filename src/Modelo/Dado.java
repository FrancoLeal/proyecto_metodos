package Modelo;

import java.util.Random;
import javax.swing.ImageIcon;
import java.awt.Color;
import Controlador.ControladorBatalla;
//Declaraacion clase
public class Dado {
    //Atributos
    public int i;
    public int j;
    public int[][] forma1 = {{0,0},{0,1},{0,2},{1,1},{1,2},{1,3}};
    public int[][] forma2 = {{0,0},{0,1},{0,2},{1,1},{1,2},{1,3}};
    String [] caras;
    //Constructor
    public Dado(){
        String[] a ={"MAGIA","ATAQUE","INVOCAR","MOVIMIENTO","MOVIMIENTO","TRAMPA"};       
        this.caras = a;
    }
    //Métodos
    public String resultado(){
        Random rGenerador = new Random();
        return caras[rGenerador.nextInt(6)];
    }
    public int[][] getForma1(){
        return this.forma1;
    }
    
}
