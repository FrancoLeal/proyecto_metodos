package Controlador;
//Importacion de clases
import Modelo.Batalla;
import Modelo.Dado;
//import Modelo.Dado2;
import Modelo.Tablero;
import Vista.VistaBatalla;
import Vista.VistaPrincipal;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.ImageIcon;
//Definicion clase
public class ControladorBatalla extends MouseAdapter implements ActionListener {
    //Definicion atributos
    private VistaBatalla vb;
    private Batalla b;
    private ControladorBatallaConfiguracion cbg;
    private JButton[][] terreno;
    private ImageIcon ImagenAtaque;
    private ImageIcon ImagenMagia ;
    private ImageIcon ImagenMovimiento;
    private ImageIcon ImagenTrampa;
    private ImageIcon ImagenInvocar;
    
    //Definicion constructor
    public ControladorBatalla(ControladorBatallaConfiguracion cbg){
        //this.cvp = cvp;
        this.cbg = cbg;
        this.vb = new VistaBatalla();
        this.b = new Batalla();
        vb.setVisible(true);
        vb.agregarListener(this,this);
        vb.setLocationRelativeTo(null);
        this.terreno = vb.getTerreno();
        ImagenAtaque = new ImageIcon(this.getClass().getResource("ATAQUE.png"));
        ImagenMagia = new ImageIcon(this.getClass().getResource("MAGIA.png"));
        ImagenMovimiento = new ImageIcon(this.getClass().getResource("MOVIMIENTO.png"));
        ImagenTrampa = new ImageIcon(this.getClass().getResource("TRAMPA.png"));
        ImagenInvocar = new ImageIcon(this.getClass().getResource("INVOCAR.png"));
    }
    
    public void actionPerformed(ActionEvent e){
        /*if(vb.getButtonAtras()==e.getSource()){
            vb.dispose();
            cvp.setVista(true);
        }*/
        /*else*/ if(vb.getButtonLanzar()==e.getSource()){
            vb.setGifDados(new ImageIcon(this.getClass().getResource("dados.gif")));
            System.out.println("Ok, funciona");
        }
        else if (vb.getButtonParar()==e.getSource()){
            vb.setGifDados(false);
            Dado Dado1 = new Dado(ImagenAtaque,ImagenMagia,ImagenMovimiento,ImagenTrampa,ImagenInvocar,ImagenAtaque);
            vb.setResultadoDado1(Dado1.resultado());
            Dado Dado2 = new Dado(ImagenAtaque,ImagenMagia,ImagenMovimiento,ImagenTrampa,ImagenInvocar,ImagenAtaque);
            vb.setResultadoDado2(Dado2.resultado());
            Dado Dado3 = new Dado(ImagenAtaque,ImagenMagia,ImagenMovimiento,ImagenTrampa,ImagenInvocar,ImagenAtaque);
            vb.setResultadoDado3(Dado3.resultado());
            Dado Dado4 = new Dado(ImagenAtaque,ImagenMagia,ImagenMovimiento,ImagenTrampa,ImagenInvocar,ImagenAtaque);
            vb.setResultadoDado4(Dado4.resultado());
        }
        else if (vb.getButtonDesplegar()==e.getSource()){
            ControladorDadoDesplegado cdd = new ControladorDadoDesplegado(this);
        }
        else{
            for (int i = 0 ; i<15 ; i++){
                for (int j = 0 ; j<15 ; j++){
                    if(vb.getBotonTerreno(i,j)==e.getSource()){
                        System.out.println("X="+i+", Y="+j);
                    }
                }
            }
        }
    }
    public void mouseEntered(MouseEvent e){
        
    }
    public void mouseReleased(MouseEvent e){
        
    }
    public void mouseClicked(MouseEvent e){
        
    }
    public void mousePressed(MouseEvent e){
        
    }
    public void mouseExited(MouseEvent e){
        
    }
}