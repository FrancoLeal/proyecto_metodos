package Controlador;

import Vista.VistaRegistro;
import Modelo.Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import BDD.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorRegistro implements ActionListener{
    private Registro r;
    private VistaRegistro vr;
    private ControladorLogin cl;
    private Usuario usuario;
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
            vr.setVisible(false);
            cl.setVista(true);
            
        }
        else if (vr.getButtonRegistrarse()==e.getSource()){
            try {
                usuario = new Usuario(vr.getUsuario(), vr.getPassword());
            } catch (SQLException ex) {
                Logger.getLogger(ControladorRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
}
