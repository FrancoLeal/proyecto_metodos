package Modelo;

import java.util.Random;
import javax.swing.ImageIcon;
//Declaraacion clase
public class Dado {
    //Atributos
    public ImageIcon[] caras;
    //Constructor
    public Dado(){
    }
    //Métodos
    public ImageIcon resultado(){
        Random rGenerador = new Random();
        return caras[rGenerador.nextInt(5)];
    }
    public void setCaras(ImageIcon[] caras){
        this.caras = caras;
    }
}