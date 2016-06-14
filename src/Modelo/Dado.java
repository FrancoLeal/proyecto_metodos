package Modelo;

import java.util.Random;
import javax.swing.ImageIcon;
import java.awt.Color;
import Controlador.ControladorBatalla;
//Declaraacion clase
public class Dado {
    //Atributos
    ImageIcon[] caras;
    public int i;
    public int j;
    public int[][] forma1 = {{0,0},{0,1},{0,2},{1,1},{1,2},{1,3}};
    public int[][] forma2 = {{0,0},{0,1},{0,2},{1,1},{1,2},{1,3}};
    //Constructor
    public Dado(){
    }
    //Métodos
    public ImageIcon resultado(){
        Random rGenerador = new Random();
        return caras[rGenerador.nextInt(6)];
    }
    public int[][] getForma1(){
        return this.forma1;
    }
    
}