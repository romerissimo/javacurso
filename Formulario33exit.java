import javax.swing.*;
import java.awt.event.*;

public class Formulario33exit extends JFrame implements ActionListener{

/** Definimos los componentes internos del formulario **/
 private JTextField textfield1, textfield2;
 private JLabel label1, label2, label3;
 private JButton boton1; /* Boton de suma */
 private JButton botonexit;  /** Boton para salir **/

/** Creamos el constructor **/
 public Formulario33exit(){
  setLayout(null);
  label1 = new JLabel("Valor 1:");
  label1.setBounds(50,5,100,30);
  add(label1);
  label2 = new JLabel("Valor 2:");
  label2.setBounds(50,35, 100,30);
  add(label2);
  label3 = new JLabel("Resultado:");
  label3.setBounds(120,80,100,30);
  add(label3);

  textfield1 = new JTextField();
  textfield1.setBounds(120,10,150,20);
  add(textfield1);
  textfield2 = new JTextField();
  textfield2.setBounds(120,40,150,20);
  add(textfield2);

  boton1 = new JButton("Sumar");
  boton1.setBounds(10,80,100,30);
  add(boton1);
  boton1.addActionListener(this);

  botonexit = new JButton("X");
  botonexit.setBounds(270,85,20,20);
  add(botonexit);
  botonexit.addActionListener(this); /* el boton estara esperando una accion: click */
 }

 /** Se programa la accion de gregar texto al textarea al hacer click en el boton1 de suma */
 public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
     int valor1 = 0, valor2 = 0, resultado = 0;
     valor1 = Integer.parseInt(textfield1.getText());  /* Se convierte de texto a entero */
     valor2 = Integer.parseInt(textfield2.getText());  /* Se convierte de texto a entero */

     resultado = valor1 + valor2;

     label3.setText("Resultado: " + resultado); /*Nota: para resultado mayor a 1000 se recorta el numero, resolver */
   }
   if(e.getSource() == botonexit){  /** Si se hace click en salir se cierra todo **/
     System.exit(0);
     }
 }

public static void main(String args[]){
 Formulario33exit formulario33exit = new Formulario33exit();
 formulario33exit.setBounds(0,0,300,150);
 formulario33exit.setVisible(true);
 formulario33exit.setResizable(false);
 formulario33exit.setLocationRelativeTo(null);
 }
}
