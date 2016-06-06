package Modelo;

public class JefeDeTerreno {
    private final int vida;
    private final int atributo;
    private final String nombre;
    public JefeDeTerreno(int vida, int atributo, String nombre){
        this.vida=vida;
        this.atributo=atributo;
        this.nombre=nombre;
    }
    public int getVida(){
        return this.vida;
    }
    public int getAtributo(){
        return this.atributo;
    }
    public String getNombre(){
        return this.nombre;
    }
}
