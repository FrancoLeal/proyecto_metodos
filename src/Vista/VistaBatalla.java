package Vista;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.*;
public class VistaBatalla extends javax.swing.JFrame {
    public VistaBatalla() {
        initComponents();
        tablero.setBackground(Color.blue);
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
        terreno = new JButton[15][15];
        for (int i = 0 ; i<15 ; i++){
            for (int j = 0 ; j<15 ; j++){
                JButton boton = new JButton();
                tablero.add(boton);
                boton.setBackground(Color.gray);
                terreno[i][j]=boton;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165)
                .addComponent(Atras))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lanzar)
                    .addComponent(Parar))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GifDados, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(dado1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(dado2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dado3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dado4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(Atras)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Lanzar)
                        .addGap(11, 11, 11)
                        .addComponent(Parar))
                    .addComponent(GifDados, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(dado1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(dado2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(dado3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(dado4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanzarActionPerformed
        // TODOgenerarnumeros objDado = new generarnumeros();
    }//GEN-LAST:event_LanzarActionPerformed

    private void PararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PararActionPerformed
        // TOgenerarnumeros objDado = new generarnumeros();
    }//GEN-LAST:event_PararActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JLabel GifDados;
    private javax.swing.JButton Lanzar;
    private javax.swing.JButton Parar;
    private javax.swing.JLabel dado1;
    private javax.swing.JLabel dado2;
    private javax.swing.JLabel dado3;
    private javax.swing.JLabel dado4;
    private javax.swing.JPanel tablero;
    // End of variables declaration//GEN-END:variables
    private JButton[][] terreno;
    public JButton[][] getTerreno(){
        return this.terreno;
    }
    public void agregarListener(ActionListener al){
        this.Parar.addActionListener(al);
        this.Lanzar.addActionListener(al);
        this.Atras.addActionListener(al);
        for (JButton[] columna : terreno){
            for (JButton boton : columna){
                boton.addActionListener(al);
            }
        }
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
    public JButton getBotonTerreno(int i , int j){
        return this.terreno[i][j];
    }
    public void setGifDados(ImageIcon imagen){
        this.GifDados.setVisible(true);
        this.GifDados.setIcon(imagen);
    }
    public void setGifDados(boolean b){
        this.GifDados.setVisible(b);
        this.dado1.setVisible(false);
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
    
}
