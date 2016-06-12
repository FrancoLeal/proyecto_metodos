package Controlador;

import Vista.VistaBatallaConfiguracion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorBatallaConfiguracion implements ActionListener {
    
    private VistaBatallaConfiguracion vbc;
    private ControladorBatallaTipo cbt;
    private boolean batallaPorEquipos;
    
    public ControladorBatallaConfiguracion(ControladorBatallaTipo cbt){
        this.cbt = cbt;
        this.vbc = new VistaBatallaConfiguracion();
        vbc.setVisible(true);
        vbc.agregarListener(this);
        vbc.setLocationRelativeTo(null);
        batallaPorEquipos = cbt.getBatallaPorEquipos();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(vbc.getButtonAtrás()==e.getSource()){
            vbc.dispose();
            cbt.setVista(true);
        }
        else if(vbc.getButtonEditarPuzleJ1()==e.getSource()){
            System.out.println("Entrando a edición de puzle de Jugador 1: "+Controlador.ControladorLogin.usuarioActivo);
        }
        else if(vbc.getButtonEditarPuzleJ2()==e.getSource()){
            System.out.println("Entrando a edición de puzle de Jugador 2: ");
        }
        else if(vbc.getButtonEditarPuzleJ3()==e.getSource()){
            System.out.println("Entrando a edición de puzle de Jugador 3: ");
        }
        else if(vbc.getButtonEditarPuzleJ4()==e.getSource()){
            System.out.println("Entrando a edición de puzle de Jugador 4: ");
        }
        else if(vbc.getButtonIniciarSesionJ2()==e.getSource()){
            System.out.println("Entrando a inicio de sesión de invitado Jugador 2: ");
        }
        else if(vbc.getButtonIniciarSesionJ3()==e.getSource()){
            System.out.println("Entrando a inicio de sesión de invitado Jugador 3: ");
        }
        else if(vbc.getButtonIniciarSesionJ4()==e.getSource()){
            System.out.println("Entrando a inicio de sesión de invitado Jugador 4: ");
        }
        else if(vbc.getButtonComenzarBatalla()==e.getSource()){
            System.out.println("Dando comienzo a la batalla...");
            vbc.setVisible(false);
            ControladorBatalla cb = new ControladorBatalla(this);
        }
    }
}
