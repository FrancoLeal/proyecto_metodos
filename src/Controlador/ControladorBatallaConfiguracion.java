package Controlador;

import Vista.VistaBatallaConfiguracion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControladorBatallaConfiguracion implements ActionListener {
    
    private VistaBatallaConfiguracion vbc;
    private ControladorBatallaTipo cbt;
    private boolean batallaPorEquipos;
    private ArrayList<String> jugadores;
    
    public ControladorBatallaConfiguracion(ControladorBatallaTipo cbt){
        this.cbt = cbt;
        jugadores = new ArrayList();
        batallaPorEquipos = cbt.getBatallaPorEquipos();
        this.vbc = new VistaBatallaConfiguracion(batallaPorEquipos);
        vbc.setVisible(true);
        vbc.agregarListener(this);
        vbc.setLocationRelativeTo(null);
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
            System.out.println("Jugador 1: "+Controlador.ControladorLogin.usuarioActivo+"; Equipo: "+vbc.getJugador1Equipo());
            System.out.println("Jugador 2: "+vbc.getSeleccionJugador2()+"; Equipo: "+vbc.getJugador2Equipo());
            System.out.println("Jugador 3: "+vbc.getSeleccionJugador3()+"; Equipo: "+vbc.getJugador3Equipo());
            System.out.println("Jugador 4: "+vbc.getSeleccionJugador4()+"; Equipo: "+vbc.getJugador4Equipo());
            System.out.println("Dando comienzo a la batalla...");
            vbc.setVisible(false);
            ControladorBatalla cb = new ControladorBatalla(this);
        }
    }
    public boolean getBatallaTipo(){
        return this.batallaPorEquipos;
    }
    public ArrayList<String> getJugadores(){
        return vbc.getJugadores();
    }
}
