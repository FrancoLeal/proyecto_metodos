package Controlador;
//Importacion de clases
import Modelo.Batalla;
import Modelo.Dado;
import Modelo.Tablero;
import Modelo.Jugador;
import Vista.VistaBatalla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
//Definicion clase
public class ControladorBatalla extends MouseAdapter implements ActionListener {
    //Definicion atributos
    private VistaBatalla vb;
    private Batalla b;
    private ControladorBatallaConfiguracion cbg;
    private int turnoActual;
    private ControladorDadoDesplegado cdd;
    private ControladorDadoLanzar cdl;
    private int ultimaSeleccion = 0;
    private int[][] forma;
    private Tablero tablero;
    private Jugador jugadorActual;
    private ArrayList<Dado> dados;
    
    //Definicion constructor
    public ControladorBatalla(ControladorBatallaConfiguracion cbg){
        tablero = new Tablero();
        this.turnoActual = 0;
        this.cbg = cbg;
        ArrayList<String> j = this.cbg.getJugadores();
        this.b = new Batalla();
        b.setBatalla(j);
        this.vb = new VistaBatalla();
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
        if (vb.getButtonLanzar()==e.getSource()){
            cdl = new ControladorDadoLanzar(this, jugadorActual);
        }
        
        else if (vb.getButtonInvocar()==e.getSource()){
//            if(vb.getPtosInvocar()!=0){
                this.cdd = new ControladorDadoDesplegado(this);
//            }
//            else{
//                vb.sinPuntos();
//            }
        }
        else if(vb.getButtonCambioTurno()==e.getSource()){
            jugadorActual.setAtaque(vb.getPtosAtk());
            jugadorActual.setTrampa(vb.getPtosTrap());
            jugadorActual.setMagia(vb.getPtosMag());
            jugadorActual.setMover(vb.getPtosMov());
            jugadorActual.setInvocacion(0);
            setTurno();
            this.jugadorActual=b.getOrdenJugadores().get(turnoActual);
            vb.setJugadorActual(jugadorActual.getNombre());
            System.out.println("Turno de "+jugadorActual);
            vb.pintarTurno(cbg.getJugadores());
            vb.getButtonInvocar().setEnabled(true);
            vb.getButtonLanzar().setEnabled(true);
            vb.setPtosAtkInic(jugadorActual.getAtaque());
            vb.setPtosTrapInic(jugadorActual.getTrampa());
            vb.setPtosMagInic(jugadorActual.getMagia());
            vb.setPtosMovInic(jugadorActual.getMover());
            vb.setPtosInvocarInic(0);
        }
        else if (vb.getButtonAtacar()==e.getSource()){
//            if(vb.getPtosAtk()!=0){
                this.ultimaSeleccion=1;
//            }
//            else{
//                vb.sinPuntos();
//            }
        }
        else if(vb.getButtonMagia()==e.getSource()){
//            if(vb.getPtosInvocar()!=0){
                this.ultimaSeleccion=4;
//            }
//            else{
//                vb.sinPuntos();
//            }
        }
        else if(vb.getButtonTrampa()==e.getSource()){
//            if(vb.getPtosTrap()!=0){
                this.ultimaSeleccion=5;
//            }
//            else{
//                vb.sinPuntos();
//            }
        }
        else if (vb.getButtonMover()==e.getSource()){
//            if(vb.getPtosMov()!=0){
                this.ultimaSeleccion=2;
//            }
//            else{
//                vb.sinPuntos();
//            }
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
                                tablero.getBoardModelo()[i][j].setCriatura(jugadorActual.getPuzzle().getDados().get(0).getCriatura());
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
                                if(tablero.getBoardModelo()[i][j].getCriatura().getDueño().equals(vb.getJugadorActual())){
                                    this.ultimaSeleccion=7;
                                    x=i;
                                    y=j;
                                }
                                else{
                                    vb.errorDueñoCriatura();
                                }
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
                    if(tablero.getBoardModelo()[x-1][y].getCriatura()==null&&tablero.getBoardModelo()[x+1][y].getJefeDeTerreno()==null){
                        if(!tablero.getBoardModelo()[x+1][y].getDueño().equals("")){
                            vb.getBoardVisible()[x+1][y].setText(vb.getBoardVisible()[x][y].getText());
                            vb.getBoardVisible()[x][y].setText(null);
                            vb.setPtosMov(-1);
                            tablero.getBoardModelo()[x+1][y].setCriatura(tablero.getBoardModelo()[x][y].getCriatura());
                            tablero.getBoardModelo()[x][y].setCriatura(null);
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
//                else{
//                    vb.movimientoInvalido();
//                }
            }
            catch(ArrayIndexOutOfBoundsException ae){
            }
            try{
                if(vb.getBoardVisible()[x-1][y]==e.getSource()){
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
//                else{
//                    vb.movimientoInvalido();
//                }
            }
            catch(ArrayIndexOutOfBoundsException ae){
            }
            try{
                if(vb.getBoardVisible()[x][y+1]==e.getSource()){
                    if(tablero.getBoardModelo()[x][y+1].getCriatura()==null&&tablero.getBoardModelo()[x][y+1].getJefeDeTerreno()==null){
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
//                else{
//                    vb.movimientoInvalido();
//                }
            }
            catch(ArrayIndexOutOfBoundsException ae){
            }
            try{
                if(vb.getBoardVisible()[x][y-1]==e.getSource()){
                    if(tablero.getBoardModelo()[x][y-1].getCriatura()==null&&tablero.getBoardModelo()[x][y-1].getJefeDeTerreno()==null){
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
//                else{
//                    vb.movimientoInvalido();
//                }
            }
            catch(ArrayIndexOutOfBoundsException ae){
            }
        }
        else if(this.ultimaSeleccion==1){
            for(int i = 0 ; i<15; i++){
                for(int j = 0 ; j<15 ; j++){
                    if(vb.getBoardVisible()[i][j]==e.getSource()){
                        if(tablero.getBoardModelo()[i][j].isCriatura()){
                            if(tablero.getBoardModelo()[i][j].getCriatura().getDueño().equals(vb.getJugadorActual())){
                                this.ultimaSeleccion=8;
                                x=i;
                                y=j;
                            }
                            else{
                                vb.errorDueñoCriatura();
                            }
                        }
                    }
                }
            }
        }
        else if(this.ultimaSeleccion==8){
            try{
                if(vb.getBoardVisible()[x+1][y]==e.getSource()){
                    System.out.println("Atacando en x+1, y");
                    if(tablero.getBoardModelo()[x+1][y].isJefe()){
                        System.out.println("Atacando jefe");
                        int daño = tablero.getBoardModelo()[x][y].getCriatura().getAtk();
                        tablero.getBoardModelo()[x+1][y].getJefeDeTerreno().setVida(daño);
                        System.out.println("Vida restante "+tablero.getBoardModelo()[x+1][y].getJefeDeTerreno().getVida());
                        if(tablero.getBoardModelo()[x+1][y].getJefeDeTerreno().getVida()<=0){
                            vb.perdedor(tablero.getBoardModelo()[x+1][y].getJefeDeTerreno().getDueño());
                            tablero.eliminarJugador(x+1,y,tablero.getBoardModelo()[x+1][y].getJefeDeTerreno().getDueño());
                            vb.getBoardVisible()[x+1][y].setText(null);
                            b.getOrdenJugadores().remove(jugadorActual);
                            b.getJugadores().remove(jugadorActual);
                        }
                        if(b.getJugadores().size()==1){
                                vb.ganador(b.getJugadores().get(0).getNombre());
                                vb.dispose();
                                this.cbg.setVista(true);
                        } 
                        for(int i=0;i<15;i++){
                            for(int j=0;j<15;j++){
                                if(tablero.getBoardModelo()[i][j].isEmpty()){
                                    vb.getBoardVisible()[i][j].setText(null);
                                }
                            }
                        }
                        this.ultimaSeleccion=0;
                    }
                    else if(tablero.getBoardModelo()[x+1][y].isCriatura()&&!tablero.getBoardModelo()[x+1][y].getCriatura().getDueño().equals(vb.getJugadorActual())){
                        int daño = tablero.getBoardModelo()[x][y].getCriatura().getAtk();
                        tablero.getBoardModelo()[x+1][y].getCriatura().recibirDaño(daño);
                        if(tablero.getBoardModelo()[x+1][y].getCriatura().getHPActual()<=0){
                            tablero.getBoardModelo()[x+1][y].setCriatura(null);
                            vb.getBoardVisible()[x+1][y].setText(null);
                        }
                        this.ultimaSeleccion=0;
                    }
                    else{
                        vb.ataqueInvalido();
                    }
                }
            }
            catch(ArrayIndexOutOfBoundsException ae){
            }
            try{
                if(vb.getBoardVisible()[x-1][y]==e.getSource()){
                    System.out.println("Atacando en x-1, y");
                    if(tablero.getBoardModelo()[x-1][y].isJefe()&&!tablero.getBoardModelo()[x-1][y].getJefeDeTerreno().getDueño().equals(vb.getJugadorActual())){
                        System.out.println("Atacando jefe");
                        int daño = tablero.getBoardModelo()[x][y].getCriatura().getAtk();
                        tablero.getBoardModelo()[x-1][y].getJefeDeTerreno().setVida(daño);
                        System.out.println("Vida restante "+tablero.getBoardModelo()[x-1][y].getJefeDeTerreno().getVida());
                        if(tablero.getBoardModelo()[x-1][y].getJefeDeTerreno().getVida()<=0){
                            vb.perdedor(tablero.getBoardModelo()[x-1][y].getJefeDeTerreno().getDueño());
                            tablero.eliminarJugador(x-1,y,tablero.getBoardModelo()[x-1][y].getJefeDeTerreno().getDueño());
                            vb.getBoardVisible()[x-1][y].setText(null);
                            b.getOrdenJugadores().remove(jugadorActual);
                            b.getJugadores().remove(jugadorActual);
                        }
                        if(b.getJugadores().size()==1){
                                vb.ganador(b.getJugadores().get(0).getNombre());
                                vb.dispose();
                                this.cbg.setVista(true);
                        }
                        for(int i=0;i<15;i++){
                            for(int j=0;j<15;j++){
                                if(tablero.getBoardModelo()[i][j].isEmpty()){
                                    vb.getBoardVisible()[i][j].setText(null);
                                }
                            }
                        }
                        this.ultimaSeleccion=0;
                    }
                    else if(tablero.getBoardModelo()[x-1][y].isCriatura()&&!tablero.getBoardModelo()[x-1][y].getCriatura().getDueño().equals(vb.getJugadorActual())){
                        int daño = tablero.getBoardModelo()[x][y].getCriatura().getAtk();
                        tablero.getBoardModelo()[x-1][y].getCriatura().recibirDaño(daño);
                        if(tablero.getBoardModelo()[x-1][y].getCriatura().getHPActual()<=0){
                            tablero.getBoardModelo()[x-1][y].setCriatura(null);
                            vb.getBoardVisible()[x-1][y].setText(null);
                        }
                        this.ultimaSeleccion=0;
                    }
                    else{
                        vb.ataqueInvalido();
                    }
                }
            }
            catch(ArrayIndexOutOfBoundsException ae){
            }
            try{
                if(vb.getBoardVisible()[x][y+1]==e.getSource()){
                    System.out.println("Atacando en x, y+1");
                    if(tablero.getBoardModelo()[x][y+1].isJefe()&&!tablero.getBoardModelo()[x][y+1].getJefeDeTerreno().getDueño().equals(vb.getJugadorActual())){
                        System.out.println("Atacando jefe");
                        int daño = tablero.getBoardModelo()[x][y].getCriatura().getAtk();
                        tablero.getBoardModelo()[x][y+1].getJefeDeTerreno().setVida(daño);
                        System.out.println("Vida restante "+tablero.getBoardModelo()[x][y+1].getJefeDeTerreno().getVida());
                        if(tablero.getBoardModelo()[x][y+1].getJefeDeTerreno().getVida()<=0){
                            vb.perdedor(tablero.getBoardModelo()[x][y+1].getJefeDeTerreno().getDueño());
                            tablero.eliminarJugador(x,y+1,tablero.getBoardModelo()[x][y+1].getJefeDeTerreno().getDueño());
                            vb.getBoardVisible()[x][y+1].setText(null);
                            b.getOrdenJugadores().remove(jugadorActual);
                            b.getJugadores().remove(jugadorActual);
                            if(b.getJugadores().size()==1){
                                vb.ganador(b.getJugadores().get(0).getNombre());
                                vb.dispose();
                                this.cbg.setVista(true);
                            } 
                        }
                        for(int i=0;i<15;i++){
                            for(int j=0;j<15;j++){
                                if(tablero.getBoardModelo()[i][j].isEmpty()){
                                    vb.getBoardVisible()[i][j].setText(null);
                                }
                            }
                        }
                        this.ultimaSeleccion=0;
                    }
                    else if(tablero.getBoardModelo()[x][y+1].isCriatura()&&!tablero.getBoardModelo()[x][y+1].getCriatura().getDueño().equals(vb.getJugadorActual())){
                        int daño = tablero.getBoardModelo()[x][y].getCriatura().getAtk();
                        tablero.getBoardModelo()[x][y+1].getCriatura().recibirDaño(daño);
                        if(tablero.getBoardModelo()[x][y+1].getCriatura().getHPActual()<=0){
                            tablero.getBoardModelo()[x][y+1].setCriatura(null);
                            vb.getBoardVisible()[x][y+1].setText(null);
                        }
                        this.ultimaSeleccion=0;
                    }
                    else{
                        vb.ataqueInvalido();
                    }
                }
            }
            catch(ArrayIndexOutOfBoundsException ae){
            }
            try{
                if(vb.getBoardVisible()[x][y-1]==e.getSource()){
                    System.out.println("Atacando en x, y-1");
                    if(tablero.getBoardModelo()[x][y-1].isJefe()&&!tablero.getBoardModelo()[x][y-1].getJefeDeTerreno().getDueño().equals(vb.getJugadorActual())){
                        System.out.println("Atacando jefe");
                        int daño = tablero.getBoardModelo()[x][y].getCriatura().getAtk();
                        tablero.getBoardModelo()[x][y-1].getJefeDeTerreno().setVida(daño);
                        System.out.println("Vida restante "+tablero.getBoardModelo()[x][y-1].getJefeDeTerreno().getVida());
                        if(tablero.getBoardModelo()[x][y-1].getJefeDeTerreno().getVida()<=0){
                            vb.perdedor(tablero.getBoardModelo()[x][y-1].getJefeDeTerreno().getDueño());
                            tablero.eliminarJugador(x,y-1,tablero.getBoardModelo()[x][y-1].getJefeDeTerreno().getDueño());
                            vb.getBoardVisible()[x][y-1].setText(null);
                            b.getOrdenJugadores().remove(jugadorActual);
                            b.getJugadores().remove(jugadorActual);
                            if(b.getJugadores().size()==1){
                                vb.ganador(b.getJugadores().get(0).getNombre());
                                vb.dispose();
                                this.cbg.setVista(true);
                            } 
                        }
                        for(int i=0;i<15;i++){
                            for(int j=0;j<15;j++){
                                if(tablero.getBoardModelo()[i][j].isEmpty()){
                                    vb.getBoardVisible()[i][j].setText(null);
                                }
                            }
                        }
                        this.ultimaSeleccion=0;
                    }
                    else if(tablero.getBoardModelo()[x][y-1].isCriatura()&&!tablero.getBoardModelo()[x][y-1].getCriatura().getDueño().equals(vb.getJugadorActual())){
                        int daño = tablero.getBoardModelo()[x][y].getCriatura().getAtk();
                        tablero.getBoardModelo()[x][y-1].getCriatura().recibirDaño(daño);
                        if(tablero.getBoardModelo()[x][y-1].getCriatura().getHPActual()<=0){
                            tablero.getBoardModelo()[x][y-1].setCriatura(null);
                            vb.getBoardVisible()[x][y-1].setText(null);
                        }
                        this.ultimaSeleccion=0;
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
    public void setDados(ArrayList<Dado> dados){
        this.dados=dados;
        for(Dado dado : dados){
            vb.setPuntos(dado.resultado());
        }
    }
}
