package Controlador;
//Importacion de clases
import Modelo.Batalla;
import Modelo.Dado;
//import Modelo.Dado2;
import Modelo.Tablero;
import Vista.VistaBatalla;
import Vista.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.ImageIcon;
//Definicion clase
public class ControladorBatalla implements ActionListener {
    //Definicion atributos
    private VistaBatalla vb;
    private Batalla b;
    private ControladorVistaPrincipal cvp;
    private JButton[][] terreno;
    private ImageIcon iconImage;

    
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
    public void actionPerformed(ActionEvent e){
        if(vb.getButtonAtras()==e.getSource()){
            vb.dispose();
            cvp.setVista(true);
        }
        else if(vb.getButtonLanzar()==e.getSource()){
            Dado objDado = new Dado();
            ImageIcon cara = objDado.resultado();
            
            System.out.println("Ok, funciona");
            //setIcon con la foto de la cara (En el Jpanel Batalla)
            //setText con el nombre de la cara (En el Jpanel Batalla)

    }
  
     
            
   /*else if(vb.getButtonParar()==e.getSource()){
       
      Dado objDado = new Dado();
        Dado2 objImag1=new Dado2();
        int result = objDado.calcularNumero();
        lblMostrarDado.setIcon(objImag1.pngDadoR(result));
        txtResultado.setText(DadoR);
        System.out.println("Wena");
        // Falta que reconozca el textfield y el label de la vistaBatalla
        }*/
        else{
            for (int i = 0 ; i<15 ; i++){
                for (int j = 0 ; j<15 ; j++){
                    if(vb.getBotonTerreno(i,j)==e.getSource()){
                        System.out.println("X="+i+"Y="+j);
                    }
                }
            }
        }
    }
}
