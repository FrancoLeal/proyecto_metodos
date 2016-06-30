package Vista;
import Modelo.Tablero;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VistaBatalla extends javax.swing.JFrame {
    public VistaBatalla() {
        initComponents();
        color.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lanzar = new javax.swing.JButton();
        Parar = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        tablero = new javax.swing.JPanel();
        GifDados = new javax.swing.JLabel();
        dado1 = new javax.swing.JLabel();
        dado2 = new javax.swing.JLabel();
        dado3 = new javax.swing.JLabel();
        dado4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ptosInvocar = new javax.swing.JLabel();
        ptosMov = new javax.swing.JLabel();
        ptosAtk = new javax.swing.JLabel();
        ptosMag = new javax.swing.JLabel();
        ptosTrap = new javax.swing.JLabel();
        atacar = new javax.swing.JButton();
        mover = new javax.swing.JButton();
        invocar = new javax.swing.JButton();
        magia = new javax.swing.JButton();
        trampa = new javax.swing.JButton();
        cambioTurno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jugador = new javax.swing.JLabel();
        desplegar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        color = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lanzar.setText("Lanzar");
        Lanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanzarActionPerformed(evt);
            }
        });

        Parar.setText("Parar");
        Parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PararActionPerformed(evt);
            }
        });

        Atras.setText("Atrás");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        tablero.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout tableroLayout = new javax.swing.GroupLayout(tablero);
        tablero.setLayout(tableroLayout);
        tableroLayout.setHorizontalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        tableroLayout.setVerticalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        tablero.setLayout(new java.awt.GridLayout(15,15));
        Font fuente = new Font("Calibri", Font.BOLD , 11);
        for (int i = 0 ; i<15 ; i++){
            for (int j = 0 ; j<15 ; j++){
                board[i][j]= new JButton();
                board[i][j].setFont(fuente);
                tablero.add(board[i][j]);
                board[i][j].setBackground(Color.white);
            }
        }

        GifDados.setBackground(Color.blue);
        GifDados.setVisible(false);

        dado1.setVisible(false);
        dado1.setPreferredSize(new java.awt.Dimension(110, 110));

        dado2.setVisible(false);
        dado2.setPreferredSize(new java.awt.Dimension(110, 110));

        dado3.setVisible(false);
        dado3.setPreferredSize(new java.awt.Dimension(110, 110));

        dado4.setVisible(false);
        dado4.setPreferredSize(new java.awt.Dimension(110, 110));

        ptosInvocar.setText("0");

        ptosMov.setText("0");

        ptosAtk.setText("0");

        ptosMag.setText("0");

        ptosTrap.setText("0");

        atacar.setText("Atacar");

        mover.setText("Mover");

        invocar.setText("Invocar");
        invocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invocarActionPerformed(evt);
            }
        });

        magia.setText("Magia");

        trampa.setText("Trampa");

        cambioTurno.setText("Turno finalizado");

        jLabel2.setText("Turno de: ");

        desplegar.setText("Desplegar!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lanzar)
                            .addComponent(Parar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GifDados, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dado1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(dado2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dado3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 194, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desplegar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(Atras))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(atacar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ptosAtk, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(invocar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ptosInvocar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(magia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ptosMag, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(trampa)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ptosTrap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(mover, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ptosMov, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cambioTurno))))
                                .addGap(16, 16, 16)
                                .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)))))
                .addGap(18, 18, 18)
                .addComponent(dado4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(desplegar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Atras)
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(atacar)
                                    .addComponent(ptosAtk, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mover)
                                    .addComponent(ptosMov))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(invocar)
                                    .addComponent(ptosInvocar))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(magia)
                                    .addComponent(ptosMag))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(trampa)
                                    .addComponent(ptosTrap))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cambioTurno)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lanzar)
                        .addGap(6, 6, 6)
                        .addComponent(Parar))
                    .addComponent(dado3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dado4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GifDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dado1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dado2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanzarActionPerformed
        // TODOgenerarnumeros objDado = new generarnumeros();
    }//GEN-LAST:event_LanzarActionPerformed

    private void PararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PararActionPerformed
        // TOgenerarnumeros objDado = new generarnumeros();
    }//GEN-LAST:event_PararActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtrasActionPerformed

    private void invocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invocarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invocarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    public javax.swing.JLabel GifDados;
    private javax.swing.JButton Lanzar;
    public javax.swing.JButton Parar;
    private javax.swing.JButton atacar;
    private javax.swing.JButton cambioTurno;
    private javax.swing.JLabel color;
    private javax.swing.JLabel dado1;
    private javax.swing.JLabel dado2;
    private javax.swing.JLabel dado3;
    private javax.swing.JLabel dado4;
    private javax.swing.JButton desplegar;
    private javax.swing.JButton invocar;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jugador;
    private javax.swing.JButton magia;
    private javax.swing.JButton mover;
    private javax.swing.JLabel ptosAtk;
    private javax.swing.JLabel ptosInvocar;
    private javax.swing.JLabel ptosMag;
    private javax.swing.JLabel ptosMov;
    private javax.swing.JLabel ptosTrap;
    private javax.swing.JPanel tablero;
    private Tablero terreno;
    private javax.swing.JButton trampa;
    // End of variables declaration//GEN-END:variables
    private JButton[][] board = new JButton[15][15];
    private ArrayList<String> jugadores;
    public void agregarListener(ActionListener al, MouseListener ml){
        this.Parar.addActionListener(al);
        this.Lanzar.addActionListener(al);
        this.Atras.addActionListener(al);
        for (int i = 0 ; i<15 ; i++){
            for (int j = 0 ; j<15 ; j++){
                board[i][j].addActionListener(al);
                board[i][j].addMouseListener(ml);
            }
        }
        this.desplegar.addActionListener(al);
        this.cambioTurno.addActionListener(al);
        this.atacar.addActionListener(al);
        this.mover.addActionListener(al);
        this.invocar.addActionListener(al);
        this.trampa.addActionListener(al);
        this.magia.addActionListener(al);
        
        
    }
    public void errorIndex(){
        JOptionPane.showMessageDialog(null, "Estás intentando desplegar el dado fuera del tablero. Por favor, intenta de nuevo.", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
    public JButton getButtonParar(){
        return this.Parar;
    }
    public JButton getButtonLanzar(){
        return this.Lanzar;
    }
    public JButton getButtonAtras(){
        return this.Atras;
    }

    public JButton getLanzar() {
        return Lanzar;
    }

    public JButton getParar() {
        return Parar;
    }

    public JLabel getGifDados() {
        return GifDados;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }
    
    
   
    public void setGifDados(ImageIcon imagen){
        this.GifDados.setVisible(true);
        this.GifDados.setIcon(imagen);
        this.dado1.setVisible(false);
        this.dado2.setVisible(false);
        this.dado3.setVisible(false);
        this.dado4.setVisible(false);
    }
    public void setGifDados(boolean b){
        this.GifDados.setVisible(b);
     
    }
    public void setResultadoDado1(ImageIcon imagen){
        this.dado1.setIcon(imagen);
        this.dado1.setVisible(true);
    }
    public void setResultadoDado2(ImageIcon imagen){
        this.dado2.setIcon(imagen);
        this.dado2.setVisible(true);
    }
    public void setResultadoDado3(ImageIcon imagen){
        this.dado3.setIcon(imagen);
        this.dado3.setVisible(true);
    }
    public void setResultadoDado4(ImageIcon imagen){
        this.dado4.setIcon(imagen);
        this.dado4.setVisible(true);
    }
    public JButton getButtonDesplegar(){
        return this.desplegar;
    }

    public JButton getButtonAtacar() {
        return atacar;
    }

    public JButton getButtonInvocar() {
        return invocar;
    }

    public JButton getButtonMagia() {
        return magia;
    }

    public JButton getButtonMover() {
        return mover;
    }

    public JButton getButtonTrampa() {
        return trampa;
    }
    public JButton getButtonCambioTurno(){
        return this.cambioTurno;
    }
    public JButton[][] getBoardVisible(){
        return this.board;
    }

    public void setPtosAtk(int ptosAtk) {
        int i = ptosAtk+Integer.parseInt(this.ptosAtk.getText());
        this.ptosAtk.setText(Integer.toString(i));
    }

    public void setPtosInvocar(int ptosInvocar) {
        int i = ptosInvocar+Integer.parseInt(this.ptosInvocar.getText());
        this.ptosInvocar.setText(Integer.toString(i));
    }

    public void setPtosMag(int ptosMag) {
        int i = ptosMag+Integer.parseInt(this.ptosMag.getText());
        this.ptosMag.setText(Integer.toString(i));
    }

    public void setPtosMov(int ptosMov) {
        int i = ptosMov+Integer.parseInt(this.ptosMov.getText());
        this.ptosMov.setText(Integer.toString(i));
    }

    public void setPtosTrap(int ptosTrap) {
        int i = ptosTrap+Integer.parseInt(this.ptosTrap.getText());
        this.ptosTrap.setText(Integer.toString(i));
    }

    public int getPtosAtk() {
        return Integer.parseInt(this.ptosAtk.getText());
    }

    public int getPtosInvocar() {
        return Integer.parseInt(this.ptosInvocar.getText());
    }

    public int getPtosMag() {
        return Integer.parseInt(this.ptosMag.getText());
    }

    public int getPtosMov() {
        return Integer.parseInt(this.ptosMov.getText());
    }

    public int getPtosTrap() {
        return Integer.parseInt(this.ptosTrap.getText());
    }
    
    public void setJugadorActual(String nombre){
        this.jugador.setText(nombre);
    }
    public void setCriatura(int i , int j, String nombre){
        Font fuente = new Font("Calibri", Font.BOLD , 10);
        board[i][j].setFont(fuente);
        board[i][j].setText(nombre);
    }
    public void pintar(int i,int j,int[][] forma, ArrayList<String> jugadores){
        if(jugadores.get(0).equals(getJugadorActual())){
            board[forma[0][0]+i][forma[0][1]+j].setBackground(Color.red);
            board[forma[1][0]+i][forma[1][1]+j].setBackground(Color.red);
            board[forma[2][0]+i][forma[2][1]+j].setBackground(Color.red);
            board[forma[3][0]+i][forma[3][1]+j].setBackground(Color.red);
            board[forma[4][0]+i][forma[4][1]+j].setBackground(Color.red);
            board[forma[5][0]+i][forma[5][1]+j].setBackground(Color.red);
            
        } 
        else if (jugadores.get(1).equals(getJugadorActual())) {
            board[forma[0][0]+i][forma[0][1]+j].setBackground(Color.blue);
            board[forma[1][0]+i][forma[1][1]+j].setBackground(Color.blue);
            board[forma[2][0]+i][forma[2][1]+j].setBackground(Color.blue);
            board[forma[3][0]+i][forma[3][1]+j].setBackground(Color.blue);
            board[forma[4][0]+i][forma[4][1]+j].setBackground(Color.blue);
            board[forma[5][0]+i][forma[5][1]+j].setBackground(Color.blue);
        }
        else if(jugadores.get(2).equals(getJugadorActual())){
            board[forma[0][0]+i][forma[0][1]+j].setBackground(Color.green);
            board[forma[1][0]+i][forma[1][1]+j].setBackground(Color.green);
            board[forma[2][0]+i][forma[2][1]+j].setBackground(Color.green);
            board[forma[3][0]+i][forma[3][1]+j].setBackground(Color.green);
            board[forma[4][0]+i][forma[4][1]+j].setBackground(Color.green);
            board[forma[5][0]+i][forma[5][1]+j].setBackground(Color.green);
        }
        else if(jugadores.get(3).equals(getJugadorActual())){
                board[forma[0][0]+i][forma[0][1]+j].setBackground(Color.yellow);
                board[forma[1][0]+i][forma[1][1]+j].setBackground(Color.yellow);
                board[forma[2][0]+i][forma[2][1]+j].setBackground(Color.yellow);
                board[forma[3][0]+i][forma[3][1]+j].setBackground(Color.yellow);
                board[forma[4][0]+i][forma[4][1]+j].setBackground(Color.yellow);
                board[forma[5][0]+i][forma[5][1]+j].setBackground(Color.yellow);
        }
    }
    public void vistaPreviaEntrando(int i,int j,int[][] forma){
        board[forma[0][0]+i][forma[0][1]+j].setIcon(new ImageIcon(getClass().getResource("/ImagenesJuego/valido.png")));
        board[forma[1][0]+i][forma[1][1]+j].setIcon(new ImageIcon(getClass().getResource("/ImagenesJuego/valido.png")));
        board[forma[2][0]+i][forma[2][1]+j].setIcon(new ImageIcon(getClass().getResource("/ImagenesJuego/valido.png")));
        board[forma[3][0]+i][forma[3][1]+j].setIcon(new ImageIcon(getClass().getResource("/ImagenesJuego/valido.png")));
        board[forma[4][0]+i][forma[4][1]+j].setIcon(new ImageIcon(getClass().getResource("/ImagenesJuego/valido.png")));
        board[forma[5][0]+i][forma[5][1]+j].setIcon(new ImageIcon(getClass().getResource("/ImagenesJuego/valido.png")));
    }
    public void vistaPreviaSaliendo(int i,int j,int[][] forma){
        board[forma[0][0]+i][forma[0][1]+j].setIcon(null);
        board[forma[1][0]+i][forma[1][1]+j].setIcon(null);
        board[forma[2][0]+i][forma[2][1]+j].setIcon(null);
        board[forma[3][0]+i][forma[3][1]+j].setIcon(null);
        board[forma[4][0]+i][forma[4][1]+j].setIcon(null);
        board[forma[5][0]+i][forma[5][1]+j].setIcon(null);
    }
    public void vistaPreviaEntrandoErrona(int i,int j,int[][] forma){
        board[forma[0][0]+i][forma[0][1]+j].setIcon(new ImageIcon(getClass().getResource("/ImagenesJuego/invalido.png")));
        board[forma[1][0]+i][forma[1][1]+j].setIcon(new ImageIcon(getClass().getResource("/ImagenesJuego/invalido.png")));
        board[forma[2][0]+i][forma[2][1]+j].setIcon(new ImageIcon(getClass().getResource("/ImagenesJuego/invalido.png")));
        board[forma[3][0]+i][forma[3][1]+j].setIcon(new ImageIcon(getClass().getResource("/ImagenesJuego/invalido.png")));
        board[forma[4][0]+i][forma[4][1]+j].setIcon(new ImageIcon(getClass().getResource("/ImagenesJuego/invalido.png")));
        board[forma[5][0]+i][forma[5][1]+j].setIcon(new ImageIcon(getClass().getResource("/ImagenesJuego/invalido.png")));
    }
    public void vistaPreviaSaliendoErronea(int i,int j,int[][] forma){
        board[forma[0][0]+i][forma[0][1]+j].setIcon(null);
        board[forma[1][0]+i][forma[1][1]+j].setIcon(null);
        board[forma[2][0]+i][forma[2][1]+j].setIcon(null);
        board[forma[3][0]+i][forma[3][1]+j].setIcon(null);
        board[forma[4][0]+i][forma[4][1]+j].setIcon(null);
        board[forma[5][0]+i][forma[5][1]+j].setIcon(null);
    }

    public String getJugadorActual() {
        return this.jugador.getText();
    }
    public void setJugadores(ArrayList<String> jugadores){
        this.jugadores=jugadores;
    }
    public void setJefesDeTerreno(ArrayList<String> jugadores, ArrayList<String> nombreJefe){
        switch(jugadores.size()){
            case 2:
                board[0][7].setBackground(Color.red);
                board[0][7].setText(nombreJefe.get(0));
                board[0][7].setBackground(Color.blue);
                board[0][7].setText(nombreJefe.get(1));
            case 3:
                board[0][7].setBackground(Color.red);
                board[0][7].setText(nombreJefe.get(0));
                board[14][7].setBackground(Color.blue);
                board[14][7].setText(nombreJefe.get(1));
                board[7][0].setBackground(Color.green);
                board[7][0].setText(nombreJefe.get(2));
            case 4:
                board[0][7].setBackground(Color.red);
                board[0][7].setText(nombreJefe.get(0));
                board[14][7].setBackground(Color.blue);
                board[14][7].setText(nombreJefe.get(1));
                board[7][0].setBackground(Color.green);
                board[7][0].setText(nombreJefe.get(2));
                board[7][14].setBackground(Color.yellow);
                board[7][14].setText(nombreJefe.get(3));
                System.out.println(board[0][7].getFont());
        }
    }
    public void sinPuntos(){
        JOptionPane.showMessageDialog(null, "No tienes puntos suficientes", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
    public void pintarTurno(ArrayList<String> jugadores){
        System.out.println("Pintando");
        if(jugadores.get(0).equals(getJugadorActual())){
            color.setBackground(Color.red);
        } 
        else if (jugadores.get(1).equals(getJugadorActual())) {
            color.setBackground(Color.blue);
        }
        else if(jugadores.get(2).equals(getJugadorActual())){
            color.setBackground(Color.green);
        }
        else if(jugadores.get(3).equals(getJugadorActual())){
            color.setBackground(Color.yellow);
        }
    }
    public void sinCriatura(){
        JOptionPane.showMessageDialog(null, "Esta casilla esta vacía", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
    public void movimientoInvalido(){
        JOptionPane.showMessageDialog(null, "No puedes moverte aqui", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
}
