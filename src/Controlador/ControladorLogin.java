package Controlador;
//Importación de clases
import Modelo.Login;
import Vista.VistaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Definición de la clase
public class ControladorLogin implements ActionListener {
    //Atributos
    private Login lg;
    private VistaLogin vl;
    
        public static void main(String[] args){
            ControladorLogin cl = new ControladorLogin();
            cl.vl = new VistaLogin();
            cl.lg = new Login("franco", "juegos");
            cl.lg.getUsuario();
            cl.lg.getPassword();
    }
    public void actionPerformed(ActionEvent e){
            if(vl.getButtonIngresar()==e.getSource()){
                
        }
    }
}
