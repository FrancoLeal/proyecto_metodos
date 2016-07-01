package Vista;
import Controlador.ControladorPrincipal;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class VistaLogin extends javax.swing.JFrame{
   

    public VistaLogin() {
        initComponents();
        this.setTitle(ControladorPrincipal.titulo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuarioField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        Ingresar = new javax.swing.JButton();
        Registrarse = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre usuario");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(380, 310, 125, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(380, 370, 90, 22);

        usuarioField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usuarioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioFieldActionPerformed(evt);
            }
        });
        jPanel1.add(usuarioField);
        usuarioField.setBounds(380, 340, 140, 25);

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });
        jPanel1.add(passwordField);
        passwordField.setBounds(380, 400, 140, 25);

        Ingresar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(Ingresar);
        Ingresar.setBounds(380, 440, 140, 31);

        Registrarse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Registrarse.setText("Registrate!");
        jPanel1.add(Registrarse);
        Registrarse.setBounds(380, 490, 140, 31);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Las imágenes mostradas son propiedad de Level Up! Games y Hi-Rez Studios, y son usadas con fines meramente académicos y sin ánimos de lucro.");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 570, 830, 13);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesJuego/logoMedio.gif"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(280, 120, 350, 175);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesJuego/diosesLogin.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 900, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldKeyPressed
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
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
    public void agregarKeyListener(KeyListener kl){
        this.usuarioField.addKeyListener(kl);
        this.passwordField.addKeyListener(kl);
    }

}
