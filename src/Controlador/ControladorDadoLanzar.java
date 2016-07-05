package Controlador;

import Modelo.Dado;
import Modelo.PuzzleDeDados;
import Vista.VistaDadoLanzar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class ControladorDadoLanzar implements ActionListener{
    private VistaDadoLanzar vdl;
    private ArrayList<Dado> dados = new ArrayList();;
    private ControladorBatalla cb;
    private PuzzleDeDados pdd;
    private ArrayList<Integer> dadosInt;
    public ControladorDadoLanzar(ControladorBatalla cb){
        vdl = new VistaDadoLanzar();
        vdl.setVisible(true);
        vdl.agregarListener(this);
        this.cb=cb;
        this.pdd = new PuzzleDeDados();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(vdl.getButtonSeleccionar()==e.getSource()){
            vdl.anadirDados();
            dadosInt = vdl.getDados();
            int i = 0;
            while(dados.size()<dadosInt.size()){
                this.dados.add(pdd.getDados().get(dadosInt.get(i)));
                i++;
            }
            System.out.println(this.dados);
            vdl.dispose();
        }
    }
    public void setPuzzleDeDados(PuzzleDeDados pdd){
        this.pdd=pdd;
    }
}
