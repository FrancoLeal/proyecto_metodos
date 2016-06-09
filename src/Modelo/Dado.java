package Modelo;

import java.util.Random;



public class Dado {
public int resultadoDado;

public int calcularNumero()
{

 Random rGenerador = new Random();  
 
resultadoDado = rGenerador.nextInt(5)+1; 

return resultadoDado;
}
}