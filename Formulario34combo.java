import javax.swing.*;
import java.awt.event.*;

/* Al compilar ya sin errores salen estas Notas:
Note: Formulario34combo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
No hacer caso por que es debido a que usamos consola, en IDE no sale */

public class Formulario34combo extends JFrame implements ItemListener{

private JComboBox combo1;

public Formulario34combo(){
 setLayout(null);
 combo1 = new JComboBox();
 combo1.setBounds(10,10,80,20);
 add(combo1);

 combo1.addItem("rojo");
 combo1.addItem("verde");
 combo1.addItem("azul");
 combo1.addItem("amarillo");
 combo1.addItem("negro");
 combo1.addItemListener(this); /* Mas adelante se va a encontrar con un evento */
}

public void itemStateChanged(ItemEvent e){
  if(e.getSource() == combo1){
    String seleccion = combo1.getSelectedItem().toString(); /* se recupera la selección combo1 y se convierte a texto */
    setTitle(seleccion); /* coloca el texto en el titulo de la ventana */
    }
 }

public static void main(String args[]){
  Formulario34combo formulario1 = new Formulario34combo();
  formulario1.setBounds(0,0,200,150);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
  }

}
