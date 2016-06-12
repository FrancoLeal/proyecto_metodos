package Controlador;

import Vista.VistaBatallaConfiguracion;
import Vista.VistaBatallaTipo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorBatallaTipo implements ActionListener {
    
    private VistaBatallaTipo vbt;
    private ControladorVistaPrincipal cvp;
    private boolean batallaPorEquipos; //true: por equipos; false: todos contra todos, por defecto.
    
    public ControladorBatallaTipo(ControladorVistaPrincipal cvp){
        this.cvp = cvp;
        this.vbt = new VistaBatallaTipo();
        vbt.setVisible(true);
        vbt.agregarListener(this);
        vbt.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(vbt.getButtonAtrás()==e.getSource()){
            vbt.dispose();
            cvp.setVista(true);
        }
        else if(vbt.getButtonPorEquipos()==e.getSource()){
            System.out.println("El usuario "+Controlador.ControladorLogin.usuarioActivo+" ha seleccionado \"Batalla por Equipos.\"");
            batallaPorEquipos = true;
            vbt.setVisible(false);
            ControladorBatallaConfiguracion cbc = new ControladorBatallaConfiguracion(this);
        }
        else if(vbt.getButtonTodosVsTodos()==e.getSource()){
            System.out.println("El usuario "+Controlador.ControladorLogin.usuarioActivo+" ha seleccionado \"Batalla Todos contra Todos.\"");
            batallaPorEquipos = false;
            vbt.setVisible(false);
            ControladorBatallaConfiguracion cbc = new ControladorBatallaConfiguracion(this);
        }
    }
    
    public boolean getBatallaPorEquipos(){
        return this.batallaPorEquipos;
    }
    public void setVista(boolean b){
        this.vbt.setVisible(b);
    }
}
