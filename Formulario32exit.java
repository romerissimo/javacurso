import javax.swing.*;
import java.awt.event.*;

public class Formulario32exit extends JFrame implements ActionListener{

/** Definimos los componentes internos del formulario **/
 private JTextField textfield1;
 private JScrollPane scrollpane1;
 private JTextArea textarea1;
 private JButton boton1;  /** Boton para agregar texto **/
 private JButton botonexit;  /** Boton para salir **/

 String texto = ""; /** El texto  que se ingresa antes de agregar **/

/** Creamos el constructor **/
 public Formulario32exit(){
  setLayout(null);
  textfield1 = new JTextField();
  textfield1.setBounds(10,10,200,30);
  add(textfield1);

  boton1 = new JButton("Agregar");
  boton1.setBounds(250,10,100,30);
  add(boton1);
  boton1.addActionListener(this);

  textarea1 = new JTextArea();
  scrollpane1 = new JScrollPane(textarea1); /**Esto hace que textarea1 tenga scroll **/
  scrollpane1.setBounds(10,50,400,300);
  add(scrollpane1);

  botonexit = new JButton("Salir");
  botonexit.setBounds(360,10,100,30);
  add(botonexit);
  botonexit.addActionListener(this); /** el boton estara esperando una accion: click **/
 }

 /** Se programa la accion de gregar texto al textarea al hacer click en el boton1 **/
 public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
     texto += textfield1.getText() + "\n";
     textarea1.setText(texto);
     textfield1.setText("");
   }
   if(e.getSource() == botonexit){  /** Si se hace click en salir se cierra todo **/
     System.exit(0);
     }
 }

public static void main(String args[]){
 Formulario32exit formulario32exit = new Formulario32exit();
 formulario32exit.setBounds(0,0,540,400);
 formulario32exit.setVisible(true);
 formulario32exit.setResizable(false);
 formulario32exit.setLocationRelativeTo(null);
 }

}
