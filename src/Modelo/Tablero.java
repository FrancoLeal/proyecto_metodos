package Modelo;
//Importacion
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import Vista.VistaBatalla;
//Declaracion clase
public class Tablero{
    public Casilla[][] board;
    public Tablero(){
        board = new Casilla[15][15];
        for (int i = 0 ; i<15 ; i++){
            for (int j = 0 ; j<15 ; j++){
                board[i][j] = new Casilla();
            }
        }
    }
}
