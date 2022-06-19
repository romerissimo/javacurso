/* cuando el usuario hace click en checkbox Acepto el boton Continuar se activa */
import javax.swing.*;   /* para usar checkbox */
import javax.swing.event.*; /* esto es para dar eventos a los Checkbox */
import java.awt.event.*;    /* para dar eventos a los botones button */

/* La clase ActionListener para los botones y ChangeListener para los checkbox */
public class Formulario39acept extends JFrame implements ActionListener, ChangeListener{

  private JLabel label1;
  private JCheckBox check1;
  private JButton boton1;

  public Formulario39acept(){
    setLayout(null);
    label1 = new JLabel("Aceptar términos y condiciones"); /* texto que lee el usuario */
    label1.setBounds(10,10,400,30);
    add(label1);

    check1 = new JCheckBox("Acepto");  /* Texto para la casilla de selección */
    check1.setBounds(10,50,100,30);
    check1.addChangeListener(this);  /* asociamos el checkbox a un evento cuando lo seleccionan */
    add(check1);

    boton1 = new JButton("Continuar");
    boton1.setBounds(10,100,100,30);
    add(boton1);
    boton1.addActionListener(this);  /* decimos que espere el click en el boton */
    boton1.setEnabled(false);  /* esto hace que el boton empiece "deshabilitado" */
  }
/* Se programa las acciones para cuando se selecciona el checkbox */
public void stateChanged(ChangeEvent e){
   if(check1.isSelected() == true){
      boton1.setEnabled(true);
   } else{
      boton1.setEnabled(false);
   }
}
/* Se programa las acciones para cuando se hace click en el boton, salir del programa*/
public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
    System.exit(0);
  }
}
/* se crea metodo main con la interface grpafica, ventana del programa */
public static void main(String args[]){
  Formulario39acept formulario1 = new Formulario39acept();
  formulario1.setBounds(0,0,350,200);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
}




}
