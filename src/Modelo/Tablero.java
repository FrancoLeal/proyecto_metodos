package Modelo;
//Importacion
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import Vista.VistaBatalla;
import java.util.ArrayList;
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
    public Casilla[][] getBoardModelo(){
        return this.board;
    }
    public String getDueño(int i , int j ){
        return board[i][j].getDueño();
    }
    public void setDueño(int i , int j, int[][] forma, String dueño){
        board[forma[0][0]+i][forma[0][1]+j].setDueño(dueño);
        board[forma[1][0]+i][forma[1][1]+j].setDueño(dueño);
        board[forma[2][0]+i][forma[2][1]+j].setDueño(dueño);
        board[forma[3][0]+i][forma[3][1]+j].setDueño(dueño);
        board[forma[4][0]+i][forma[4][1]+j].setDueño(dueño);
        board[forma[5][0]+i][forma[5][1]+j].setDueño(dueño);
    }
    public boolean comprobar(int i , int j , int[][] forma, String jugadorActual){
        for(int l = 0 ; l<6;l++){
            if(i+forma[l][0]+1!=15&&board[(i+forma[l][0])+1][j+forma[l][1]].getDueño().equals(jugadorActual)){
                return true;
            }
            else if(i+forma[l][0]-1!=-1&&board[(i+forma[l][0])-1][j+forma[l][1]].getDueño().equals(jugadorActual)){
                return true;
            }
            else if(j+forma[l][0]+1!=15&&board[(i+forma[l][0])][j+forma[l][1]+1].getDueño().equals(jugadorActual)){
                return true;
            }
            else if(j+forma[l][0]-1!=-1&&board[(i+forma[l][0])][j+forma[l][1]-1].getDueño().equals(jugadorActual)){
                return true;
            }
        }
        return false;
    }

    public void setJefesDeTerreno(ArrayList<String> jugadores, ArrayList<JefeDeTerreno> jefes) {
        if(jugadores.size()==2){
                board[0][7].setDueño(jugadores.get(0));
                board[0][7].setJefeDeTerreno(jefes.get(0));
                board[14][7].setDueño(jugadores.get(1));
                board[14][7].setJefeDeTerreno(jefes.get(1));
        }
        else if (jugadores.size()==3){
                board[0][7].setDueño(jugadores.get(0));
                board[0][7].setJefeDeTerreno(jefes.get(0));
                board[14][7].setDueño(jugadores.get(1));
                board[14][7].setJefeDeTerreno(jefes.get(1));
                board[7][0].setDueño(jugadores.get(2));
                board[7][0].setJefeDeTerreno(jefes.get(1));
        }
        else if(jugadores.size()==4){
                board[0][7].setDueño(jugadores.get(0));
                board[0][7].setJefeDeTerreno(jefes.get(0));
                board[14][7].setDueño(jugadores.get(1));
                board[14][7].setJefeDeTerreno(jefes.get(1));
                board[7][0].setDueño(jugadores.get(2));
                board[7][0].setJefeDeTerreno(jefes.get(1));
                board[7][14].setDueño(jugadores.get(3));
                board[7][14].setJefeDeTerreno(jefes.get(1));
        }
    }
    public void eliminarJugador(int x , int y, String dueño){
        this.board[x][y].setJefeDeTerreno(null);
        for(int i = 0 ; i<15 ; i++){
            for(int j = 0 ; j <15 ; j++){
                if(board[i][j].isCriatura()){
                    if(board[i][j].getCriatura().getDueño().equals(dueño)){
                        board[i][j].setCriatura(null);
                    }
                }
            }
        }
    }
}