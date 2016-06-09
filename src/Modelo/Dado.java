package Modelo;

import java.util.Random;
import javax.swing.ImageIcon;
//Declaraacion clase
public class Dado {
    //Atributos
    ImageIcon[] caras;
    //Constructor
    public Dado(ImageIcon cara0 , ImageIcon cara1, ImageIcon cara2, ImageIcon cara3, ImageIcon cara4, ImageIcon cara5){
        ImageIcon[] cara= new ImageIcon[6];
        cara[0]=cara0;
        cara[1]=cara1;
        cara[2]=cara2;
        cara[3]=cara3;
        cara[4]=cara4;
        cara[5]=cara5;
        this.caras=cara;
        
    }
    //Métodos
    public ImageIcon resultado(){
        Random rGenerador = new Random();
        return caras[rGenerador.nextInt(6)];
    }
}