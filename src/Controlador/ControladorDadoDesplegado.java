package Controlador;
//Importacion clases
import Modelo.DadoDesplegado;
import Vista.VistaDado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Declaracion clase
public class ControladorDadoDesplegado implements ActionListener{
    private VistaDado vd;
    private DadoDesplegado dd;
    private int[][] forma;
    private ControladorBatalla cb;
    
    public ControladorDadoDesplegado(ControladorBatalla cb){
        vd = new VistaDado();
        vd.setVisible(true);
        vd.agregarListener(this);
        this.cb = cb;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(vd.getForma1()==e.getSource()){
            vd.dispose();
            forma= dd.getFormaT();
        }
    }
    public int[][] getForma(){
        return this.forma;
    }
}
