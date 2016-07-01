package Modelo;

public class Casilla {
    private String dueño="";
    private JefeDeTerreno jefeDeTerreno;
    private Criatura criatura;
    public Casilla(){
    }
    public void setDueño(String dueño){
        this.dueño = dueño;
    }
    public String getDueño(){
        return this.dueño;
    }
    public void setJefeDeTerreno(JefeDeTerreno jefe){
        this.jefeDeTerreno=jefe;
    }
    public void setCriatura(Criatura criatura){
        this.criatura=criatura;
    }
    public Criatura getCriatura(){
        return this.criatura;
    }
    public JefeDeTerreno getJefeDeTerreno(){
        return this.jefeDeTerreno;
    }
    public boolean isJefe(){
        if(this.jefeDeTerreno!=null){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isCriatura(){
        if(this.criatura!=null){
            return true;
        }
        else{
            return false;
        }
    }
}
