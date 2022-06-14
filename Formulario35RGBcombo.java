import javax.swing.*;
import java.awt.*;  /* Este es awt import componentes que incluye el color */
import java.awt.event.*;

/* Al compilar ya sin errores salen estas Notas:
Note: Formulario35RGBcombo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
No hacer caso por que es debido a que usamos consola, en IDE no sale */

public class Formulario35RGBcombo extends JFrame implements ActionListener{

private JLabel label1, label2, label3;
private JComboBox combo1, combo2, combo3;
private JButton boton1;

public Formulario35RGBcombo(){  /* constructor se debe llamar igual que la clare */
 setLayout(null);
 label1 = new JLabel("Rojo");
 label1.setBounds(10,10,100,10);
 add(label1);

 combo1 = new JComboBox();
 combo1.setBounds(120,10,90,30);
  /* adicionar 256 items al combobox */
  for(int i = 0; i<=255; i++){
  combo1.addItem(String.valueOf(i));
  }
  add(combo1);

  label2 = new JLabel("Verde");
  label2.setBounds(10,50,100,10);
  add(label2);

  combo2 = new JComboBox();
  combo2.setBounds(120,50,90,30);
   /* adicionar 256 items al combobox */
   for(int i = 0; i<=255; i++){
   combo2.addItem(String.valueOf(i));
   }
   add(combo2);

   label3 = new JLabel("Azul");
   label3.setBounds(10,90,100,10);
   add(label3);

   combo3 = new JComboBox();
   combo3.setBounds(120,90,90,30);
    /* adicionar 256 items al combobox */
    for(int i = 0; i<=255; i++){
    combo3.addItem(String.valueOf(i));
    }
    add(combo3);

    boton1 = new JButton("Fijar color");
    boton1.setBounds(10,130,100,30);
    add(boton1);
    boton1.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
    String cad1 = combo1.getSelectedItem().toString(); /* se recupera la selección combo1 y se convierte a texto */
    String cad2 = combo2.getSelectedItem().toString();
    String cad3 = combo3.getSelectedItem().toString();

    int rojo = Integer.parseInt(cad1);
    int verde = Integer.parseInt(cad2);
    int azul = Integer.parseInt(cad3);

    Color color1 = new Color(rojo,verde,azul); /* Objeto Color que viene con java.awt.* */
    boton1.setBackground(color1);
    }
 }
public static void main(String args[]){
  Formulario35RGBcombo formulario1 = new Formulario35RGBcombo();
  formulario1.setBounds(0,0,220,220);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
  }
}
