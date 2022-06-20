/* Radio button, es un grupo de botones que solo se puede seleccionar uno */
import javax.swing.*;
import javax.swing.event.*;  /* para tener eventos para radio boton */

public class Formulario40radio extends JFrame implements ChangeListener{

  private JRadioButton radio1, radio2, radio3;
  private ButtonGroup bg;

/* se crea el constructor */
  public Formulario40radio(){
     setLayout(null);
     bg = new ButtonGroup(); /* grupo donde se agrupan los radio button */
     radio1 = new JRadioButton("640x480");
     radio1.setBounds(10,20,100,30);
     radio1.addChangeListener(this);
     add(radio1);
     bg.add(radio1); /*Esto agrega radio1 al grupo de radiobuttons bg */

     radio2 = new JRadioButton("800x600");
     radio2.setBounds(10,70,100,30);
     radio2.addChangeListener(this);
     add(radio2);
     bg.add(radio2); /*Esto agrega radio2 al grupo de radiobuttons bg */

     radio3 = new JRadioButton("1024x768");
     radio3.setBounds(10,120,100,30);
     radio3.addChangeListener(this);
     add(radio3);
     bg.add(radio3); /*Esto agrega radio1 al grupo de radiobuttons bg */
  }
/* se programa las acciones a realizar cuando se selecciona el radio button */
  public void stateChanged(ChangeEvent e){
    if(radio1.isSelected()){     /* no se pone == por que solo un radio button se selecciona */
      setSize(640,480);
    }
    if(radio2.isSelected()){
      setSize(800,600);
    }
    if(radio3.isSelected()){
      setSize(1024,768);
    }
  }

public static void main(String args[]){
  Formulario40radio formulario1 = new Formulario40radio();
  formulario1.setBounds(0,0,350,230);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  /* No se usa setLocationRelativeTo ya que se quiere que aparezca arriba a la derecha */
 }
}
