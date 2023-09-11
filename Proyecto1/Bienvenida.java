package Proyecto1;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

 private JTextField textfield1;
 private JLabel label1, label2, label3, label4;
 private JButton boton1;
 public static String texto = ""; /* Para guardar el nombre que ingresa el usuario
                                     Es public por que va a ser usada o llamada
                                     por otra clase externa que es Licencia.java  */

 public Bienvenida(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE); /* Curso Java 48 - Para que el programa al cerrar
                                            la ventana no se quede en daemon y devuelva el
                                            prompt del sistema en el simbolo del sistema */
   setTitle("Bienvenido");
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

   ImageIcon imagen = new ImageIcon("images/logo-coca.png");
   label1 = new JLabel(imagen);
   label1.setBounds(25,15,300,150);
   add(label1);

   label2 = new JLabel("Sistema de Control Vacacional");
   label2.setBounds(30,160,300,30);
   label2.setFont(new Font("Andale Mono", 3, 16));
   label2.setForeground(new Color(255,255,255));
   add(label2);

   label3 = new JLabel("Ingrese su nombre");
   label3.setBounds(45,212,200,30);
   label3.setFont(new Font("Andale Mono", 1, 12));
   label3.setForeground(new Color(255,255,255));
   add(label3);

   label4 = new JLabel("2022 The Coca-Cola Company");
   label4.setBounds(85,375,300,30);
   label4.setFont(new Font("Andale Mono", 1, 12));
   label4.setForeground(new Color(255,255,255));
   add(label4);

   textfield1 = new JTextField();
   textfield1.setBounds(45,240,255,25);
   textfield1.setBackground(new Color(224,224,224));
   textfield1.setFont(new Font("Andale Mono", 1, 14));
   textfield1.setForeground(new Color(255,0,0));
   add(textfield1);

   boton1 = new JButton("Ingresar");
   boton1.setBounds(125,280,100,30);
   boton1.setBackground(new Color(255,255,255));
   boton1.setFont(new Font("Andale Mono", 1, 14));
   boton1.setForeground(new Color(255,0,0));
   boton1.addActionListener(this);
   add(boton1);
 }

   public void actionPerformed(ActionEvent e){
     if(e.getSource() == boton1){
       texto = textfield1.getText().trim(); /* Colocamos el nombre ingresado en la variable texto.
                                               El metodo "trim()" quita los espacios */
       if(texto.equals("")){   /*el "" representa si no se ha tipeado nada */
          JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre."); /*lanza una ventanita para avisar */
       } else{
    /* Para llamar a la siguiente ventana Licencia, COPIAR AQUI EL CODIGO main
       de la clase Licencia sin los parentesis ni la parte de Static args[] */
         Licencia ventanalicencia = new Licencia();
         ventanalicencia.setBounds(0,0,600,370);
         ventanalicencia.setVisible(true);
         ventanalicencia.setResizable(false);
         ventanalicencia.setLocationRelativeTo(null);
         this.setVisible(false);  /* "this" hace mencion de la ventana Bienvenida
                                      (donde estamos) y "setVisible false" hace que desaparezca
                                      dejando a "ventanalicencia" visible al final */
       }
     }
   }
public static void main(String args[]){
   Bienvenida ventanabienvenida = new Bienvenida();
   ventanabienvenida.setBounds(0,0,350,450);
   ventanabienvenida.setVisible(true);
   ventanabienvenida.setResizable(false);
   ventanabienvenida.setLocationRelativeTo(null);
  }
}
