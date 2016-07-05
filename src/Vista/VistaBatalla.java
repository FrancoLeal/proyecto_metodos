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
import javax.swing.JTextField;

public class VistaBatalla extends javax.swing.JFrame {
    public VistaBatalla() {
        initComponents();
        color.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lanzar = new javax.swing.JButton();
        tablero = new javax.swing.JPanel();
        dado1 = new javax.swing.JLabel();
        dado2 = new javax.swing.JLabel();
        dado3 = new javax.swing.JLabel();
        dado4 = new javax.swing.JLabel();
        ptosInvocar = new javax.swing.JLabel();
        ptosMov = new javax.swing.JLabel();
        ptosAtk = new javax.swing.JLabel();
        ptosMag = new javax.swing.JLabel();
        ptosTrap = new javax.swing.JLabel();
        atacar = new javax.swing.JButton();
        mover = new javax.swing.JButton();
        magia = new javax.swing.JButton();
        trampa = new javax.swing.JButton();
        cambioTurno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jugador = new javax.swing.JLabel();
        invocar = new javax.swing.JButton();
        color = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nombreCriatura = new javax.swing.JLabel();
        dueñoCriatura = new javax.swing.JLabel();
        hpTotalCriatura = new javax.swing.JLabel();
        hpActualCriatura = new javax.swing.JLabel();
        dañoCriatura = new javax.swing.JLabel();
        defensaCriatura = new javax.swing.JLabel();
        cara1 = new javax.swing.JLabel();
        cara2 = new javax.swing.JLabel();
        cara3 = new javax.swing.JLabel();
        cara4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lanzar.setText("Lanzar!");
        lanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanzarActionPerformed(evt);
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

        magia.setText("Magia");

        trampa.setText("Trampa");

        cambioTurno.setText("Turno finalizado");

        jLabel2.setText("Turno de: ");

        invocar.setText("Invocar");

        jLabel4.setText("Nombre Criatura:");

        jLabel5.setText("HP Total             :");

        jLabel6.setText("HP Actual           :");

        jLabel7.setText("Dueño                :");

        jLabel8.setText("Daño                  :");

        jLabel9.setText("Defensa             :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(7, 7, 7)
                                .addComponent(hpTotalCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(7, 7, 7)
                                        .addComponent(nombreCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(7, 7, 7)
                                        .addComponent(dueñoCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(7, 7, 7)
                                        .addComponent(hpActualCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(7, 7, 7)
                                        .addComponent(dañoCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(7, 7, 7)
                                        .addComponent(defensaCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cara1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dado1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cara3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dado3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dado2, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                        .addComponent(cara2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cara4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dado4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))))
                    .addComponent(cambioTurno)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, 0)
                        .addComponent(jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(trampa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ptosTrap, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(magia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ptosMag, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(invocar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(ptosInvocar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(mover, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(ptosMov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(atacar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(ptosAtk, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lanzar)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atacar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ptosAtk)
                                .addComponent(lanzar)))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mover)
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invocar)
                                    .addComponent(ptosInvocar)))
                            .addComponent(ptosMov))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(magia)
                                    .addComponent(ptosMag))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(trampa)
                                    .addComponent(ptosTrap))
                                .addGap(7, 7, 7)
                                .addComponent(cambioTurno)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(nombreCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(dueñoCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(dado1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dado2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(hpTotalCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(hpActualCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cara1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cara2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(dañoCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(defensaCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dado4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addComponent(dado3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cara3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cara4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanzarActionPerformed
        // TOgenerarnumeros objDado = new generarnumeros();
    }//GEN-LAST:event_lanzarActionPerformed

    private void lanzar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanzar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lanzar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atacar;
    private javax.swing.JButton cambioTurno;
    private javax.swing.JLabel cara1;
    private javax.swing.JLabel cara2;
    private javax.swing.JLabel cara3;
    private javax.swing.JLabel cara4;
    private javax.swing.JLabel color;
    private javax.swing.JLabel dado1;
    private javax.swing.JLabel dado2;
    private javax.swing.JLabel dado3;
    private javax.swing.JLabel dado4;
    private javax.swing.JLabel dañoCriatura;
    private javax.swing.JLabel defensaCriatura;
    private javax.swing.JLabel dueñoCriatura;
    private javax.swing.JLabel hpActualCriatura;
    private javax.swing.JLabel hpTotalCriatura;
    private javax.swing.JButton invocar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jugador;
    public javax.swing.JButton lanzar;
    private javax.swing.JButton magia;
    private javax.swing.JButton mover;
    private javax.swing.JLabel nombreCriatura;
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
        this.lanzar.addActionListener(al);
        for (int i = 0 ; i<15 ; i++){
            for (int j = 0 ; j<15 ; j++){
                board[i][j].addActionListener(al);
                board[i][j].addMouseListener(ml);
            }
        }
        this.invocar.addActionListener(al);
        this.cambioTurno.addActionListener(al);
        this.atacar.addActionListener(al);
        this.mover.addActionListener(al);
        this.trampa.addActionListener(al);
        this.magia.addActionListener(al);
        
        
    }
    public void errorIndex(){
        JOptionPane.showMessageDialog(null, "Estás intentando desplegar el dado fuera del tablero. Por favor, intenta de nuevo.", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
    public JButton getButtonLanzar(){
        return this.lanzar;
    }

    public JButton getParar() {
        return lanzar;
    }
    public void setResultadoDado1(ImageIcon imagen){
        this.dado1.setIcon(imagen);
    }
    public void setResultadoDado2(ImageIcon imagen){
        this.dado2.setIcon(imagen);
    }
    public void setResultadoDado3(ImageIcon imagen){
        this.dado3.setIcon(imagen);
    }
    public void setResultadoDado4(ImageIcon imagen){
        this.dado4.setIcon(imagen);
    }
    public JButton getButtonInvocar(){
        return this.invocar;
    }

    public JButton getButtonAtacar() {
        return atacar;
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

    public void setDañoCriatura(int daño) {
        this.dañoCriatura.setText(Integer.toString(daño));
    }

    public void setDefensaCriatura(int def) {
        this.defensaCriatura.setText(Integer.toString(def));
    }

    public void setDueñoCriatura(String dueño) {
        this.dueñoCriatura.setText(dueño);
    }

    public void setHpActualCriatura(int hp) {
        this.hpActualCriatura.setText(Integer.toString(hp));
    }

    public void setHpTotalCriatura(int hp) {
        this.hpTotalCriatura.setText(Integer.toString(hp));
    }
    public void setNombreCriatura(String nombre){
        this.nombreCriatura.setText(nombre);
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
    public void setPtosAtkInic(int ptosAtk) {
        this.ptosAtk.setText(Integer.toString(ptosAtk));
    }

    public void setPtosInvocarInic(int ptosInvocar) {
        this.ptosInvocar.setText(Integer.toString(ptosInvocar));
    }

    public void setPtosMagInic(int ptosMag) {
        this.ptosMag.setText(Integer.toString(ptosMag));
    }

    public void setPtosMovInic(int ptosMov) {
        this.ptosMov.setText(Integer.toString(ptosMov));
    }

    public void setPtosTrapInic(int ptosTrap) {
        this.ptosTrap.setText(Integer.toString(ptosTrap));
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
        /*Font fuente = new Font("Calibri", Font.BOLD , 10);
        board[i][j].setFont(fuente);*/
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
            board[forma[0][0]+i][forma[0][1]+j].setBackground(Color.cyan);
            board[forma[1][0]+i][forma[1][1]+j].setBackground(Color.cyan);
            board[forma[2][0]+i][forma[2][1]+j].setBackground(Color.cyan);
            board[forma[3][0]+i][forma[3][1]+j].setBackground(Color.cyan);
            board[forma[4][0]+i][forma[4][1]+j].setBackground(Color.cyan);
            board[forma[5][0]+i][forma[5][1]+j].setBackground(Color.cyan);
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
    /*public void vistaPreviaEntrandoErrona(int i,int j,int[][] forma){
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
    }*/

    public String getJugadorActual() {
        return this.jugador.getText();
    }
    public void setJugadores(ArrayList<String> jugadores){
        this.jugadores=jugadores;
    }
    public void setJefesDeTerreno(ArrayList<String> jugadores, ArrayList<String> nombreJefe){
        if(jugadores.size()==2){
                board[0][7].setBackground(Color.red);
                board[0][7].setText(nombreJefe.get(0));
                board[14][7].setBackground(Color.cyan);
                board[14][7].setText(nombreJefe.get(1));
        }
        else if (jugadores.size()==3){
                board[0][7].setBackground(Color.red);
                board[0][7].setText(nombreJefe.get(0));
                board[14][7].setBackground(Color.cyan);
                board[14][7].setText(nombreJefe.get(1));
                board[7][0].setBackground(Color.green);
                board[7][0].setText(nombreJefe.get(2));
        }
        else if(jugadores.size()==4){
                board[0][7].setBackground(Color.red);
                board[0][7].setText(nombreJefe.get(0));
                board[14][7].setBackground(Color.cyan);
                board[14][7].setText(nombreJefe.get(1));
                board[7][0].setBackground(Color.green);
                board[7][0].setText(nombreJefe.get(2));
                board[7][14].setBackground(Color.yellow);
                board[7][14].setText(nombreJefe.get(3));
        }
    }
    public void sinPuntos(){
        JOptionPane.showMessageDialog(null, "No tienes puntos suficientes", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
    public void pintarTurno(ArrayList<String> jugadores){
        if(jugadores.get(0).equals(getJugadorActual())){
            color.setBackground(Color.red);
        } 
        else if (jugadores.get(1).equals(getJugadorActual())) {
            color.setBackground(Color.cyan);
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
    public void errorJefe() {
        JOptionPane.showMessageDialog(null, "No puedes mover un Jefe de Terreno", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
    public void ataqueInvalido(){
        JOptionPane.showMessageDialog(null, "No hay nadie para atacar", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public JLabel getDado1() {
        return dado1;
    }

    public JLabel getDado2() {
        return dado2;
    }

    public JLabel getDado3() {
        return dado3;
    }

    public JLabel getDado4() {
        return dado4;
    }
    public void setDados(ImageIcon icon1){
        getDado1().setIcon(icon1);
    }
    public void setDados(ImageIcon icon1,ImageIcon icon2){
        getDado1().setIcon(icon1);
    }
    public void setDados(ImageIcon icon1,ImageIcon icon2,ImageIcon icon3){
        getDado1().setIcon(icon1);
    }
    public void setDados(ImageIcon icon1,ImageIcon icon2,ImageIcon icon3 ,ImageIcon icon4){
        getDado1().setIcon(icon1);
    }
    public void setPuntos(String cara){
        if(cara=="ATAQUE"){
            setPtosAtk(1);
        }
        else if(cara=="MAGIA"){
            setPtosMag(1);
        }
        else if(cara=="MOVIMIENTO"){
            setPtosMov(1);
        }
        else if (cara=="TRAMPA"){
            setPtosTrap(1);
        }
        else if(cara=="INVOCAR"){
            setPtosInvocar(1);
        }
        this.lanzar.setEnabled(false);
    }

    public void ingresarCantidadDados() {
        JOptionPane.showMessageDialog(null, "Ingresa un numero de dados por favor", "Error", JOptionPane.INFORMATION_MESSAGE);
    }

    public void errorDueñoCriatura() {
        JOptionPane.showMessageDialog(null, "Esta ciratura no te pertenece", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
}
