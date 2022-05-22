import javax.swing.*;
import java.awt.event.*;

public class Formulario29exit extends JFrame implements ActionListener{

 private JTextField textfield1;
 private JLabel label1;
 private JButton boton1, botonExit;

/** Comienza la creacion del constructor (ventana) y lo que va a contener **/
 public Formulario29exit(){
   setLayout(null);
   /** Se crea el Label **/
   label1 = new JLabel("Usuario:");
   label1.setBounds(10,10,100,30);
   add(label1);    /** necesario para que aparezca el label **/

   /** Se crea el campo que va a recibir el texto del usuario **/
   textfield1 = new JTextField();
   textfield1.setBounds(120,17,150,20);
   add(textfield1);

   /** Diseño del boton **/
   boton1 = new JButton("Aceptar");
   boton1.setBounds(10,80,100,30);
   add(boton1);
   boton1.addActionListener(this);  /** Indicamos que va a tener un evento **/

   /** diseño del boton de saida **/
   botonExit = new JButton("Salir");
   botonExit.setBounds(160,80,100,30);
   add(botonExit);
   botonExit.addActionListener(this);  /** Indicamos que va a tener un evento **/
/** Termina la creacion del constructor y sus partes **/
 }
  /** Se programa la parte que se ejecuta cuando se hace click en el boton **/
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      String texto = textfield1.getText();  /** Se pasa lo que ingreso en texto en textfield1 al string **/
      setTitle(texto); /** Ese texto se coloca en el tituli de la ventana **/
    }
    if(e.getSource() == botonExit){    /** Metodo del boton de salida **/
      System.exit(0);
    }
  }

public static void main(String args[]){
  Formulario29exit formulario1 = new Formulario29exit();   /** Creo la ventana para que aparezca **/
  formulario1.setBounds(0,0,300,150);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);  /** Para que aparezca en el centro de la pantalla **/
 }
}
