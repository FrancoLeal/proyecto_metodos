package Modelo;

public class JefeDeTerreno {
    private int vida;
    private String nombre;
    private String dueño;
    public JefeDeTerreno(int vida, String nombre){
        this.vida=vida;
        this.nombre=nombre;
    }
    public int getVida(){
        return this.vida;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setVida(int daño){
        this.vida=vida-daño;
        System.out.println("Recibe "+daño+"de daño");
        System.out.println("Vida restante: "+vida);
    }
    public String getDueño(){
        return this.dueño;
    }
}
