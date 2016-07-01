package Modelo;

public class JefeDeTerreno {
    private int vida;
    private int atributo;
    private String nombre;
    private String dueño;
    public JefeDeTerreno(int vida, int atributo, String nombre, String dueño){
        this.vida=vida;
        this.atributo=atributo;
        this.nombre=nombre;
        this.dueño=dueño;
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
    public void setVida(int daño){
        this.vida=vida-daño;
    }
    public String getDueño(){
        return this.dueño;
    }
}
