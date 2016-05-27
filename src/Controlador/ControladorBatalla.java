package Controlador;
//Importacion de clases
import Modelo.Batalla;
import Modelo.Dado;
import Vista.VistaBatalla;
import Vista.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Definicion clase
public class ControladorBatalla implements ActionListener {
    //Definicion atributos
    private VistaBatalla vb;
    private Batalla b;
    //Definicion constructor
    public ControladorBatalla(){
        this.vb = new VistaBatalla();
        this.b = new Batalla();
        vb.setVisible(true);
        vb.agregarListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(vb.getButtonAtras()==e.getSource()){
            vb.dispose();
            //cvp.vp.setVisible(true);
        }
        else if(vb.getButtonLanzar()==e.getSource()){
            
        }
    }
}
