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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(Atras)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Parar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lanzar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(Atras)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Parar)
                    .addComponent(Lanzar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanzarActionPerformed
        // TODOgenerarnumeros objDado = new generarnumeros();
    }//GEN-LAST:event_LanzarActionPerformed

    private void PararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PararActionPerformed
        // TOgenerarnumeros objDado = new generarnumeros();
    }//GEN-LAST:event_PararActionPerformed

    

                                      

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }  
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton Lanzar;
    private javax.swing.JButton Parar;
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
    /*public JPanel getTablero(){
        return this.tablero;
    }
    public void setTablero(JPanel tablero){
        this.tablero = tablero;
    }*/
}
