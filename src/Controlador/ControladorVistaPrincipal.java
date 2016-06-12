package Controlador;
//Importar clases
import Modelo.Principal;
import Vista.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Declaracion clase
public class ControladorVistaPrincipal implements ActionListener{
    private VistaPrincipal vp;
    private Principal pl;
    public ControladorVistaPrincipal(){
        this.vp = new VistaPrincipal();
        this.pl = new Principal();
        vp.setLocationRelativeTo(null);
        vp.agregarListener(this);
        vp.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        if (vp.getButtonCerrarSesion()==e.getSource()){
            System.out.println("El usuario "+Controlador.ControladorLogin.usuarioActivo+" ha cerrado sesión.");
            vp.dispose();
            ControladorLogin cl = new ControladorLogin();
        }
        else if(vp.getButtonBatalla()==e.getSource()){
            System.out.println("El usuario "+Controlador.ControladorLogin.usuarioActivo+" ha iniciado una batalla.");
            vp.setVisible(false);
            ControladorBatallaTipo cbt = new ControladorBatallaTipo(this);
        }
        else if(vp.getButtonTorneo()==e.getSource()){
            System.out.println("El usuario "+Controlador.ControladorLogin.usuarioActivo+" ha iniciado un torneo.");
            //vp.setVisible(false);
            //Creacion objeto torneo
        }
        else if(vp.getButtonEditarDados()==e.getSource()){
            System.out.println("El usuario "+Controlador.ControladorLogin.usuarioActivo+" ha entrado a edición de dados.");
            //vp.setVisible(false);
            //Creacion ventana editar dados     
        }
        else if(vp.getButtonSalir()==e.getSource()){
            System.out.println("El usuario "+ Controlador.ControladorLogin.usuarioActivo +" ha salido del programa.");
            System.out.println("Cerrando...");
            System.exit(0);
        }
     
    }
    public void setVista(boolean b){
        this.vp.setVisible(b);
    }
}
    

