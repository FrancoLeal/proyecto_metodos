package Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JToggleButton;

public class VistaBatallaConfiguracion extends javax.swing.JFrame {
    
    private boolean batallaPorEquipos;

    public VistaBatallaConfiguracion(boolean batallaPorEquipos) {
        initComponents();
        this.batallaPorEquipos = batallaPorEquipos;
        jRadioButton1.setVisible(batallaPorEquipos);
        jRadioButton2.setVisible(batallaPorEquipos);
        jRadioButton3.setVisible(batallaPorEquipos);
        jRadioButton4.setVisible(batallaPorEquipos);
        jRadioButton5.setVisible(batallaPorEquipos);
        jRadioButton6.setVisible(batallaPorEquipos);
        jRadioButton7.setVisible(batallaPorEquipos);
        jRadioButton8.setVisible(batallaPorEquipos);
        jRadioButton9.setVisible(batallaPorEquipos);
        jRadioButton10.setVisible(batallaPorEquipos);
        jRadioButton11.setVisible(batallaPorEquipos);
        jRadioButton12.setVisible(batallaPorEquipos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jugador1Equipo = new javax.swing.ButtonGroup();
        jugador2Equipo = new javax.swing.ButtonGroup();
        jugador3Equipo = new javax.swing.ButtonGroup();
        jugador4Equipo = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        usuarioActivo = new javax.swing.JLabel();
        atrás = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tipoBatalla = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        editarPuzleJ1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        seleccionJugador2 = new javax.swing.JComboBox<>();
        editarPuzleJ2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        seleccionJugador3 = new javax.swing.JComboBox<>();
        editarPuzleJ3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        seleccionJugador4 = new javax.swing.JComboBox<>();
        editarPuzleJ4 = new javax.swing.JButton();
        comenzarBatalla = new javax.swing.JToggleButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        iniciarSesionJ2 = new javax.swing.JButton();
        iniciarSesionJ3 = new javax.swing.JButton();
        iniciarSesionJ4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("USUARIO ACTIVO:");

        usuarioActivo.setText(Controlador.ControladorLogin.usuarioActivo);

        atrás.setText("Atrás");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Tipo de batalla:");

        tipoBatalla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tipoBatalla.setText("código: tipo de batalla");

        jLabel3.setText("Jugador 1:");

        jLabel4.setText(Controlador.ControladorLogin.usuarioActivo);

        editarPuzleJ1.setText("Editar puzle");

        jLabel5.setText("Jugador 2:");

        seleccionJugador2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        editarPuzleJ2.setText("Editar puzle");

        jLabel6.setText("Jugador 3:");

        seleccionJugador3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        editarPuzleJ3.setText("Editar puzle");

        jLabel7.setText("Jugador 4:");

        seleccionJugador4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        editarPuzleJ4.setText("Editar puzle");

        comenzarBatalla.setText("Comenzar");

        jugador1Equipo.add(jRadioButton1);
        jRadioButton1.setText("Equipo 1");

        jugador1Equipo.add(jRadioButton2);
        jRadioButton2.setText("Equipo 2");

        jugador1Equipo.add(jRadioButton3);
        jRadioButton3.setText("Equipo 3");

        jugador2Equipo.add(jRadioButton4);
        jRadioButton4.setText("Equipo 1");

        jugador2Equipo.add(jRadioButton5);
        jRadioButton5.setText("Equipo 2");

        jugador2Equipo.add(jRadioButton6);
        jRadioButton6.setText("Equipo 3");

        jugador3Equipo.add(jRadioButton7);
        jRadioButton7.setText("Equipo 3");

        jugador3Equipo.add(jRadioButton8);
        jRadioButton8.setText("Equipo 1");

        jugador3Equipo.add(jRadioButton9);
        jRadioButton9.setText("Equipo 2");

        jugador4Equipo.add(jRadioButton10);
        jRadioButton10.setText("Equipo 2");

        jugador4Equipo.add(jRadioButton11);
        jRadioButton11.setText("Equipo 1");

        jugador4Equipo.add(jRadioButton12);
        jRadioButton12.setText("Equipo 3");

        iniciarSesionJ2.setText("Iniciar sesión");

        iniciarSesionJ3.setText("Iniciar sesión");

        iniciarSesionJ4.setText("Iniciar sesión");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(tipoBatalla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuarioActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(comenzarBatalla))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(iniciarSesionJ2)
                                                    .addComponent(seleccionJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(iniciarSesionJ3)
                                                    .addComponent(seleccionJugador3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(iniciarSesionJ4)
                                                    .addComponent(seleccionJugador4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButton4)
                                            .addComponent(jRadioButton5)
                                            .addComponent(jRadioButton6)
                                            .addComponent(jRadioButton8)
                                            .addComponent(jRadioButton9)
                                            .addComponent(jRadioButton7)
                                            .addComponent(jRadioButton11)
                                            .addComponent(jRadioButton10)
                                            .addComponent(jRadioButton12))))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editarPuzleJ3)
                                    .addComponent(editarPuzleJ2)
                                    .addComponent(editarPuzleJ1)
                                    .addComponent(editarPuzleJ4)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 405, Short.MAX_VALUE)
                                .addComponent(atrás)))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton4)
                        .addComponent(jLabel5)
                        .addComponent(seleccionJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editarPuzleJ2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(usuarioActivo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(atrás))
                        .addGap(4, 4, 4)
                        .addComponent(tipoBatalla)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(editarPuzleJ1)
                            .addComponent(jRadioButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addGap(44, 44, 44)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton6))
                    .addComponent(iniciarSesionJ2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton8)
                    .addComponent(jLabel6)
                    .addComponent(seleccionJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarPuzleJ3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comenzarBatalla)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jRadioButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton7))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iniciarSesionJ3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton11)
                            .addComponent(jLabel7)
                            .addComponent(seleccionJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editarPuzleJ4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton12))
                            .addComponent(iniciarSesionJ4))
                        .addContainerGap(58, Short.MAX_VALUE))))
        );

        tipoBatalla.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrás;
    private javax.swing.JToggleButton comenzarBatalla;
    private javax.swing.JButton editarPuzleJ1;
    private javax.swing.JButton editarPuzleJ2;
    private javax.swing.JButton editarPuzleJ3;
    private javax.swing.JButton editarPuzleJ4;
    private javax.swing.JButton iniciarSesionJ2;
    private javax.swing.JButton iniciarSesionJ3;
    private javax.swing.JButton iniciarSesionJ4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.ButtonGroup jugador1Equipo;
    private javax.swing.ButtonGroup jugador2Equipo;
    private javax.swing.ButtonGroup jugador3Equipo;
    private javax.swing.ButtonGroup jugador4Equipo;
    private javax.swing.JComboBox<String> seleccionJugador2;
    private javax.swing.JComboBox<String> seleccionJugador3;
    private javax.swing.JComboBox<String> seleccionJugador4;
    private javax.swing.JLabel tipoBatalla;
    private javax.swing.JLabel usuarioActivo;
    // End of variables declaration//GEN-END:variables

    public void agregarListener(ActionListener al){
        this.atrás.addActionListener(al);
        this.editarPuzleJ1.addActionListener(al);
        this.editarPuzleJ2.addActionListener(al);
        this.editarPuzleJ3.addActionListener(al);
        this.editarPuzleJ4.addActionListener(al);
        /*this.jRadioButton1.addActionListener(al);
        this.jRadioButton2.addActionListener(al);
        this.jRadioButton3.addActionListener(al);
        this.jRadioButton4.addActionListener(al);
        this.jRadioButton5.addActionListener(al);
        this.jRadioButton6.addActionListener(al);
        this.jRadioButton7.addActionListener(al);
        this.jRadioButton8.addActionListener(al);
        this.jRadioButton9.addActionListener(al);
        this.jRadioButton10.addActionListener(al);
        this.jRadioButton11.addActionListener(al);
        this.jRadioButton12.addActionListener(al);*/
        this.comenzarBatalla.addActionListener(al);
        this.iniciarSesionJ2.addActionListener(al);
        this.iniciarSesionJ3.addActionListener(al);
        this.iniciarSesionJ4.addActionListener(al);
    }
    public JButton getButtonAtrás(){
        return this.atrás;
    }
    public JButton getButtonEditarPuzleJ1(){
        return this.editarPuzleJ1;
    }
    public JButton getButtonEditarPuzleJ2(){
        return this.editarPuzleJ2;
    }
    public JButton getButtonEditarPuzleJ3(){
        return this.editarPuzleJ3;
    }
    public JButton getButtonEditarPuzleJ4(){
        return this.editarPuzleJ4;
    }
    public JToggleButton getButtonComenzarBatalla(){
        return this.comenzarBatalla;
    }
    public JButton getButtonIniciarSesionJ2(){
        return this.iniciarSesionJ2;
    }
    public JButton getButtonIniciarSesionJ3(){
        return this.iniciarSesionJ3;
    }
    public JButton getButtonIniciarSesionJ4(){
        return this.iniciarSesionJ4;
    }
}
