package Controlador;

import Modelo.Usuario;
import static Controlador.ControladorLogin.usuarioActivo;
import Modelo.Login;
import Vista.VistaLoginSecundario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorLoginSecundario implements ActionListener, KeyListener{
    private VistaLoginSecundario vLogSecundario;
    private Login logSecundario;
    private ControladorBatallaConfiguracion contrBatallaConfig;
    public ControladorLoginSecundario(ControladorBatallaConfiguracion contrBatallaConfig){
        this.vLogSecundario = new VistaLoginSecundario();
        this.vLogSecundario.setLocationRelativeTo(null);
        this.contrBatallaConfig=contrBatallaConfig;
        this.vLogSecundario.setVisible(true);
        this.vLogSecundario.agregarListener(this);
        this.vLogSecundario.agregarKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(vLogSecundario.getButtonIniciarSesion()==e.getSource()){
            String usuario = vLogSecundario.getUsuario();
            String password = vLogSecundario.getPassword();
            try{
                if(usuario!=null){
                    if(password!=null){
                        Usuario comprobadorUsuario = Usuario.obtener(usuario, password);
                        if(comprobadorUsuario!=null){
                            logSecundario = new Login(comprobadorUsuario.getNombre(),comprobadorUsuario.getPassword());
                            if (logSecundario.existeUsuario(usuario)){
                                if(logSecundario.verificarDatos(usuario,password)){
                                    String inicioSesion = "El usuario "+usuario+" ha iniciado sesión.";
                                    ControladorPrincipal.registrarAccion(inicioSesion);
                                    contrBatallaConfig.setUsuario(usuario);
                                    vLogSecundario.logExitoso();
                                    vLogSecundario.dispose();
                                }
                                else{
                                    String inicioSesionFallidaPass = "Inicio de sesión fallida: Usuario "+usuario+"; Contraseña incorrecta.";
                                    ControladorPrincipal.registrarAccion(inicioSesionFallidaPass);
                                    vLogSecundario.errorPassword();
                                }
                            }
                            else{
                                String inicioSesionFallidaUser = "Inicio de sesión fallida: Usuario "+usuario+" no existe.";
                                ControladorPrincipal.registrarAccion(inicioSesionFallidaUser);
                                vLogSecundario.errorUsuario();
                            }
                        }
                        else{
                                String inicioSesionFallidaUser = "Inicio de sesión fallida: Usuario "+usuario+" no existe.";
                                ControladorPrincipal.registrarAccion(inicioSesionFallidaUser);
                                vLogSecundario.errorUsuario();
                            }
                    }
                    else{
                        vLogSecundario.faltaPassword();
                    }
                }
                else{
                    vLogSecundario.faltaUsuario();
                }
            }
            catch(SQLException ex){
                Logger.getLogger(ControladorLoginSecundario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
        @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
            vLogSecundario.getButtonIniciarSesion().doClick();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
