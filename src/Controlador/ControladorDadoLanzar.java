package Controlador;

import Modelo.Batalla;
import Modelo.Dado;
import Modelo.Jugador;
import Modelo.PuzzleDeDados;
import Vista.VistaDadoLanzar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class ControladorDadoLanzar implements ActionListener{
    private VistaDadoLanzar vdl;
    private ArrayList<Dado> dadosModelo = new ArrayList();;
    private ControladorBatalla cb;
    private PuzzleDeDados pdd;
    private ArrayList<Integer> dadosVista;
    private Batalla b;
    public ControladorDadoLanzar(ControladorBatalla cb, Jugador jugador){
        vdl = new VistaDadoLanzar();
        vdl.setVisible(true);
        vdl.agregarListener(this);
        this.cb=cb;
        this.pdd = new PuzzleDeDados(jugador.getNombre());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(vdl.getButtonSeleccionar()==e.getSource()){
            vdl.anadirDados();
            dadosVista = vdl.getDados();
            int i = 0;
            while(dadosModelo.size()<dadosVista.size()){
                this.dadosModelo.add(pdd.getDados().get(dadosVista.get(i)));
                i++;
            }
            cb.setDados(this.dadosModelo);
            System.out.println(this.dadosModelo);
            vdl.dispose();
        }
    }
}
