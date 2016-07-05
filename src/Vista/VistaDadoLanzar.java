/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;

/**
 *
 * @author FRANCO L
 */
public class VistaDadoLanzar extends javax.swing.JFrame {

    /**
     * Creates new form VistaDadoLanzar
     */
    public VistaDadoLanzar() {
        initComponents();
        this.dados = new ArrayList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccionar = new javax.swing.JButton();
        dado1 = new javax.swing.JCheckBox();
        dado2 = new javax.swing.JCheckBox();
        dado3 = new javax.swing.JCheckBox();
        dado4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        seleccionar.setText("Seleccionar");

        dado1.setText("Dado1");

        dado2.setText("Dado2");

        dado3.setText("Dado3");

        dado4.setText("Dado4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(seleccionar)
                .addGap(154, 154, 154))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(dado1)
                .addGap(27, 27, 27)
                .addComponent(dado2)
                .addGap(18, 18, 18)
                .addComponent(dado3)
                .addGap(18, 18, 18)
                .addComponent(dado4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dado1)
                    .addComponent(dado2)
                    .addComponent(dado3)
                    .addComponent(dado4))
                .addGap(26, 26, 26)
                .addComponent(seleccionar)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaDadoLanzar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaDadoLanzar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaDadoLanzar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaDadoLanzar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDadoLanzar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox dado1;
    private javax.swing.JCheckBox dado2;
    private javax.swing.JCheckBox dado3;
    private javax.swing.JCheckBox dado4;
    private javax.swing.JButton seleccionar;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Integer> dados = new ArrayList();
    public void agregarListener(ActionListener al){
       this.seleccionar.addActionListener(al);
    } 
    public void anadirDados(){
        if(dado1.isSelected()){
            dados.add(1);
        }
        if(dado2.isSelected()){
            dados.add(2);
        }
        if(dado3.isSelected()){
            dados.add(3);
        }
        if(dado4.isSelected()){
            dados.add(4);
        }
//        if(dado5.isSelected()==true){
//            dados.add(dado5.getName());
//        }
//        if(dado6.isSelected()==true){
//            dados.add(dado6.getName());
//        }
//        if(dado7.isSelected()==true){
//            dados.add(dado7.getName());
//        }
//        if(dado8.isSelected()==true){
//            dados.add(dado8.getName());
//        }
//        if(dado9.isSelected()==true){
//            dados.add(dado9.getName());
//        }
//        if(dado10.isSelected()==true){
//            dados.add(dado10.getName());
//        }
//        if(dado11.isSelected()==true){
//            dados.add(dado11.getName());
//        }
//        if(dado12.isSelected()==true){
//            dados.add(dado12.getName());
//        }
//        if(dado13.isSelected()==true){
//            dados.add(dado13.getName());
//        }
//        if(dado14.isSelected()==true){
//            dados.add(dado14.getName());
//        }
//        if(dado15.isSelected()==true){
//            dados.add(dado15.getName());
//        }
    }
    
    public ArrayList<Integer> getDados() {
        return dados;
    }
    
    public JButton getButtonSeleccionar() {
        return this.seleccionar;
    }
}