package Controlador;
//Importacion de clases
import Modelo.Batalla;
import Modelo.Dado;
import Modelo.JefeDeTerreno;
import Modelo.Casilla;
import Modelo.Criatura;
import Modelo.Tablero;
import Modelo.Jugador;
import Vista.VistaBatalla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
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
    private Dado dado1;
    
    //Definicion constructor
    public ControladorBatalla(ControladorBatallaConfiguracion cbg){
        tablero = new Tablero();
        this.turnoActual = 0;
        this.cbg = cbg;
        this.vb = new VistaBatalla();
        this.b = new Batalla();
        ArrayList<String> j = this.cbg.getJugadores();
        b.setBatalla(j);
        b.setOrdenJugadores();
        tablero.setJefesDeTerreno(j,b.getJefesDeTerreno());
        vb.setJugadorActual(b.getOrdenJugadores().get(0).getNombre());
        vb.setVisible(true);
        vb.agregarListener(this,this);
        vb.setLocationRelativeTo(null);
        vb.setJefesDeTerreno(j,b.getJefesNombres());
        vb.pintarTurno(j);
    }
    
    public void actionPerformed(ActionEvent e){
        if(vb.getButtonAtras()==e.getSource()){
            vb.dispose();
        }
        else if (vb.getButtonLanzar()==e.getSource()){
            System.out.println("Se ha lanzado el dado");
            vb.getGifDados().setVisible(false);
            this.dado1 = new Dado(new Criatura("C", vb.getJugadorActual(), 100, 10, 10, 0));
            String cara = dado1.resultado();
            vb.jLabel1.setIcon(new ImageIcon(getClass().getResource("/ImagenesJuego/"+cara+".png")));
            vb.getjLabel3().setText(cara);
            if(cara=="ATAQUE"){
                vb.setPtosAtk(1);
            }
            else if(cara=="MAGIA"){
                vb.setPtosMag(1);
            }
            else if(cara=="MOVIMIENTO"){
                vb.setPtosMov(1);
            }
            else if (cara=="TRAMPA"){
                vb.setPtosTrap(1);
            }
            else if(cara=="INVOCAR"){
                vb.setPtosInvocar(1);
            }
        }
        
        else if (vb.getButtonInvocar()==e.getSource()){
            if(vb.getPtosInvocar()!=0){
                this.cdd = new ControladorDadoDesplegado(this);
            }
            else{
                vb.sinPuntos();
            }
        }
        else if(vb.getButtonCambioTurno()==e.getSource()){
            b.getOrdenJugadores().get(turnoActual).setAtaque(vb.getPtosAtk());
            b.getOrdenJugadores().get(turnoActual).setTrampa(vb.getPtosTrap());
            b.getOrdenJugadores().get(turnoActual).setMagia(vb.getPtosMag());
            b.getOrdenJugadores().get(turnoActual).setMover(vb.getPtosMov());
            b.getOrdenJugadores().get(turnoActual).setInvocacion(vb.getPtosInvocar());
            setTurno();
            vb.setJugadorActual(b.getOrdenJugadores().get(turnoActual).getNombre());
            System.out.println("Turno de "+b.getOrdenJugadores().get(turnoActual));
            vb.pintarTurno(cbg.getJugadores());
            vb.getButtonInvocar().setEnabled(true);
            vb.setPtosAtkInic(b.getOrdenJugadores().get(turnoActual).getAtaque());
            vb.setPtosTrapInic(b.getOrdenJugadores().get(turnoActual).getTrampa());
            vb.setPtosMagInic(b.getOrdenJugadores().get(turnoActual).getMagia());
            vb.setPtosMovInic(b.getOrdenJugadores().get(turnoActual).getMover());
            vb.setPtosInvocarInic(b.getOrdenJugadores().get(turnoActual).getInvocacion());
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
            if(vb.getPtosMov()!=0){
                this.ultimaSeleccion=2;
            }
            else{
                vb.sinPuntos();
            }
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
        for(int i = 0 ; i<15; i++){
            for(int j = 0 ; j<15 ; j++){
                if(vb.getBoardVisible()[i][j]==e.getSource()){
                    if(tablero.getBoardModelo()[i][j].isCriatura()){
                        vb.setDueñoCriatura(tablero.getBoardModelo()[i][j].getCriatura().getDueño());
                        vb.setHpActualCriatura(tablero.getBoardModelo()[i][j].getCriatura().getHPActual());
                        vb.setHpTotalCriatura(tablero.getBoardModelo()[i][j].getCriatura().getHPTotal());
                        vb.setDañoCriatura(tablero.getBoardModelo()[i][j].getCriatura().getAtk());
                        vb.setDefensaCriatura(tablero.getBoardModelo()[i][j].getCriatura().getDef());
                        vb.setNombreCriatura(tablero.getBoardModelo()[i][j].getCriatura().getNombre());
                    }
                }
            }
        }
        if (this.ultimaSeleccion==6){
            for(int i = 0 ; i<15; i++){
                for(int j = 0 ; j<15 ; j++){
                    if(vb.getBoardVisible()[i][j]==e.getSource()){
                        try{
                            if(tablero.comprobar(i,j,forma,vb.getJugadorActual())){
                            tablero.setDueño(i,j,forma,vb.getJugadorActual());
                            vb.vistaPreviaSaliendo(i,j,forma);
                            vb.pintar(i,j,forma, cbg.getJugadores());
                            vb.setCriatura(i,j, "C");
                            tablero.getBoardModelo()[i][j].setCriatura(this.dado1.getCriatura());
                            this.ultimaSeleccion=0;
                            vb.getButtonInvocar().setEnabled(false);
                            vb.setPtosInvocar(-1);
                            }
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
                                if(!tablero.getBoardModelo()[i][j].isJefe()){
                                    System.out.println("funciono!!!");
                                    this.ultimaSeleccion=7;
                                    x=i;
                                    y=j;
                                }
                                else{
                                    vb.errorJefe();
                                }
                                /*else{
                                    vb.sinCriatura();
                                }*/
                        }
                    }
                }
        }
        else if(this.ultimaSeleccion==7){
            try{
                if(vb.getBoardVisible()[x+1][y]==e.getSource()){
                    if(tablero.getBoardModelo()[x+1][y].getJefeDeTerreno()==null){
                        System.out.println(tablero.getBoardModelo()[x+1][y].getJefeDeTerreno());
                        if(!tablero.getBoardModelo()[x+1][y].getDueño().equals("")){
                            vb.getBoardVisible()[x+1][y].setText(vb.getBoardVisible()[x][y].getText());
                            vb.getBoardVisible()[x][y].setText(null);
                            vb.setPtosMov(-1);
                            tablero.getBoardModelo()[x+1][y].setCriatura(tablero.getBoardModelo()[x][y].getCriatura());
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
                    else if(vb.getBoardVisible()[x-1][y]==e.getSource()){
                        if(tablero.getBoardModelo()[x-1][y].getCriatura()==null && tablero.getBoardModelo()[x-1][y].getJefeDeTerreno()==null){
                            if(!tablero.getBoardModelo()[x-1][y].getDueño().equals("")){
                                vb.getBoardVisible()[x-1][y].setText(vb.getBoardVisible()[x][y].getText());
                                System.out.println(vb.getBoardVisible()[x][y].getText());
                                vb.getBoardVisible()[x][y].setText(null);
                                vb.setPtosMov(-1);
                                tablero.getBoardModelo()[x-1][y].setCriatura(tablero.getBoardModelo()[x][y].getCriatura());
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
                    else if(vb.getBoardVisible()[x][y+1]==e.getSource()){
                        if(tablero.getBoardModelo()[x+1][y].getCriatura()==null||tablero.getBoardModelo()[x+1][y].getJefeDeTerreno()==null){
                            if(!tablero.getBoardModelo()[x][y+1].getDueño().equals("")){
                                vb.getBoardVisible()[x][y+1].setText(vb.getBoardVisible()[x][y].getText());
                                vb.getBoardVisible()[x][y].setText(null);
                                vb.setPtosMov(-1);
                                tablero.getBoardModelo()[x][y+1].setCriatura(tablero.getBoardModelo()[x][y].getCriatura());
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
                    else if(vb.getBoardVisible()[x][y-1]==e.getSource()){
                        if(tablero.getBoardModelo()[x+1][y].getCriatura()==null||tablero.getBoardModelo()[x+1][y].getJefeDeTerreno()==null){
                            if(!tablero.getBoardModelo()[x][y-1].getDueño().equals("")){
                                vb.getBoardVisible()[x][y-1].setText(vb.getBoardVisible()[x][y].getText());
                                vb.getBoardVisible()[x][y].setText(null);
                                vb.setPtosMov(-1);
                                tablero.getBoardModelo()[x][y-1].setCriatura(tablero.getBoardModelo()[x][y].getCriatura());
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
                    else{
                        vb.movimientoInvalido();
                    }
                }
            catch(ArrayIndexOutOfBoundsException ae){
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
