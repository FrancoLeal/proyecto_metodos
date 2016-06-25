package Controlador;
//Importacion de clases
import Modelo.Batalla;
import Modelo.Dado;
import Modelo.JefeDeTerreno;
import Modelo.Casilla;
import Modelo.Tablero;
import Modelo.Jugador;
import Vista.VistaBatalla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
//Definicion clase
public class ControladorBatalla extends MouseAdapter implements ActionListener {
    //Definicion atributos
    private VistaBatalla vb;
    private Batalla b;
    private ControladorBatallaConfiguracion cbg;
    private int turnoActual;
    private Tablero tablero;
    private ImageIcon ImagenAtaque;
    private ImageIcon ImagenMagia ;
    private ImageIcon ImagenMovimiento;
    private ImageIcon ImagenTrampa;
    private ImageIcon ImagenInvocar;
    private ImageIcon GifDados;
    Dado dado;
    
    //Definicion constructor
    public ControladorBatalla(ControladorBatallaConfiguracion cbg){
        tablero = new Tablero();
        this.turnoActual = 1;
        this.cbg = cbg;
        this.vb = new VistaBatalla();
        this.b = new Batalla();
        b.getJugadores().add("franco");
        b.getJugadores().add("juanfra");
        b.getJugadores().add("moises");
        b.getJugadores().add("pinky");
        vb.setVisible(true);
        vb.agregarListener(this,this);
        vb.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        if(vb.getButtonAtras()==e.getSource()){
            vb.dispose();
            
        }
        else if(vb.getButtonLanzar()==e.getSource()){
            vb.setGifDados(true);
            vb.GifDados.setIcon(new ImageIcon(getClass().getResource("/ImagenesJuego/dados.gif"))); 
            System.out.println("Se ha lanzado el dado");
            
        }
        else if (vb.getButtonParar()==e.getSource()){
            vb.getButtonLanzar().setVisible(false);
            vb.getGifDados().setVisible(false);
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
                    if(vb.getBoardVisible()[i][j]==e.getSource()){
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
        if (this.turnoActual<b.getJugadores().size()){
            this.turnoActual++;
        }
        else{
            this.turnoActual = 1;
        }
    }
}
