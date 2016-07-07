package Controlador;
//Importacion clases
import Modelo.Criatura;
import Modelo.Dado;
import Vista.VistaDado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Declaracion clase
public class ControladorDadoDesplegado implements ActionListener{
    private VistaDado vd;
    private ControladorInvocar ci;
    private ControladorBatalla cb;
    private Criatura criatura;
    
    public ControladorDadoDesplegado(ControladorBatalla cb, ControladorInvocar ci){
        vd = new VistaDado();
        vd.setVisible(true);
        vd.agregarListener(this);
        this.ci = ci;
        this.cb=cb;
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
        }
        this.cb.setCriaturaInvocar(this.criatura);
    }
    public void setCriaturaInvocar(Criatura criatura,String dueño){
        this.criatura=criatura;
        this.criatura.setDueño(dueño);
    }
}
