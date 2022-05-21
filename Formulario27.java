import javax.swing.*;  /** Para crear el dise;o grafico **/
import java.awt.event.*;  /** Para usar eventos en botones u otros**/

public class Formulario27 extends JFrame implements ActionListener{

  JButton boton1;
  public Formulario27(){    /** el constructor **/
    setLayout(null);
/** Diseno del boton: **/
    boton1 = new JButton("Cerrar");
    boton1.setBounds(300,250,100,30); /**Posicion del boton dentro de la ventana y tamano **/
    add(boton1);  /**para que aparezca el boton **/
    boton1.addActionListener(this); /**indicamos que se espere del evento en este boton **/
    }
/** Funcionalidad (evento) que queremos que realice el boton **/
    public void actionPerformed(ActionEvent e){   /**El evento se gusrda en e **/
      if(e.getSource() == boton1){
        System.exit(0);
        }
      }

    public static void main(String args[]){
    Formulario27 formulario1 = new Formulario27();
    formulario1.setBounds(0,0,450,350);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
    }
  }
