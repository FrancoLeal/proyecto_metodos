package Controlador;

import Modelo.Conexion;
import Vista.VistaRegistro;
import Modelo.Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControladorRegistro implements ActionListener{
    private Registro r;
    private VistaRegistro vr;
    private ControladorLogin cl;
    private Usuario usuario;
    private Conexion conexion;
    public ControladorRegistro(ControladorLogin cl){
        r = new Registro();
        vr = new VistaRegistro();
        vr.setVisible(true);
        vr.setLocationRelativeTo(null);
        vr.agregarListener(this);
        
        this.cl = cl;
    }

    public void actionPerformed(ActionEvent e) {
        if(vr.getButtonAtras()==e.getSource()){
            vr.dispose();
            cl.setVista(true);
            
        }
        else if (vr.getButtonRegistrarse()==e.getSource()){
            try {
                conexion = new Conexion();
                conexion.conectar();
                if(vr.getPassword().equals(vr.getPassword2())){
                    if(Usuario.obtener(vr.getUsuario())){
                        String intentoRegistro1 = "Intento fallido de registro: el usuario "+vr.getUsuario()+" ya existe.";
                        ControladorPrincipal.registrarAccion(intentoRegistro1);
                        JOptionPane.showMessageDialog(null,intentoRegistro1);
                    }
                    else{
                        usuario = new Usuario(vr.getUsuario(), vr.getPassword());
                        usuario.save();
                        String registroExitoso = "El usuario "+vr.getUsuario()+" fue registrado exitosamente.";
                        ControladorPrincipal.registrarAccion(registroExitoso);
                        JOptionPane.showMessageDialog(null,registroExitoso);
                        vr.dispose();
                        cl.setVista(true);
                    }
                }
                else{
                    String intentoRegistro2 = "Intento fallido de registro: las contraseñas no coinciden, intente denuevo.";
                    System.out.println(intentoRegistro2);
                    JOptionPane.showMessageDialog(null,intentoRegistro2);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControladorRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
