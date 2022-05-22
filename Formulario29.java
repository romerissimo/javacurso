import javax.swing.*;
import java.awt.event.*;

public class Formulario29 extends JFrame implements ActionListener{

 private JTextField textfield1;
 private JLabel label1;
 private JButton boton1;

/** Comienza la creacion del constructor (ventana) y lo que va a contener **/
 public Formulario29(){
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
/** Termina la creacion del constructor y sus partes **/
 }
  /** Se programa la parte que va a tener el evento para el boton **/
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      String texto = textfield1.getText();  /** Se pasa lo que ingreso en texto en textfield1 al string **/
      setTitle(texto); /** Ese texto se coloca en el tituli de la ventana **/
    }
  }

public static void main(String args[]){
  Formulario29 formulario1 = new Formulario29();   /** Creo la ventana para que aparezca **/
  formulario1.setBounds(0,0,300,150);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);  /** Para que aparezca en el centro de la pantalla **/
 }
}
