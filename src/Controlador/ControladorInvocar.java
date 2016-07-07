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
    private int posCriatura;
    private String dueño;
    
    public ControladorInvocar(ControladorBatalla cb, ArrayList<Criatura> criaturas, String dueño){
        this.cb=cb;
        this.dueño=dueño;
        this.criaturas=criaturas;
        nombreCriaturas= new ArrayList();
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
            cdd = new ControladorDadoDesplegado(this.cb,this);
            System.out.println("ACCION 1 -- "+cb.getCriaturas().size());
            //try{
                cdd.setCriaturaInvocar(cb.getCriaturas().get(0),this.dueño);
//            }
//            catch(NullPointerException ne){
//                System.out.println("Error 1!!!!");
//            }
        }
        else if(vi.getButtonCriatura2()==e.getSource()){
            cdd = new ControladorDadoDesplegado(this.cb,this);
            System.out.println("ACCION 2-- "+cb.getCriaturas().size());
            //try{
            cdd.setCriaturaInvocar(cb.getCriaturas().get(1),this.dueño);
//            }
//            catch(NullPointerException ne){
//                System.out.println("Error 2!!!!");
//            }
        }
        else if(vi.getButtonCriatura3()==e.getSource()){
            cdd = new ControladorDadoDesplegado(this.cb,this);
            System.out.println("ACCION 3-- "+cb.getCriaturas().size());
            //try{
            cdd.setCriaturaInvocar(cb.getCriaturas().get(2),this.dueño);
//            }
//            catch(NullPointerException ne){
//                System.out.println("Error 3!!!!");
//            }
        }
        else if(vi.getButtonCriatura4()==e.getSource()){
            cdd = new ControladorDadoDesplegado(this.cb,this);
            System.out.println("ACCION 4-- "+cb.getCriaturas().size());
            //try{
            cdd.setCriaturaInvocar(cb.getCriaturas().get(3),this.dueño);
//        }
//            catch(NullPointerException ne){
//                System.out.println("Error 4!!!!");
//            }
        }
        vi.dispose();
    }
    public int getPosCriatura(){
        return this.posCriatura;
    }
}
