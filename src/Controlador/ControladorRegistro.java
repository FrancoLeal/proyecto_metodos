package Controlador;

import Vista.VistaRegistro;
import Modelo.Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistro implements ActionListener{
    private Registro r;
    private VistaRegistro vr;
    private ControladorLogin cl;
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
    }
 //OBTENER LO INGRESADO POR EL USUARIO EN LA VENTANA REGISTRO 
 String nombreUsuario = vr.getjTextField1().getText();
 String nickname = vr.getjTextField2().getText();
 String password = vr.getjPasswordField1().getText();
 String verificarPass= vr.getjPasswordField2().getText();
   // GETTER EN VISTA???  
}
