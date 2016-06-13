package Controlador;
//Importacion de clases
import Modelo.Batalla;
import Modelo.Dado;
import Modelo.JefeDeTerreno;
//import Modelo.Dado2;
import Modelo.Tablero;
import Modelo.Jugador;
import Vista.VistaBatalla;
import Vista.VistaPrincipal;
import java.awt.Color;
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
    private int cantidadDeJugadores;
    private int turnoActual;
    private ImageIcon ImagenAtaque;
    private ImageIcon ImagenMagia ;
    private ImageIcon ImagenMovimiento;
    private ImageIcon ImagenTrampa;
    private ImageIcon ImagenInvocar;
    
    //Definicion constructor
    public ControladorBatalla(/*ControladorVistaPrincipal cvp, int cantidadDeJugadores,*/ ControladorBatallaConfiguracion cbg){
        this.cantidadDeJugadores = cantidadDeJugadores;
        this.turnoActual = 1;
        //this.cvp = cvp;
        this.cbg = cbg;
        this.vb = new VistaBatalla();
        this.b = new Batalla(this.cantidadDeJugadores);
        vb.setVisible(true);
        vb.agregarListener(this,this);
        vb.setLocationRelativeTo(null);
        this.terreno = vb.getTerreno();
        //Hay error al cargar las imagenes del dado a la pantalla. Funcoionaba, pero
        //al querer cambiarlas rutas por algo generico dejo de funcionar.
        ImagenAtaque = new ImageIcon("/ImagenesJuegos/ATAQUE.png");
        ImagenMagia = new ImageIcon("ImagenesJuegos/MAGIA.png");
        ImagenMovimiento = new ImageIcon("/ImagenesJuegos/MOVIMIENTO.png");
        ImagenTrampa = new ImageIcon("/ImagenesJuegos/TRAMPA.png");
        ImagenInvocar = new ImageIcon("/ImagenesJuegos/INVOCAR.png");
    }
    
    public void actionPerformed(ActionEvent e){
        /*if(vb.getButtonAtras()==e.getSource()){
            vb.dispose();
            cvp.setVista(true);
<<<<<<< HEAD
        }
        else if(vb.getButtonLanzar()==e.getSource()){
            vb.setGifDados(new ImageIcon("C:\\Users\\FRANCO L\\Desktop\\Proyecto\\proyecto_metodos\\src\\ImagenesJuegos\\dados.gif"));
=======
        }*/
        /*else*/ if(vb.getButtonLanzar()==e.getSource()){
            vb.setGifDados(new ImageIcon(this.getClass().getResource("dados.gif")));
            System.out.println("Ok, funciona");
        }
        else if (vb.getButtonParar()==e.getSource()){
            vb.setGifDados(false);
            Dado dado1 = new Dado();
            String cara = dado1.resultado();
            vb.jLabel1.setIcon(new ImageIcon(getClass().getResource("/ImagenesJuego/"+cara+".png")));
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
    public void setTurno(){
        if (this.turnoActual<cantidadDeJugadores){
            this.turnoActual++;
        }
        else{
            this.turnoActual = 1;
        }
    }
}
