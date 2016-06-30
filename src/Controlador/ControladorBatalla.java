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
    private int validarMov;
    private Tablero tablero;
    private ImageIcon ImagenAtaque;
    private ImageIcon ImagenMagia ;
    private ImageIcon ImagenMovimiento;
    private ImageIcon ImagenTrampa;
    private ImageIcon ImagenInvocar;
    private ImageIcon GifDados;
    private Dado dado;
    
    //Definicion constructor
    public ControladorBatalla(ControladorBatallaConfiguracion cbg){
        tablero = new Tablero();
        this.turnoActual = 0;
        this.cbg = cbg;
        this.vb = new VistaBatalla();
        this.b = new Batalla();
        if (cbg.getBatallaTipo()){
            b.getJugadores().add("franco");
            b.getJugadores().add("juanfra");
            b.getJugadores().add("moises");
            b.getJugadores().add("pinky");
        }
        else{
            b.getJugadores().add("franco");
            b.getJugadores().add("juanfra");
            b.getJugadores().add("moises");
            b.getJugadores().add("pinky");
        }
        b.setBatalla();
        b.setOrdenJugadores();
        vb.setJugadorActual(b.getOrdenJugadores().get(0));
        vb.setVisible(true);
        vb.agregarListener(this,this);
        vb.setLocationRelativeTo(null);
        vb.setJefesDeTerreno(b.getJugadores(),b.getJefes());
        vb.pintarTurno(b.getJugadores());
        vb.setPtosInvocar(1);
        vb.setPtosMov(1);
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
            vb.getjLabel3().setText(cara);
            if(cara=="ATAQUE"){
                
            }
            else if(cara=="MAGIA"){
                
            }
            else if(cara=="MOVIMIENTO"){
                
            }
            else if (cara=="TRAMPA"){
                
            }
            else if(cara=="INVOCAR"){
                
            }
            }
        
        else if (vb.getButtonDesplegar()==e.getSource()){
            if(vb.getPtosInvocar()!=0){
                this.cdd = new ControladorDadoDesplegado(this);
            }
            else{
                vb.sinPuntos();
            }
        }
        else if(vb.getButtonCambioTurno()==e.getSource()){
            setTurno();
            vb.setJugadorActual(b.getOrdenJugadores().get(turnoActual));
            System.out.println("Turno de "+b.getOrdenJugadores().get(turnoActual));
            vb.pintarTurno(b.getJugadores());
            vb.getButtonDesplegar().setEnabled(true);
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
        else if (vb.getButtonMover()==e.getSource()){
            this.ultimaSeleccion=2;
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
                        try{
                            vb.vistaPreviaEntrando(i,j,forma);
                            System.out.println("Entrando a"+i+","+j);
                        }
                        catch(ArrayIndexOutOfBoundsException excepcion){
                            System.out.println("No se puede desplegar aca");
                        }
                    }
                }
            }
        }
    }
    
    public void mouseReleased(MouseEvent e){
        
    }
    int x = 0;
    int y = 0;
    public void mouseClicked(MouseEvent e){
        if (this.ultimaSeleccion==6){
            for(int i = 0 ; i<15; i++){
                for(int j = 0 ; j<15 ; j++){
                    if(vb.getBoardVisible()[i][j]==e.getSource()){
                        try{
                            tablero.setDueño(i,j,forma,vb.getJugadorActual());
                            vb.vistaPreviaSaliendo(i,j,forma);
                            vb.pintar(i,j,forma, b.getJugadores());
                            vb.setCriatura(i,j, "C");
                            this.ultimaSeleccion=0;
                            vb.getButtonDesplegar().setEnabled(false);
                            vb.setPtosInvocar(-1);
                        }
                        catch(ArrayIndexOutOfBoundsException ae){
                            vb.errorIndex();
                        }
                    }
                }
            }
        }
        else if(this.ultimaSeleccion==2){
                for(int i = 0 ; i<15; i++){
                    for(int j = 0 ; j<15 ; j++){
                        if(vb.getBoardVisible()[i][j]==e.getSource()){
                            if(!vb.getBoardVisible()[i][j].getText().isEmpty()){
                                this.ultimaSeleccion=7;
                                x=i;
                                y=j;
                                System.out.println(x+","+y);
                            }
                            else{
                                vb.sinCriatura();
                            }
                        }
                    }
                }
        }
        else if(this.ultimaSeleccion==7){
            if(vb.getBoardVisible()[x+1][y]==e.getSource()){
                if(!tablero.getBoardModelo()[x+1][y].getDueño().equals("")){
                    vb.getBoardVisible()[x+1][y].setText(vb.getBoardVisible()[x][y].getText());
                    vb.getBoardVisible()[x][y].setText(null);
                    vb.setPtosMov(-1);
                    this.ultimaSeleccion=0;
                }
                else{
                    vb.movimientoInvalido();
                    }
                }
                else if(vb.getBoardVisible()[x-1][y]==e.getSource()){
                    if(!tablero.getBoardModelo()[x-1][y].getDueño().equals("")){
                        vb.getBoardVisible()[x-1][y].setText(vb.getBoardVisible()[x][y].getText());
                        System.out.println(vb.getBoardVisible()[x][y].getText());
                        vb.getBoardVisible()[x][y].setText(null);
                        vb.setPtosMov(-1);
                        this.ultimaSeleccion=0;
                    }
                    else{
                        vb.movimientoInvalido();
                    }
                }
                else if(vb.getBoardVisible()[x][y+1]==e.getSource()){
                    if(!tablero.getBoardModelo()[x][y+1].getDueño().equals("")){
                    vb.getBoardVisible()[x][y+1].setText(vb.getBoardVisible()[x][y].getText());
                    vb.getBoardVisible()[x][y].setText(null);
                    vb.setPtosMov(-1);
                    this.ultimaSeleccion=0;
                    }
                    else{
                        vb.movimientoInvalido();
                    }
                }
                else if(vb.getBoardVisible()[x][y-1]==e.getSource()){
                    if(!tablero.getBoardModelo()[x][y-1].getDueño().equals("")){
                        vb.getBoardVisible()[x][y-1].setText(vb.getBoardVisible()[x][y].getText());
                        vb.getBoardVisible()[x][y].setText(null);
                        vb.setPtosMov(-1);
                        this.ultimaSeleccion=0;
                    }
                    else{
                        vb.movimientoInvalido();
                    }
                }
                else{
                    vb.movimientoInvalido();
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
                        try{
                            vb.vistaPreviaSaliendo(i,j,forma);
                            System.out.println("Saliendo de"+i+","+j);
                        }
                        catch(ArrayIndexOutOfBoundsException excepcion){
                            System.out.println("No se puede desplegar aca");
                        }
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
