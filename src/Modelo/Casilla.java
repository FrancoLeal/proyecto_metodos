package Modelo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Casilla extends JButton {
    private int dueño;
    public Casilla(){
    }
    public void setDueño(int dueño){
        this.dueño = dueño;
    }
}
