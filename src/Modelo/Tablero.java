package Modelo;
//Importacion
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import Vista.VistaBatalla;
//Declaracion clase
public class Tablero extends javax.swing.JPanel{
    JButton boton;
    public Tablero(JPanel tablero){
        tablero.setLayout(new java.awt.GridLayout(15,15));
        for (int i = 0 ; i<15 ; i++){
            for (int j = 0 ; j<15 ; j++){
                boton = new JButton();
                boton.setSize(10,10);
                //boton.agregarListener();
                tablero.add(boton);
                
            }
        }
    }
}
