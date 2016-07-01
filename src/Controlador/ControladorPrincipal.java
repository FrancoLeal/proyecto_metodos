package Controlador;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPrincipal {
    public static String titulo = "Dungeon Dice Mithology";
    public static void main(String[] args){
        registrarAccion("Se ha abierto el juego. ");
        ControladorLogin cl = new ControladorLogin();
    }
    
    public static void registrarAccion(String accion){
        //Formato: <Año> / <Mes> / <Día> :: <Hora> : <Minutos> : <Segundos> = <Acción realizada>
        Date fecha = new Date();
        DateFormat formatoHoraFecha = new SimpleDateFormat("yyyy/MM/dd :: HH:mm:ss = ");
        String registroAccion = formatoHoraFecha.format(fecha)+accion;
        try {
            FileWriter escritura = new FileWriter("./Registro Acciones Usuario Activo.txt",true);
            System.out.println(registroAccion);
            escritura.write(registroAccion+System.lineSeparator());
            escritura.close();
        } catch (IOException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}