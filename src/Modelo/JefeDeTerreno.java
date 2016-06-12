package Modelo;

public class JefeDeTerreno {
    private int vida;
    private int atributo;
    private int turno;
    public JefeDeTerreno(int vida, int atributo, int turno){
        this.vida=vida;
        this.atributo=atributo;
        this.turno=turno;
    }
    public int getVida(){
        return this.vida;
    }
    public int getAtributo(){
        return this.atributo;
    }
    public int getTurno(){
        return this.turno;
    }
}
