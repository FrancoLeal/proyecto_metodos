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
    private int ultimoBoton;
    
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
            String vueltaAtras = "El usuario "+Controlador.ControladorLogin.usuarioActivo+" ha vuelto atrás. ";
            ControladorPrincipal.registrarAccion(vueltaAtras);
            vbc.dispose();
            cbt.setVista(true);
        }
        else if(vbc.getButtonEditarPuzleJ1()==e.getSource()){
            String edicionJ1 = "Entrando a edición de puzle de Jugador 1: "+Controlador.ControladorLogin.usuarioActivo;
            ControladorPrincipal.registrarAccion(edicionJ1);
        }
        else if(vbc.getButtonEditarPuzleJ2()==e.getSource()){
            String edicionJ2 = "Entrando a edición de puzle de Jugador 2: ";
            ControladorPrincipal.registrarAccion(edicionJ2);
        }
        else if(vbc.getButtonEditarPuzleJ3()==e.getSource()){
            String edicionJ3 = "Entrando a edición de puzle de Jugador 3: ";
            ControladorPrincipal.registrarAccion(edicionJ3);
        }
        else if(vbc.getButtonEditarPuzleJ4()==e.getSource()){
            String edicionJ4 = "Entrando a edición de puzle de Jugador 4: ";
            ControladorPrincipal.registrarAccion(edicionJ4);
        }
        else if(vbc.getButtonIniciarSesionJ2()==e.getSource()){
            String inicioJ2 = "Entrando a inicio de sesión de invitado Jugador 2: ";
            this.ultimoBoton = 2;
            ControladorLoginSecundario cls = new ControladorLoginSecundario(this);
            ControladorPrincipal.registrarAccion(inicioJ2);
        }
        else if(vbc.getButtonIniciarSesionJ3()==e.getSource()){
            String inicioJ3 = "Entrando a inicio de sesión de invitado Jugador 3: ";
            this.ultimoBoton = 3;
            ControladorLoginSecundario cls = new ControladorLoginSecundario(this);
            ControladorPrincipal.registrarAccion(inicioJ3);
        }
        else if(vbc.getButtonIniciarSesionJ4()==e.getSource()){
            String inicioJ4 = "Entrando a inicio de sesión de invitado Jugador 4: ";
            this.ultimoBoton = 4;
            ControladorLoginSecundario cls = new ControladorLoginSecundario(this);
            ControladorPrincipal.registrarAccion(inicioJ4);
        }
        else if(vbc.getButtonComenzarBatalla()==e.getSource()){
            vbc.setJugadores();
            if(getJugadores().size()>=2){
                //System.out.println(vbc.getJugadores().size()+"fsdfsdfsdf");
                String seleccionJ1 = "Configuración Jugador 1: "+Controlador.ControladorLogin.usuarioActivo+"; Equipo: "+vbc.getJugador1Equipo();
                ControladorPrincipal.registrarAccion(seleccionJ1);
                String seleccionJ2 = "Configuración Jugador 2: "+vbc.getSeleccionJugador2()+"; Equipo: "+vbc.getJugador2Equipo();
                ControladorPrincipal.registrarAccion(seleccionJ2);
                String seleccionJ3 = "Configuración Jugador 3: "+vbc.getSeleccionJugador3()+"; Equipo: "+vbc.getJugador3Equipo();
                ControladorPrincipal.registrarAccion(seleccionJ3);
                String seleccionJ4 = "Configuración Jugador 4: "+vbc.getSeleccionJugador4()+"; Equipo: "+vbc.getJugador4Equipo();
                ControladorPrincipal.registrarAccion(seleccionJ4);
                String batalla = "Dando comienzo a la batalla...";
                ControladorPrincipal.registrarAccion(batalla);
                vbc.setVisible(false);
                ControladorBatalla cb = new ControladorBatalla(this);
            }
            else{
                vbc.faltanJugadores();
            }
        }
    }
    public boolean getBatallaTipo(){
        return this.batallaPorEquipos;
    }
    public ArrayList<String> getJugadores(){
        return vbc.getJugadores();
    }

    void setUsuario(String usuario) {
        if(this.ultimoBoton==2){
            vbc.agregarElemento2(usuario);
        }
        else if(this.ultimoBoton==3){
            vbc.agregarElemento3(usuario);
        }
        else if(this.ultimoBoton==4){
            vbc.agregarElemento4(usuario);
        }
    }
    public void setVista(boolean b){
        this.vbc.setVisible(b);
    }
}
