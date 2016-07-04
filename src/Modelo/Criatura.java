package Modelo;

public class Criatura {
    
    private final String NOMBRE;
    private  String DUEÑO;
    //private final int ID;
    private final int HPTOTAL;
    private int HPActual;
    private final int ATK;
    private final int DEF;
    private final int LVL;
    
    public Criatura(String NOMBRE, String DUEÑO/*, int ID*/, int HPTOTAL, int ATK, int DEF, int LVL){
        
        this.NOMBRE = NOMBRE;
        this.DUEÑO = DUEÑO;
        //this.ID = ID;
        this.HPTOTAL = HPTOTAL;
        HPActual = HPTOTAL;
        this.ATK = ATK;
        this.DEF = DEF;
        this.LVL = LVL;
    
    }
    
    public String getNombre(){
        return this.NOMBRE;
    }
    public String getDueño(){
        return this.DUEÑO;
    }
    /*public int getId(){
        return this.ID;
    }*/
    public int getHPTotal(){
        return this.HPTOTAL;
    }
    public int getHPActual(){
        return this.HPActual;
    }
    public int getAtk(){
        return this.ATK;
    }
    public int getDef(){
        return this.DEF;
    }
    public int getLvl(){
        return this.LVL;
    }
    public int recibirDaño(int daño){
        if(daño<HPActual){
            if(daño>DEF){
                HPActual -= daño;
                System.out.println("Recibe "+Integer.toString(daño)+"de daño");
            }
        }
        else{
            HPActual = 0;
        }
        return HPActual;
    }
    public void setDueño(String dueño){
        this.DUEÑO=dueño;
    }
}
