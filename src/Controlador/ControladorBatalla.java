package Controlador;
//Importacion de clases
import Modelo.Batalla;
import Modelo.Dado;
import Modelo.Tablero;
import Vista.VistaBatalla;
import Vista.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
//Definicion clase
public class ControladorBatalla implements ActionListener {
    //Definicion atributos
    private VistaBatalla vb;
    private Batalla b;
    private ControladorVistaPrincipal cvp;
    private Tablero tablero;
    private ArrayList<ArrayList<JButton>> terreno;
    //Definicion constructor
    public ControladorBatalla(ControladorVistaPrincipal cvp){
        this.cvp = cvp;
        this.vb = new VistaBatalla();
        this.b = new Batalla();
        vb.setVisible(true);
        vb.agregarListener(this);
        vb.setLocationRelativeTo(null);
        this.terreno = vb.getTerreno();
    }
    private int i=0;
    private int j=0;
    public void actionPerformed(ActionEvent e){
        if(vb.getButtonAtras()==e.getSource()){
            vb.dispose();
            cvp.setVista(true);
        }
        else if(vb.getButtonLanzar()==e.getSource()){
            
        }
        /*else{
            System.out.println(e.getSource());
            for (int i = 0 ; i<15 ; i++){
                for (int j = 0 ; j<15 ; j++){
                    if(e.getSource()==terreno<i><j>){
                    
                }
                }
            }
        }*/
    }
}
