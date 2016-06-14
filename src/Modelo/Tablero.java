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
    public void pintar(int i,int j,int[][] forma){
        board[forma[0][0]+i][forma[0][1]+j].setBackground(Color.yellow);
        board[forma[1][0]+i][forma[1][1]+j].setBackground(Color.yellow);
        board[forma[2][0]+i][forma[2][1]+j].setBackground(Color.yellow);
        board[forma[3][0]+i][forma[3][1]+j].setBackground(Color.yellow);
        board[forma[4][0]+i][forma[4][1]+j].setBackground(Color.yellow);
        board[forma[5][0]+i][forma[5][1]+j].setBackground(Color.yellow);
    }
}
