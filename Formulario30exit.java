import javax.swing.*;
import java.awt.event.*;

public class Formulario30exit extends JFrame implements ActionListener{

 private JTextField textfield1;
 private JTextArea textarea1;
 private JButton botonexit;

 public Formulario30exit(){    /** constructor de los elementos que van dentro **/
  setLayout(null);
  textfield1 = new JTextField();
  textfield1.setBounds(10,10,200,30);
  add(textfield1);

  textarea1 = new JTextArea();
  textarea1.setBounds(10,50,400,300);
  add(textarea1);

  botonexit = new JButton("Salir");
  botonexit.setBounds(420,50,100,30);
  add(botonexit);
  botonexit.addActionListener(this);  /** indicamos que va a haber un evento **/
 }
/** Se programa elñ evento de click en el boton Salida **/
 public void actionPerformed(ActionEvent e){
   if(e.getSource() == botonexit){
     System.exit(0);
   }
 }

 public static void main(String args[]){
   Formulario30exit formulario1 = new Formulario30exit();
   formulario1.setBounds(0,0,540,400);
   formulario1.setVisible(true);
   formulario1.setResizable(false);
   formulario1.setLocationRelativeTo(null);
 }
}
