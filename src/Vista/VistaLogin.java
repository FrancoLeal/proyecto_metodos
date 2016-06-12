package Vista;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class VistaLogin extends javax.swing.JFrame{
   

    public VistaLogin() {
        initComponents();
        this.setTitle("Luch Oh!:Dados de Mantequilla");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Registrarse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Ingresar = new javax.swing.JButton();
        usuarioField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        Registrarse.setText("Registrate!");
        getContentPane().add(Registrarse);
        Registrarse.setBounds(363, 480, 110, 23);

        jLabel1.setText("Nombre usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 300, 110, 14);

        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 350, 100, 14);

        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(Ingresar);
        Ingresar.setBounds(180, 400, 90, 23);

        usuarioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioField);
        usuarioField.setBounds(180, 320, 99, 20);

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordField);
        passwordField.setBounds(180, 370, 99, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesJuego/lucho_jara.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 510, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioFieldActionPerformed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed
    public void usuarioInexistente(String usuario){
        JOptionPane.showMessageDialog(null, "El usuario " + usuario + " no existe.", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
    public void contrasenaIncorrecta(){
        JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JButton Registrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usuarioField;
    // End of variables declaration//GEN-END:variables

    public JButton getButtonIngresar(){
        return this.Ingresar;
    }
    public String getUsuarioVista(){
        return this.usuarioField.getText();
    }
    public String getPasswordVista(){
        return this.passwordField.getText();
    }
    public JButton getButtonRegistrarse(){
        return this.Registrarse;
    }
    public void agregarListener(ActionListener al){
        this.Ingresar.addActionListener(al);
        this.Registrarse.addActionListener(al);
    }

}
