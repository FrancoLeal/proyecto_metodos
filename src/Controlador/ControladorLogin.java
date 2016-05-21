package Controlador;
//Importación de clases
import Modelo.Login;
import Vista.VistaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controlador.ControladorVistaPrincipal;
//Definición de la clase
public class ControladorLogin implements ActionListener {
    //Atributos
    private Login lg;
    private VistaLogin vl;
    private ControladorVistaPrincipal cvp;
    
        public static void main(String[] args){
            ControladorLogin cl = new ControladorLogin();
            cl.vl = new VistaLogin();
            cl.vl.setVisible(true);
            cl.lg = new Login("franco", "juegos");
            cl.lg.getUsuario();
            cl.lg.getPassword();
            cl.vl.agregarListener(cl);
    }
    public void actionPerformed(ActionEvent e){
            if(vl.getButtonIngresar()==e.getSource()){
                String usuario = vl.getUsuarioVista();
                String password = vl.getPasswordVista();
                if (lg.existeUsuario(usuario)){
                    if(lg.verificarDatos(usuario,password)){
                        vl.setVisible(false);
                        cvp = new ControladorVistaPrincipal();
                    }
                }
                else{
                    vl.usuarioInexistente(usuario);
                }
        }
    }
}
