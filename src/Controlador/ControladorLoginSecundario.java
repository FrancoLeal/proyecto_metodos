package Controlador;

import BDD.Usuario;
import static Controlador.ControladorLogin.usuarioActivo;
import Modelo.Login;
import Vista.VistaLoginSecundario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorLoginSecundario implements ActionListener{
    private VistaLoginSecundario vls;
    private Login lgs;
    private ControladorBatallaConfiguracion cbc;
    public ControladorLoginSecundario(ControladorBatallaConfiguracion cbc){
        this.vls = new VistaLoginSecundario();
        this.vls.setLocationRelativeTo(null);
        this.cbc=cbc;
        this.vls.setVisible(true);
        this.vls.agregarListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(vls.getButtonIniciarSesion()==e.getSource()){
            String usuario = vls.getUsuario();
            String password = vls.getPassword();
            try{
                if(usuario!=null){
                    if(password!=null){
                        Usuario comprobadorUsuario = Usuario.obtener(usuario, password);
                        if(comprobadorUsuario!=null){
                            lgs = new Login(comprobadorUsuario.getNombre(),comprobadorUsuario.getPassword());
                            if (lgs.existeUsuario(usuario)){
                                if(lgs.verificarDatos(usuario,password)){
                                    String inicioSesion = "El usuario "+usuario+" ha iniciado sesión.";
                                    ControladorPrincipal.registrarAccion(inicioSesion);
                                    cbc.setUsuario(usuario);
                                    vls.logExitoso();
                                    vls.dispose();
                                }
                                else{
                                    String inicioSesionFallidaPass = "Inicio de sesión fallida: Usuario "+usuario+"; Contraseña incorrecta.";
                                    ControladorPrincipal.registrarAccion(inicioSesionFallidaPass);
                                    vls.errorPassword();
                                }
                            }
                            else{
                                String inicioSesionFallidaUser = "Inicio de sesión fallida: Usuario "+usuario+" no existe.";
                                ControladorPrincipal.registrarAccion(inicioSesionFallidaUser);
                                vls.errorUsuario();
                            }
                        }
                        else{
                                String inicioSesionFallidaUser = "Inicio de sesión fallida: Usuario "+usuario+" no existe.";
                                ControladorPrincipal.registrarAccion(inicioSesionFallidaUser);
                                vls.errorUsuario();
                            }
                    }
                    else{
                        vls.faltaPassword();
                    }
                }
                else{
                    vls.faltaUsuario();
                }
            }
            catch(SQLException ex){
                Logger.getLogger(ControladorLoginSecundario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
