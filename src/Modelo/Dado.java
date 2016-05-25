/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Random;
import javax.swing.ImageIcon;

public class Dado {
class generarnumeros {
public int resultado;

public int calcularnumero()
{

 Random numero = new Random();  
 // nextint(5) toma valores de 0 a 4, por lo que le sumamos 1 para que el rango sea de 1 a 5
resultado = numero.nextInt(5)+1; 

return resultado;
}

    
}
class ImagenCara {
public ImageIcon cara;
public ImageIcon pngDadoR(float ResultadoDado)
 {
if (ResultadoDado==1)
{   
cara=new ImageIcon("ATAQUE.png");
}
else if (ResultadoDado==2)
{   
cara=new ImageIcon("INVOCAR.png");
}
else if (ResultadoDado==3)
{
cara=new ImageIcon("MOVIMIENTO.png");

}  
else if (ResultadoDado==4)
{

cara=new ImageIcon("TRAMPA.png");
}
else if (ResultadoDado==5)
{
cara=new ImageIcon("MAGIA.png");
}    
return cara;    
 }
 
class imagenes {
    
 public ImageIcon cara;
 public ImageIcon gifDado1(int Dado1)
 {
 cara=new ImageIcon("dados.gif");
 return cara;
}
}
}











}
