package Modelo;

import java.util.Random;
import javax.swing.ImageIcon;
//Declaraacion clase
public class Dado {
    //Atributos
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
}