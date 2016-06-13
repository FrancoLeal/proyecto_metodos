
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class VistaBatallaTipo extends javax.swing.JFrame {

    public VistaBatallaTipo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuarioActivo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        atrás = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        porEquipos = new javax.swing.JButton();
        todosVsTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        usuarioActivo.setText(Controlador.ControladorLogin.usuarioActivo);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("USUARIO ACTIVO:");

        atrás.setText("Atrás");
        atrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrásActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecciona tipo de batalla");

        porEquipos.setText("Por equipos");
        porEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porEquiposActionPerformed(evt);
            }
        });

        todosVsTodos.setText("Todos contra todos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atrás)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(porEquipos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(todosVsTodos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(usuarioActivo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atrás)))
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(porEquipos)
                .addGap(18, 18, 18)
                .addComponent(todosVsTodos)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void porEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porEquiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_porEquiposActionPerformed

    private void atrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrásActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atrásActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrás;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton porEquipos;
    private javax.swing.JButton todosVsTodos;
    private javax.swing.JLabel usuarioActivo;
    // End of variables declaration//GEN-END:variables

    public void agregarListener(ActionListener al){
        this.atrás.addActionListener(al);
        this.porEquipos.addActionListener(al);
        this.todosVsTodos.addActionListener(al);
    }
    public JButton getButtonAtrás(){
        return this.atrás;
    }
    public JButton getButtonPorEquipos(){
        return this.porEquipos;
    }
    public JButton getButtonTodosVsTodos(){
        return this.todosVsTodos;
    }
}
