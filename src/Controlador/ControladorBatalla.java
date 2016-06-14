package Controlador;
//Importacion de clases
import Modelo.Batalla;
import Modelo.Dado;
import Modelo.JefeDeTerreno;
import Modelo.Casilla;
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
    private int cantidadDeJugadores;
    private int turnoActual;
    private ImageIcon ImagenAtaque;
    private ImageIcon ImagenMagia ;
    private ImageIcon ImagenMovimiento;
    private ImageIcon ImagenTrampa;
    private ImageIcon ImagenInvocar;
    private Tablero terreno = new Tablero();
    Dado dado;
    
    //Definicion constructor
    public ControladorBatalla(/*int cantidadDeJugadores,*/ ControladorBatallaConfiguracion cbg){
        this.cantidadDeJugadores = cantidadDeJugadores;
        this.turnoActual = 1;
        //this.cvp = cvp;
        this.cbg = cbg;
        this.vb = new VistaBatalla(terreno);
        this.b = new Batalla(this.cantidadDeJugadores);
        vb.setVisible(true);
        vb.agregarListener(this,this);
        vb.setLocationRelativeTo(null);
        
       
        //Hay error al cargar las imagenes del dado a la pantalla. Funcoionaba, pero
        //al querer cambiarlas rutas por algo generico dejo de funcionar.
        ImagenAtaque = new ImageIcon("/ImagenesJuegos/ATAQUE.png");
        ImagenMagia = new ImageIcon("ImagenesJuegos/MAGIA.png");
        ImagenMovimiento = new ImageIcon("/ImagenesJuegos/MOVIMIENTO.png");
        ImagenTrampa = new ImageIcon("/ImagenesJuegos/TRAMPA.png");
        ImagenInvocar = new ImageIcon("/ImagenesJuegos/INVOCAR.png");
    }
    
    public void actionPerformed(ActionEvent e){
        if(vb.getButtonAtras()==e.getSource()){
            vb.dispose();
            //cvp.setVista(true);
        }
        else if(vb.getButtonLanzar()==e.getSource()){
            vb.setGifDados(new ImageIcon("\\ImagenesJuegos\\dados.gif"));
            System.out.println("Ok, funciona");
        }
        else if (vb.getButtonParar()==e.getSource()){
           /* vb.setGifDados(false);
            Dado Dado1 = new Dado(ImagenAtaque,ImagenMagia,ImagenMovimiento,ImagenTrampa,ImagenInvocar,ImagenAtaque);
            vb.setResultadoDado1(Dado1.resultado());
            Dado Dado2 = new Dado(ImagenAtaque,ImagenMagia,ImagenMovimiento,ImagenTrampa,ImagenInvocar,ImagenAtaque);
            vb.setResultadoDado2(Dado2.resultado());
            Dado Dado3 = new Dado(ImagenAtaque,ImagenMagia,ImagenMovimiento,ImagenTrampa,ImagenInvocar,ImagenAtaque);
            vb.setResultadoDado3(Dado3.resultado());
            Dado Dado4 = new Dado(ImagenAtaque,ImagenMagia,ImagenMovimiento,ImagenTrampa,ImagenInvocar,ImagenAtaque);
            vb.setResultadoDado4(Dado4.resultado());*/
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
                    if(terreno.board[i][j]==e.getSource()){
                        dado = new Dado();
                        System.out.println("X="+i+", Y="+j);
                        terreno.pintar(i,j,dado.getForma1());
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
    public void click(int i,int j){
        
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
