package Controlador;

import Modelo.Criatura;
import Modelo.Dado;
import Vista.VistaInvocar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControladorInvocar implements ActionListener{
    private VistaInvocar vi;
    private ControladorBatalla cb;
    private ArrayList<Criatura> criaturas;
    private ArrayList<String> nombreCriaturas;
    private ControladorDadoDesplegado cdd; 
    public ControladorInvocar(ControladorBatalla cb, ArrayList<Criatura> criaturas){
        this.cb=cb;
        this.criaturas=criaturas;
        vi=new VistaInvocar();
        vi.setVisible(true);
        vi.agregarListener(this);
        for(Criatura criatura : this.criaturas){
            nombreCriaturas.add(criatura.getNombre());
        }
        vi.setCriaturas(nombreCriaturas);
    }

//    ControladorInvocar(ControladorBatalla aThis, ArrayList<Dado> dados) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public void actionPerformed(ActionEvent e) {
        if(vi.getButtonCriatura1()==e.getSource()){
            cb.setCriaturaInvocar(criaturas.get(0));
        }
        else if(vi.getButtonCriatura2()==e.getSource()){
            cb.setCriaturaInvocar(criaturas.get(1));
        }
        else if(vi.getButtonCriatura3()==e.getSource()){
            cb.setCriaturaInvocar(criaturas.get(2));
        }
        else if(vi.getButtonCriatura4()==e.getSource()){
            cb.setCriaturaInvocar(criaturas.get(3));
        }
        vi.dispose();
        cdd = new ControladorDadoDesplegado(this.cb,this);
    }
}
