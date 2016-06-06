package Controlador;
//Importacion de clases
import Modelo.Batalla;
import Modelo.Dado;
import Modelo.Tablero;
import Vista.VistaBatalla;
import Vista.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//Definicion clase
public class ControladorBatalla implements ActionListener {
    //Definicion atributos
    private VistaBatalla vb;
    private Batalla b;
    private ControladorVistaPrincipal cvp;
    private Tablero tablero;
    private JButton[][] boton;
    //Definicion constructor
    public ControladorBatalla(ControladorVistaPrincipal cvp){
        this.cvp = cvp;
        this.vb = new VistaBatalla();
        this.b = new Batalla();
        vb.setVisible(true);
        JPanel t = vb.getTablero();
        vb.setTablero(this.tablero = new Tablero(t));
        vb.agregarListener(this);
        vb.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent e){
        if(vb.getButtonAtras()==e.getSource()){
            vb.dispose();
            cvp.setVista(true);
        }
        else if(vb.getButtonLanzar()==e.getSource()){
            
        }
        else if(boton[1][2]==e.getSource()){
            System.out.println("Wena, boton 1,2");
        }
    }
}
