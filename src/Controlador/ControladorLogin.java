package Controlador;
//Importación de clases
import Modelo.Usuario;
import Modelo.Login;
import Vista.VistaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//Definición de la clase
public class ControladorLogin implements ActionListener,KeyListener {
    //Atributos
    private Login lg;
    private VistaLogin vl;
    public static String usuarioActivo;
    public ControladorLogin(){
            vl = new VistaLogin();
            vl.setVisible(true);
            vl.setLocationRelativeTo(null);
            
            vl.agregarListener(this);
            vl.agregarKeyListener(this);
    }
    public void actionPerformed(ActionEvent e){
            if(vl.getButtonIngresar()==e.getSource()){
                String usuario = vl.getUsuarioVista();
                String password = vl.getPasswordVista();
                try {
                    Usuario comprobadorUsuario = Usuario.obtener(usuario, password);
                    if(comprobadorUsuario!=null){
                        lg = new Login(comprobadorUsuario.getNombre(),comprobadorUsuario.getPassword());
                        if (lg.existeUsuario(usuario)){
                            if(lg.verificarDatos(usuario,password)){
                                usuarioActivo = usuario;
                                String inicioSesion = "El usuario "+usuarioActivo+" ha iniciado sesión.";
                                ControladorPrincipal.registrarAccion(inicioSesion);
                                vl.dispose();
                                ControladorVistaPrincipal cvp = new ControladorVistaPrincipal();
                            }
                            else{
                                String inicioSesionFallidaPass = "Inicio de sesión fallida: Usuario "+usuario+"; Contraseña incorrecta.";
                                ControladorPrincipal.registrarAccion(inicioSesionFallidaPass);
                                vl.contrasenaIncorrecta();
                            }
                    
                        }
                        else{
                            String inicioSesionFallidaUser = "Inicio de sesión fallida: Usuario "+usuario+" no existe.";
                            ControladorPrincipal.registrarAccion(inicioSesionFallidaUser);
                            vl.usuarioInexistente(usuario);
                        }
                    }
                    else{
                        String inicioSesionFallidaUser = "Inicio de sesión fallida: Usuario "+usuario+" no existe.";
                        ControladorPrincipal.registrarAccion(inicioSesionFallidaUser);
                        vl.usuarioInexistente(usuario);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
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

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
            vl.getButtonIngresar().doClick();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
