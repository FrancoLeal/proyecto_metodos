package Controlador;
//Importacion de clases
import Modelo.Batalla;
import Modelo.Dado;
import Modelo.Criatura;
import Modelo.Tablero;
import Modelo.Jugador;
import Modelo.PuzzleDeDados;
import Vista.VistaBatalla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
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
    private Jugador jugadorActual;
    
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
        this.jugadorActual=b.getOrdenJugadores().get(turnoActual);
    }
    
    public void actionPerformed(ActionEvent e){
        if(vb.getButtonAtras()==e.getSource()){
            vb.dispose();
        }
        else if (vb.getButtonLanzar()==e.getSource()){
            PuzzleDeDados puzzle = jugadorActual.getPuzzle();
            Random r = new Random();
            if(!vb.getNumeroDeDados().getText().equals("")){
                ArrayList<Dado> dados = b.generarDados(puzzle,Integer.parseInt(vb.getNumeroDeDados().getText()));
                if(dados.size()==1){
                    String i1 = dados.get(0).resultado();
                    vb.setPuntos(i1);
                    ImageIcon icon1 = new ImageIcon(getClass().getResource("/ImagenesJuego/"+i1+".png"));
                    vb.setDados(icon1);
                }
                else if(dados.size()==2){
                    String i1 = dados.get(r.nextInt(1)).resultado();
                    vb.setPuntos(i1);
                    String i2 = dados.get(r.nextInt(1)).resultado();
                    vb.setPuntos(i2);
                    ImageIcon icon1 = new ImageIcon(getClass().getResource("/ImagenesJuego/"+i1+".png"));
                    ImageIcon icon2 = new ImageIcon(getClass().getResource("/ImagenesJuego/"+i2+".png"));
                    vb.setDados(icon1, icon2);
                }
                else if(dados.size()==3){
                    String i1 = dados.get(r.nextInt(2)).resultado();
                    vb.setPuntos(i1);
                    String i2 = dados.get(r.nextInt(2)).resultado();
                    vb.setPuntos(i2);
                    String i3 = dados.get(r.nextInt(2)).resultado();
                    vb.setPuntos(i3);
                    ImageIcon icon1 = new ImageIcon(getClass().getResource("/ImagenesJuego/"+i1+".png"));
                    ImageIcon icon2 = new ImageIcon(getClass().getResource("/ImagenesJuego/"+i2+".png"));
                    ImageIcon icon3 = new ImageIcon(getClass().getResource("/ImagenesJuego/"+i3+".png"));
                    vb.setDados(icon1, icon2,icon3);
                }
                else if(dados.size()==4){
                    String i1 = dados.get(r.nextInt(3)).resultado();
                    vb.setPuntos(i1);
                    String i2 = dados.get(r.nextInt(3)).resultado();
                    vb.setPuntos(i2);
                    String i3 = dados.get(r.nextInt(3)).resultado();
                    vb.setPuntos(i3);
                    String i4 = dados.get(r.nextInt(3)).resultado();
                    vb.setPuntos(i4);
                    ImageIcon icon1 = new ImageIcon(getClass().getResource("/ImagenesJuego/"+i1+".png"));
                    ImageIcon icon2 = new ImageIcon(getClass().getResource("/ImagenesJuego/"+i2+".png"));
                    ImageIcon icon3 = new ImageIcon(getClass().getResource("/ImagenesJuego/"+i3+".png"));
                    ImageIcon icon4 = new ImageIcon(getClass().getResource("/ImagenesJuego/"+i4+".png"));
                    vb.setDados(icon1, icon2,icon3, icon4);
                }
            }
            else{
                vb.ingresarCantidadDados();
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
            jugadorActual.setAtaque(vb.getPtosAtk());
            jugadorActual.setTrampa(vb.getPtosTrap());
            jugadorActual.setMagia(vb.getPtosMag());
            jugadorActual.setMover(vb.getPtosMov());
            jugadorActual.setInvocacion(vb.getPtosInvocar());
            setTurno();
            this.jugadorActual=b.getOrdenJugadores().get(turnoActual);
            vb.setJugadorActual(jugadorActual.getNombre());
            System.out.println("Turno de "+jugadorActual);
            vb.pintarTurno(cbg.getJugadores());
            vb.getButtonInvocar().setEnabled(true);
            vb.setPtosAtkInic(jugadorActual.getAtaque());
            vb.setPtosTrapInic(jugadorActual.getTrampa());
            vb.setPtosMagInic(jugadorActual.getMagia());
            vb.setPtosMovInic(jugadorActual.getMover());
            vb.setPtosInvocarInic(jugadorActual.getInvocacion());
        }
        else if (vb.getButtonAtacar()==e.getSource()){
            if(vb.getPtosAtk()!=0){
                this.ultimaSeleccion=1;
            }
            else{
                vb.sinPuntos();
            }
        }
        else if(vb.getButtonMagia()==e.getSource()){
            if(vb.getPtosInvocar()!=0){
                this.ultimaSeleccion=4;
            }
            else{
                vb.sinPuntos();
            }
        }
        else if(vb.getButtonTrampa()==e.getSource()){
            if(vb.getPtosTrap()!=0){
                this.ultimaSeleccion=5;
            }
            else{
                vb.sinPuntos();
            }
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
        if (this.ultimaSeleccion==3){
            for(int i = 0 ; i<15; i++){
                for(int j = 0 ; j<15 ; j++){
                    if(vb.getBoardVisible()[i][j]==e.getSource()){
                        try{
                            vb.vistaPreviaEntrando(i,j,forma);
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
        if (this.ultimaSeleccion==3){
            for(int i = 0 ; i<15; i++){
                for(int j = 0 ; j<15 ; j++){
                    if(vb.getBoardVisible()[i][j]==e.getSource()){
                        try{
                            if(tablero.comprobar(i,j,forma,vb.getJugadorActual())){
                                tablero.setDueño(i,j,forma,vb.getJugadorActual());
                                vb.vistaPreviaSaliendo(i,j,forma);
                                vb.pintar(i,j,forma, cbg.getJugadores());
                                vb.setCriatura(i,j, "C");
                                Criatura c = jugadorActual.getPuzzle().getDados().get(0).getCriatura();
                                c.setDueño(jugadorActual.getNombre());
                                tablero.getBoardModelo()[i][j].setCriatura(c);
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
                            if(tablero.getBoardModelo()[i][j].isCriatura()){
                                this.ultimaSeleccion=7;
                                x=i;
                                y=j;
                            }
                            else{
                                vb.sinCriatura();
                            }
                        }
                        else{
                            vb.errorJefe();
                        }
                    }
                }
            }
        }
        else if(this.ultimaSeleccion==7){
            try{
                if(vb.getBoardVisible()[x+1][y]==e.getSource()){
                    if(tablero.getBoardModelo()[x+1][y].getJefeDeTerreno()==null){
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
        else if(this.ultimaSeleccion==1){
            for(int i = 0 ; i<15; i++){
                for(int j = 0 ; j<15 ; j++){
                    if(vb.getBoardVisible()[i][j]==e.getSource()){
                        if(tablero.getBoardModelo()[i][j].isCriatura()){
                            this.ultimaSeleccion=8;
                            System.out.println(this.ultimaSeleccion);
                            x=i;
                            y=j;
                        }
                    }
                }
            }
        }
        else if(this.ultimaSeleccion==8){
            try{
                if(vb.getBoardVisible()[x+1][y]==e.getSource()/*&&tablero.getBoardModelo()[x+1][y].getJefeDeTerreno().getDueño()==vb.getJugadorActual()*/){
                    System.out.println("Atacando");
                    if(tablero.getBoardModelo()[x+1][y].isJefe()){
                        int daño = tablero.getBoardModelo()[x][y].getCriatura().getAtk();
                        tablero.getBoardModelo()[x+1][y].getJefeDeTerreno().setVida(daño);
                        //this.ultimaSeleccion=0;
                    }
                    else if(tablero.getBoardModelo()[x+1][y].isCriatura()){
                        System.out.println("si1");
                        int daño = tablero.getBoardModelo()[x][y].getCriatura().getAtk();
                        tablero.getBoardModelo()[x+1][y].getCriatura().recibirDaño(daño);
                        //this.ultimaSeleccion=0;
                    }
                    else{
                        vb.ataqueInvalido();
                    }
                }
                else if(vb.getBoardVisible()[x-1][y]==e.getSource()){
                    System.out.println("Atacando");
                    if(tablero.getBoardModelo()[x-1][y].isJefe()/*&&tablero.getBoardModelo()[x-1][y].getJefeDeTerreno().getDueño()==vb.getJugadorActual()*/){
                        int daño = tablero.getBoardModelo()[x][y].getCriatura().getAtk();
                        tablero.getBoardModelo()[x-11][y].getJefeDeTerreno().setVida(daño);
                        //this.ultimaSeleccion=0;
                    }
                    else if(tablero.getBoardModelo()[x-1][y].isCriatura()){
                        System.out.println("si2");
                        int daño = tablero.getBoardModelo()[x][y].getCriatura().getAtk();
                        tablero.getBoardModelo()[x-1][y].getCriatura().recibirDaño(daño);
                        //this.ultimaSeleccion=0;
                    }
                    else{
                        vb.ataqueInvalido();
                    }
                }
                else if(vb.getBoardVisible()[x][y+1]==e.getSource()){
                    System.out.println("Atacando");
                    if(tablero.getBoardModelo()[x][y+1].isJefe()/*&&tablero.getBoardModelo()[x][y+1].getJefeDeTerreno().getDueño()==vb.getJugadorActual()*/){
                        int daño = tablero.getBoardModelo()[x][y].getCriatura().getAtk();
                        tablero.getBoardModelo()[x][y+1].getJefeDeTerreno().setVida(daño);
                        //this.ultimaSeleccion=0;
                    }
                    else if(tablero.getBoardModelo()[x][y+1].isCriatura()){
                        System.out.println("si3");
                        int daño = tablero.getBoardModelo()[x][y].getCriatura().getAtk();
                        tablero.getBoardModelo()[x][y+1].getCriatura().recibirDaño(daño);
                        //this.ultimaSeleccion=0;
                    }
                    else{
                        vb.ataqueInvalido();
                    }
                }
                else if(vb.getBoardVisible()[x][y-1]==e.getSource()){
                    System.out.println("Atacando");
                     if(tablero.getBoardModelo()[x][y-1].isJefe()/*&&tablero.getBoardModelo()[x][y-1].getJefeDeTerreno().getDueño()==vb.getJugadorActual()*/){
                        int daño = tablero.getBoardModelo()[x][y].getCriatura().getAtk();
                        tablero.getBoardModelo()[x][y-1].getJefeDeTerreno().setVida(daño);
                        //this.ultimaSeleccion=0;
                    }
                    else if(tablero.getBoardModelo()[x][y-1].isCriatura()){
                        System.out.println("si4");
                        int daño = tablero.getBoardModelo()[x][y].getCriatura().getAtk();
                        tablero.getBoardModelo()[x][y-1].getCriatura().recibirDaño(daño);
                        //this.ultimaSeleccion=0;
                    }
                    else{
                        vb.ataqueInvalido();
                    }
                }
            }
            catch(ArrayIndexOutOfBoundsException ae){
            }
        }
    }
    
    public void mousePressed(MouseEvent e){
        
    }
    public void mouseExited(MouseEvent e){
        if (this.ultimaSeleccion==3){
            for(int i = 0 ; i<15; i++){
                for(int j = 0 ; j<15 ; j++){
                    if(vb.getBoardVisible()[i][j]==e.getSource()){
                        try{
                            vb.vistaPreviaSaliendo(i,j,forma);
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
