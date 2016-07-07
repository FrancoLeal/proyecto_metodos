package Controlador;

import Modelo.Batalla;
import Modelo.Criatura;
import Modelo.Dado;
import Modelo.Jugador;
import Modelo.PuzzleDeDados;
import Vista.VistaDadoLanzar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class ControladorDadoLanzar implements ActionListener{
    private VistaDadoLanzar vdl;
    private ArrayList<Dado> dadosModelo = new ArrayList();
    private ControladorBatalla cb;
    private PuzzleDeDados pdd;
    private ArrayList<Integer> dadosVista;
    private Batalla b;
    public ControladorDadoLanzar(ControladorBatalla cb, Jugador jugador){
        vdl = new VistaDadoLanzar();
        vdl.setVisible(true);
        vdl.agregarListener(this);
        this.pdd = jugador.getPuzzle();
        ArrayList<String> criaturas = new ArrayList();
        for(Dado dado : pdd.getDados()){
            criaturas.add(dado.getCriatura().getNombre());
        }
        vdl.setDados(criaturas);
        this.cb=cb;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(vdl.getButtonSeleccionar()==e.getSource()){
            vdl.anadirDados();
            if(vdl.getDados().size()<=4){
                dadosVista = vdl.getDados();
                int i = 0;
                try{
                while(i<=4){
                    this.dadosModelo.add(pdd.getDados().get(dadosVista.get(i)));
                    i++;
                }
                }
                catch (IndexOutOfBoundsException io){
                    
                }
                cb.setDados(this.dadosModelo);
                vdl.dispose();
                cb.setEnabledInvocar(true);
            }
            else{
                vdl.muchosDados();
            }
        }
    }
}
