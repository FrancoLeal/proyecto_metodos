package Controlador;
//Importacion de clases
import Modelo.Batalla;
import Modelo.Dado;
//import Modelo.Dado2;
import Modelo.Tablero;
import Vista.VistaBatalla;
import Vista.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.ImageIcon;
//Definicion clase
public class ControladorBatalla implements ActionListener {
    //Definicion atributos
    private VistaBatalla vb;
    private Batalla b;
    private ControladorVistaPrincipal cvp;
    private JButton[][] terreno;
    private ImageIcon ImagenAtaque;
    private ImageIcon ImagenMagia ;
    private ImageIcon ImagenMovimiento;
    private ImageIcon ImagenTrampa;
    private ImageIcon ImagenInvocar;
    
    //Definicion constructor
    public ControladorBatalla(ControladorVistaPrincipal cvp){
        this.cvp = cvp;
        this.vb = new VistaBatalla();
        this.b = new Batalla();
        vb.setVisible(true);
        vb.agregarListener(this);
        vb.setLocationRelativeTo(null);
        this.terreno = vb.getTerreno();
        ImagenAtaque = new ImageIcon("C:\\Users\\FRANCO L\\Desktop\\Proyecto\\proyecto_metodos\\src\\ImagenesJuego\\ATAQUE.png");
        ImagenMagia = new ImageIcon("C:\\Users\\FRANCO L\\Desktop\\Proyecto\\proyecto_metodos\\src\\ImagenesJuego\\MAGIA.png");
        ImagenMovimiento = new ImageIcon("C:\\Users\\FRANCO L\\Desktop\\Proyecto\\proyecto_metodos\\src\\ImagenesJuego\\MOVIMIENTO.png");
        ImagenTrampa = new ImageIcon("C:\\Users\\FRANCO L\\Desktop\\Proyecto\\proyecto_metodos\\src\\ImagenesJuego\\TRAMPA.png");
        ImagenInvocar = new ImageIcon("C:\\Users\\FRANCO L\\Desktop\\Proyecto\\proyecto_metodos\\src\\ImagenesJuego\\INVOCAR.png");
    }
    public void actionPerformed(ActionEvent e){
        if(vb.getButtonAtras()==e.getSource()){
            vb.dispose();
            cvp.setVista(true);
        }
        else if(vb.getButtonLanzar()==e.getSource()){
            vb.setGifDados(new ImageIcon("C:\\Users\\FRANCO L\\Desktop\\Proyecto\\proyecto_metodos\\src\\ImagenesJuego\\dados.gif"));
            /*Dado Dado1 = new Dado("ATAQUE.png","INVOCAR.png","MAGIA.png","MOVIMIENTO.png","TRAMPA.png","ATAQUE.png");
            String cara = Dado1.resultado();*/
            
            System.out.println("Ok, funciona");
            //setIcon con la foto de la cara (En el Jpanel Batalla)
            //setText con el nombre de la cara (En el Jpanel Batalla)
        }
        else if (vb.getButtonParar()==e.getSource()){
            vb.setGifDados(false);
            Dado Dado1 = new Dado(ImagenAtaque,ImagenMagia,ImagenMovimiento,ImagenTrampa,ImagenInvocar,ImagenAtaque);
            vb.setResultadoDado1(Dado1.resultado());
            Dado Dado2 = new Dado(ImagenAtaque,ImagenMagia,ImagenMovimiento,ImagenTrampa,ImagenInvocar,ImagenAtaque);
            vb.setResultadoDado2(Dado2.resultado());
            Dado Dado3 = new Dado(ImagenAtaque,ImagenMagia,ImagenMovimiento,ImagenTrampa,ImagenInvocar,ImagenAtaque);
            vb.setResultadoDado3(Dado3.resultado());
            Dado Dado4 = new Dado(ImagenAtaque,ImagenMagia,ImagenMovimiento,ImagenTrampa,ImagenInvocar,ImagenAtaque);
            vb.setResultadoDado4(Dado4.resultado());
        }
  
     /*else if(vb.getButtonParar()==e.getSource()){
       
      Dado objDado = new Dado();
        Dado2 objImag1=new Dado2();
        int result = objDado.calcularNumero();
        lblMostrarDado.setIcon(objImag1.pngDadoR(result));
        txtResultado.setText(DadoR);
        System.out.println("Wena");
        // Falta que reconozca el textfield y el label de la vistaBatalla
        }*/
        else{
            for (int i = 0 ; i<15 ; i++){
                for (int j = 0 ; j<15 ; j++){
                    if(vb.getBotonTerreno(i,j)==e.getSource()){
                        System.out.println("X="+i+"Y="+j);
                    }
                }
            }
        }
    }
}