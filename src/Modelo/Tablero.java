package Modelo;
//Importacion
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import Vista.VistaBatalla;
//Declaracion clase
public class Tablero extends javax.swing.JPanel implements ActionListener {
    public Tablero(JPanel tablero){
        tablero.setLayout(new java.awt.GridLayout(15,15));
        JButton boton[][] = new JButton[15][15];
        for (int i = 0 ; i<15 ; i++){
            for (int j = 0 ; j<15 ; j++){
                boton[i][j] = new JButton();
                boton[i][j].addActionListener(this);
                tablero.add(boton[i][j]);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
