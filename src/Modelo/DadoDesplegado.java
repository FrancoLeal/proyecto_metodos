package Modelo;
//Importacion clases

//Declaracion clase
public class DadoDesplegado {
    private int[][] forma;
    private int i;
    private int j;
    public DadoDesplegado(){
            
    }
    public int[][] getFormaT(){
        this.forma = new int[6][2];
        this.forma[0][0] = i;
        this.forma[0][1] = j;
        this.forma[1][0]=i+1;
        this.forma[1][1]=j;
        this.forma[2][0]=i+2;
        this.forma[2][1]=j;
        this.forma[3][0]=i+1;
        this.forma[3][1]=j+1;
        this.forma[4][0]=i+1;
        this.forma[4][1]=j+2;
        this.forma[5][0]=i+1;
        this.forma[5][1]=j+3;
        return forma;
    }
    
}
