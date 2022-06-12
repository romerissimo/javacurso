import javax.swing.*;
import java.awt.event.*;

public class Formulario31exit extends JFrame implements ActionListener{

 private JTextField textfield1;
 private JScrollPane scrollpane1;
 private JTextArea textarea1;
 private JButton botonexit;

 public Formulario31exit(){
  setLayout(null);
  textfield1 = new JTextField();
  textfield1.setBounds(10,10,200,30);
  add(textfield1);

  textarea1 = new JTextArea();
  scrollpane1 = new JScrollPane(textarea1); /**Esto hace que textarea1 tenga scroll **/
  scrollpane1.setBounds(10,50,400,300);
  add(scrollpane1);

  botonexit = new JButton("Salir");
  botonexit.setBounds(220,10,100,30);
  add(botonexit);
  botonexit.addActionListener(this); /** el boton estara esperando una accion: click **/
 }

 /** Se programa la accion al hacer click en el boton de salida **/
 public void actionPerformed(ActionEvent e){
   if(e.getSource() == botonexit){
     System.exit(0);
   }
 }

public static void main(String args[]){
 Formulario31exit formulario31exit = new Formulario31exit();
 formulario31exit.setBounds(0,0,540,400);
 formulario31exit.setVisible(true);
 formulario31exit.setResizable(false);
 formulario31exit.setLocationRelativeTo(null);
 }

}
