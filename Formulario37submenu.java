import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario37submenu extends JFrame implements ActionListener{

    private JMenuBar menubar;
    private JMenu menu1, menu2, menu3;
    private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4;

    public Formulario37submenu(){
      setLayout(null);
      menubar = new JMenuBar();
      setJMenuBar(menubar);  /* Para que se nuestre la barra de menu pero vacía */

      menu1 = new JMenu("Opciones");
      menubar.add(menu1);   /* Agregamos la pestaña de menu "Opciones" */

      menu2 = new JMenu("Tamaño de la ventana");
      menu1.add(menu2);    /* Agregamos la opcion a la pestaña de menu */

      menu3 = new JMenu("Color de fondo");
      menu1.add(menu3);   /* Agregamos la segunda opcion a la pestaña de nemu */

      menuitem1 = new JMenuItem("300x200");
      menu2.add(menuitem1);
      menuitem1.addActionListener(this); /* aqui se asocia un evento al item */

      menuitem2 = new JMenuItem("640x480");
      menu2.add(menuitem2);
      menuitem2.addActionListener(this); /* se asocia un avento al item */

      menuitem3 = new JMenuItem("Rojo");
      menu3.add(menuitem3);
      menuitem3.addActionListener(this);  /* se asocia un evento al item */

      menuitem4 = new JMenuItem("Verde");
      menu3.add(menuitem4);
      menuitem4.addActionListener(this);  /* se asocia un evento al item */
    }

    public void actionPerformed(ActionEvent e){
      if(e.getSource() == menuitem1){
        setSize(300,200);  /* La ventana queda igual por que esta es su medida original */
      }
      if(e.getSource() == menuitem2){
        setSize(640,480);
      }
      if(e.getSource() == menuitem3){
        getContentPane().setBackground(new Color(255,0,0));
      }
      if(e.getSource() == menuitem4){
        getContentPane().setBackground(new Color(0,255,0));
      }
    }

    public static void main(String args[]){
     Formulario37submenu formulario1 = new Formulario37submenu();
     formulario1.setBounds(0,0,300,200);
     formulario1.setVisible(true);
     formulario1.setResizable(false);
     formulario1.setLocationRelativeTo(null);
    }
}
