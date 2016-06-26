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
    private ControladorDadoDesplegado cdd;
    private int ultimaSeleccion = 0;
    private int[][] forma;
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
        this.turnoActual = 0;
        this.cbg = cbg;
        this.vb = new VistaBatalla();
        this.b = new Batalla();
        b.getJugadores().add("franco");
        b.getJugadores().add("juanfra");
        b.getJugadores().add("moises");
        b.getJugadores().add("pinky");
        b.setOrdenJugadores();
        vb.setJugadorActual(b.getOrdenJugadores().get(0));
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
            cdd = new ControladorDadoDesplegado(this);
        }
        else if(vb.getButtonCambioTurno()==e.getSource()){
            setTurno();
            vb.setJugadorActual(b.getOrdenJugadores().get(turnoActual));
            System.out.println(b.getOrdenJugadores().get(turnoActual));
        }
        else if (vb.getButtonAtacar()==e.getSource()){
            this.ultimaSeleccion=1;
        }
        else if(vb.getButtonInvocar()==e.getSource()){
            this.ultimaSeleccion=3;
        }
        else if(vb.getButtonMagia()==e.getSource()){
            this.ultimaSeleccion=4;
        }
        else if(vb.getButtonTrampa()==e.getSource()){
            this.ultimaSeleccion=5;
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
        if (this.ultimaSeleccion==6){
            for(int i = 0 ; i<15; i++){
                for(int j = 0 ; j<15 ; j++){
                    if(vb.getBoardVisible()[i][j]==e.getSource()){
                        vb.vistaPreviaEntrando(i,j,forma);
                        System.out.println("Entrando a"+i+","+j);
                        /*try{
                            vb.vistaPreviaEntrando(i,j,forma);
                            System.out.println("Entrando a"+i+","+j);
                        }
                        catch(ArrayIndexOutOfBoundsException excepcion){
                            vb.vistaPreviaEntrandoErrona(i, j, forma);
                        }*/
                    }
                }
            }
        }
    }
    
    public void mouseReleased(MouseEvent e){
        
    }
    public void mouseClicked(MouseEvent e){
        if (this.ultimaSeleccion==6){
            for(int i = 0 ; i<15; i++){
                for(int j = 0 ; j<15 ; j++){
                    if(vb.getBoardVisible()[i][j]==e.getSource()){
                        tablero.setDueño(i,j,forma,vb.getJugadorActual());
                        this.ultimaSeleccion=0;
                        System.out.println("Click en"+i+","+j);
                    }
                }
            }
        }
        else if(this.ultimaSeleccion==3){
            for(int i = 0 ; i<15; i++){
                for(int j = 0 ; j<15 ; j++){
                    if(vb.getBoardVisible()[i][j]==e.getSource()){
                        System.out.println(tablero.getDueño(i,j));
                    }
                }
            }
        }
    }
    
    public void mousePressed(MouseEvent e){
        
    }
    public void mouseExited(MouseEvent e){
        if (this.ultimaSeleccion==6){
            for(int i = 0 ; i<15; i++){
                for(int j = 0 ; j<15 ; j++){
                    if(vb.getBoardVisible()[i][j]==e.getSource()){
                        vb.vistaPreviaSaliendo(i,j,forma);
                        System.out.println("Saliendo de"+i+","+j);
                        /*try{
                            vb.vistaPreviaSaliendo(i,j,forma);
                            System.out.println("Saliendo de"+i+","+j);
                        }
                        catch(ArrayIndexOutOfBoundsException excepcion){
                            vb.vistaPreviaSaliendoErronea(i, j, forma);
                        }*/
                    }
                }
            }
        }
    }
    public void setTurno(){
        if (this.turnoActual<b.getJugadores().size()-1){
            this.turnoActual++;
        }
        else {
            b.getOrdenJugadores().clear();
            b.setOrdenJugadores();
            this.turnoActual = 0;
            System.out.println("Nueva ronda");
        }
    }
    public void setForma(int[][] forma){
        this.forma=forma;
        System.out.println("asd");
    }
    public void setUltimoBoton(int i ){
        this.ultimaSeleccion=i;
    }
}
