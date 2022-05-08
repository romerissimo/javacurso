import javax.swing.*;

public class Formulario extends JFrame{

  public Formulario(){    /* Este es un contructor */
   setLayout(null);
 }
 public static void main(String args[]){
  Formulario formulario1 = new Formulario(); /*clase Formulario que usa JFrame */
  formulario1.setBounds(0,0,400,550);
  formulario1.setVisible(true);
  formulario1.setLocationRelativeTo(null); /* Hace que aparesca centrada a pesar de las coordenadas*/
  formulario1.setResizable(false);    /* Usuario no puede modificar dimensiones de la ventana*/
 }
}
