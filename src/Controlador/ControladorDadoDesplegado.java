package Controlador;
//Importacion clases
import Modelo.Dado;
import Vista.VistaDado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Declaracion clase
public class ControladorDadoDesplegado implements ActionListener{
    private VistaDado vd;
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
            this.cb.setForma(Dado.FORMA1);
            this.cb.setUltimoBoton(3);
        }
        else if(vd.getForma2()==e.getSource()){
            vd.dispose();
            this.cb.setForma(Dado.FORMA2);
            this.cb.setUltimoBoton(3);
            System.out.println("Funciona");
        }
    }
}
