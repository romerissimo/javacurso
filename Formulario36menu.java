import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario36menu extends JFrame implements ActionListener{

 private JMenuBar menubar;  /* Es la barra de menu */
 private JMenu menu1;       /* Es la pestaña de menu */
 private JMenuItem menuitem1, menuitem2, menuitem3;  /* los items de la pestaña de menu */

 public Formulario36menu(){
  setLayout(null);
  menubar = new JMenuBar();
  setJMenuBar(menubar);

  menu1 = new JMenu("Opciones");  /* Pestaña desplegable de menu Opciones */
  menubar.add(menu1);

  menuitem1 = new JMenuItem("Rojo");
  menuitem1.addActionListener(this);
  menu1.add(menuitem1);   /* Esto agrega el item al menu */

  menuitem2 = new JMenuItem("Verde");
  menuitem2.addActionListener(this);
  menu1.add(menuitem2);

  menuitem3 = new JMenuItem("Azul");
  menuitem3.addActionListener(this);
  menu1.add(menuitem3);
 }

public void actionPerformed(ActionEvent e){
  Container fondo = this.getContentPane();

  if(e.getSource() == menuitem1){
     fondo.setBackground(new Color(255,0,0));
    }
  if(e.getSource() == menuitem2){
     fondo.setBackground(new Color(0,255,0));
    }
  if(e.getSource() == menuitem3){
     fondo.setBackground(new Color(0,0,255));
    }
  }

public static void main(String args[]){
 Formulario36menu formulario1 = new Formulario36menu();
 formulario1.setBounds(0,0,400,300);
 formulario1.setVisible(true);
 formulario1.setVisible(true);
 formulario1.setLocationRelativeTo(null);
 }

}
