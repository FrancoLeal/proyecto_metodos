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
    private ControladorVistaPrincipal cvp;
    //Definicion constructor
    public ControladorBatalla(ControladorVistaPrincipal cvp){
        this.cvp = cvp;
        this.vb = new VistaBatalla();
        this.b = new Batalla();
        vb.setVisible(true);
        vb.agregarListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(vb.getButtonAtras()==e.getSource()){
            vb.dispose();
            cvp.setVista(true);
        }
        else if(vb.getButtonLanzar()==e.getSource()){
            
        }
    }
}
