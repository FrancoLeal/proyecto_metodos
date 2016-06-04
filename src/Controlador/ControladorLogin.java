package Controlador;
//Importación de clases
import Modelo.Login;
import Vista.VistaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Definición de la clase
public class ControladorLogin implements ActionListener {
    //Atributos
    private Login lg;
    private VistaLogin vl;
    public ControladorLogin(){
            vl = new VistaLogin();
            vl.setVisible(true);
            vl.setLocationRelativeTo(null);
            lg = new Login("franco", "juegos");
            lg.getUsuario();
            lg.getPassword();
            vl.agregarListener(this);
    }
    public void actionPerformed(ActionEvent e){
            if(vl.getButtonIngresar()==e.getSource()){
                String usuario = vl.getUsuarioVista();
                String password = vl.getPasswordVista();
                if (lg.existeUsuario(usuario)){
                    if(lg.verificarDatos(usuario,password)){
                        vl.dispose();
                        ControladorVistaPrincipal cvp = new ControladorVistaPrincipal();
                    }
                        else{ vl.contrasenaIncorrecta();}
                    
                }
                else{
                    vl.usuarioInexistente(usuario);
                }
        }
    }
}
