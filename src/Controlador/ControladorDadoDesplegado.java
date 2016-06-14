package Controlador;
//Importacion clases
import Modelo.Dado;
import Vista.VistaDado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Declaracion clase
public class ControladorDadoDesplegado implements ActionListener{
    private VistaDado vd;
    private Dado dd;
    private int[][] forma;
    private ControladorBatalla cb;
    
    public ControladorDadoDesplegado(ControladorBatalla cb){
        vd = new VistaDado();
        dd = new Dado();
        vd.setVisible(true);
        vd.agregarListener(this);
        this.cb = cb;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(vd.getForma1()==e.getSource()){
            this.forma=dd.getForma1();
        }
    }
    public int[][] getForma(){
        return this.forma;
    }
}
