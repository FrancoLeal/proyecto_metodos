package Modelo;
//Importacion
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import Vista.VistaBatalla;
//Declaracion clase
public class Tablero extends javax.swing.JPanel implements ActionListener {
    Casilla[][] boton;
    public Tablero(JPanel tablero){
        /*tablero.setLayout(new java.awt.GridLayout(15,15));
        boton = new Casilla[15][15];
        for (int i = 0 ; i<15 ; i++){
            for (int j = 0 ; j<15 ; j++){
                boton[i][j] = new Casilla();
                boton[i][j].addActionListener(boton[i][j]);
                tablero.add(boton[i][j]);
            }
        }*/
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
