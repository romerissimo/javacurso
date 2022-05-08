import javax.swing.*;

public class Formulario extends JFrame{
  private JLabel label1;

  public Formulario(){    /* Este es un contructor */
   setLayout(null);
   label1 = new JLabel("La Geekipedia de Ernesto");
   label1.setBounds(10,20,200,300);
   add(label1);
 }
 public static void main(String args[]){
  Formulario formulario1 = new Formulario(); /*clase Formulario que usa JFrame */
  formulario1.setBounds(0,0,400,300);
  formulario1.setVisible(true);
  formulario1.setLocationRelativeTo(null); /*Para que aparezca en el centro de la pantalla*/
 }
}
