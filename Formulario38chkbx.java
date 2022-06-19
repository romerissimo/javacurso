import javax.swing.*;
import javax.swing.event.*; /* Libreria swing tiene eventos para checkbox */

/* changeListener se usa cuando se quiere asociar eventos con checkbox */
public class Formulario38chkbx extends JFrame implements ChangeListener{

 private JCheckBox check1, check2, check3;

 /*Se crea el constrcutor */
 public Formulario38chkbx(){
  setLayout(null);
  /* se crean las opciones */
  check1 = new JCheckBox("Inglés");
  check1.setBounds(10,10,150,30);  /* Incluye el box y la palabra leyenda */
  check1.addChangeListener(this);  /* asociamos evento al checkbox si es seleccionado */
  add(check1);

  check2 = new JCheckBox("Francés");
  check2.setBounds(10,50,150,30);  /* Incluye el box y la palabra leyenda */
  check2.addChangeListener(this);
  add(check2);

  check3= new JCheckBox("Alemán");
  check3.setBounds(10,90,150,30);  /* Incluye el box y la palabra leyenda */
  check3.addChangeListener(this);
  add(check3);
 }
/* Programamos los eventos al seleccionar un checkbox */
public void stateChanged(ChangeEvent e){
  String cad = "";
  if(check1.isSelected() == true){
    cad = cad + "Inglés-";
  }
  if(check2.isSelected() == true){
    cad = cad + "Francés-";
  }
  if(check3.isSelected() == true){
    cad = cad + "Alemán-";
  }
  setTitle(cad);
}

public static void main(String args[]){
  Formulario38chkbx formulario1 = new Formulario38chkbx();
  formulario1.setBounds(0,0,350,200);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
}
}
