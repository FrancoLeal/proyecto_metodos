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
            String sesionCerrada = "El usuario "+Controlador.ControladorLogin.usuarioActivo+" ha cerrado sesión.";
            ControladorPrincipal.registrarAccion(sesionCerrada);
            vp.dispose();
            ControladorLogin cl = new ControladorLogin();
        }
        else if(vp.getButtonBatalla()==e.getSource()){
            String batallaIniciada = "El usuario "+Controlador.ControladorLogin.usuarioActivo+" ha iniciado una batalla.";
            ControladorPrincipal.registrarAccion(batallaIniciada);
            vp.setVisible(false);
            ControladorBatallaTipo cbt = new ControladorBatallaTipo(this);
        }
        else if(vp.getButtonTorneo()==e.getSource()){
            String torneoIniciado = "El usuario "+Controlador.ControladorLogin.usuarioActivo+" ha iniciado un torneo.";
            ControladorPrincipal.registrarAccion(torneoIniciado);
            //vp.setVisible(false);
            //Creacion objeto torneo
        }
        else if(vp.getButtonEditarDados()==e.getSource()){
            String edicionDados = "El usuario "+Controlador.ControladorLogin.usuarioActivo+" ha entrado a edición de dados.";
            ControladorPrincipal.registrarAccion(edicionDados);
            //vp.setVisible(false);
            //Creacion ventana editar dados     
        }
        else if(vp.getButtonSalir()==e.getSource()){
            String salidaUsuario = "El usuario "+ Controlador.ControladorLogin.usuarioActivo +" ha salido del programa.";
            ControladorPrincipal.registrarAccion(salidaUsuario);
            System.exit(0);
        }
     
    }
    public void setVista(boolean b){
        this.vp.setVisible(b);
    }
}
    

