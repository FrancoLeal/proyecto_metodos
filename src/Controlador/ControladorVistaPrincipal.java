package Controlador;
//Importar clases
import Modelo.Principal;
import Vista.VistaPrincipal;
import Vista.VistaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Declaracion clase
public class ControladorVistaPrincipal implements ActionListener{
    private VistaPrincipal vp;
    private Principal pl;
    public ControladorVistaPrincipal(){
        this.vp = new VistaPrincipal();
        this.pl = new Principal();
        vp.agregarListener(this);
        vp.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        if (vp.getButtonCerrarSesion()==e.getSource()){
            vp.dispose();
            ControladorLogin cl = new ControladorLogin();
            cl.vl.setVisible(true);
            
        }
        
    }
}
    

