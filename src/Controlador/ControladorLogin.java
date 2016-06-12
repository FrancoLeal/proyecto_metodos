package Controlador;
//Importación de clases
import Modelo.Login;
import Modelo.Registro;
import Vista.VistaLogin;
import Vista.VistaRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Definición de la clase
public class ControladorLogin implements ActionListener {
    //Atributos
    private Login lg;
    private VistaLogin vl;
    public static String usuarioActivo;
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
                        usuarioActivo = usuario;
                        System.out.println("El usuario "+usuarioActivo+" ha iniciado sesión.");
                        vl.dispose();
                        ControladorVistaPrincipal cvp = new ControladorVistaPrincipal();
                    }
                    else{
                        System.out.println("Inicio de sesión fallida: Usuario "+usuario+"; Contraseña incorrecta.");
                        vl.contrasenaIncorrecta();
                    }
                    
                }
                else{
                    System.out.println("Inicio de sesión fallida: Usuario "+usuario+" no existe.");
                    vl.usuarioInexistente(usuario);
                }
            }
            if(vl.getButtonRegistrarse()==e.getSource()){
                ControladorRegistro cr = new ControladorRegistro(this);
                vl.setVisible(false);
            }
    }
    public void setVista(boolean b){
        this.vl.setVisible(b);
    }
}
