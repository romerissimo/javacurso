import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

  private JLabel label1, label2;
  private JCheckBox check1;
  private JButton boton1, boton2;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  /* curso java 46 - Declaramos la variable String: nombre, aqui se va a alojar el contenido de la
  variable texto que esta en la clase Bienvenida.java. Ver la linea 23 */
  String nombre = "";

/* Creamos el constructor */
  public Licencia(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE); /* Curso Java 48 - Para que el programa al cerrar
                                             la ventana no se quede en daemon y devuelva el
                                             prompt del sistema en el simbolo del sistema */
    setTitle("Licencia de uso");
    /* Imagen icono pequeño que remplaza al icono de Java */
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
/* curso java 46 - A continuacion vamos a recuperar el valor de una variable que esta en
otra clase. Se crea un objeto con la clase que queremos "visitar": Bienvenida.java*/
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombre = ventanaBienvenida.texto;   /* asi se asigna el valor de texto de la clase
                                        Bienvenida a la variable nombre de esta clase. */

    label1 = new JLabel("TÉRMINOS Y CONDICIONES");
    label1.setBounds(215,5,200,30);
    label1.setFont(new Font("Andale Mono", 1, 14));
    label1.setForeground(new Color(0, 0, 0));
    add(label1);

    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setFont(new Font("Andale Mono", 0, 9));
    textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
"\n\n          A. PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACION DE M.S.R. SERVICE." +
"\n          B. PROHIBIDA LA ALTERACIÓN DELCPÓDIGO FUENTE O DISEÑÑO DE LAS INTERFACES GRÁFICAS." +
"\n          C. M.S.R. SERVICES NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
"\n\n          LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE." +
"\n          (LA GERENCIA DE M.S.R. SERVICES Y EL AUTOR) NO SE RESPONSABILIZAN POR EL USO QUE USTED" +
"\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TÉRMINOS HAGA CLICK EN (ACEPTO)." +
"\n          SI USTED NO ACEPTA ESTOT TÉRMINOS, HAGA CLICK EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
"\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" +
"\n          http://www.youtube.com/msrservices");
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(10,40,560,190); /* El textarea se acomoda a las coordenadas del scroll */
    add(scrollpane1);

    check1 = new JCheckBox("Yo " + nombre + " Acepto");  /* Agregamos el nombre que trajimos de la clase
                                                         Bienvenida al lado del Checkbox. De aqui ir a Los
                                                         eventos "Public void" linea 77 */
    check1.setBounds(10,250,300,30);
    check1.addChangeListener(this);
    add(check1);

    boton1 = new JButton("Continuar");
    boton1.setBounds(10,290,100,30);
    boton1.addActionListener(this);
    boton1.setEnabled(false);
    add(boton1);

    boton2 = new JButton("No Acepto");
    boton2.setBounds(120,290,100,30);
    boton2.addActionListener(this);
    boton2.setEnabled(true);
    add(boton2);

/* el logo de Coca Cola como label */
    ImageIcon imagen = new ImageIcon("images/coca-logo-trans.png");
    label2 = new JLabel(imagen);
    label2.setBounds(305,135,300,300);
    add(label2);
  }
/* Programamos evento para el checkbox */
/* curso java 46 - si esta seleccionado o no uno de los botones esta activo/inactivo */
public void stateChanged(ChangeEvent e){
  if(check1.isSelected() == true){
     boton1.setEnabled(true);
     boton2.setEnabled(false);
  } else {
     boton1.setEnabled(false);
     boton2.setEnabled(true);
  }
}
/* Programamos evento para los botones */
public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){    /* salta a la ventana Principal - curso java 46*/
     Principal ventanaPrincipal = new Principal();
     ventanaPrincipal.setBounds(0,0,640,535);
     ventanaPrincipal.setVisible(true);
     ventanaPrincipal.setResizable(false);
     ventanaPrincipal.setLocationRelativeTo(null);
     this.setVisible(false);   /* desaparece "esta", la ventana Licencia */
  } else if(e.getSource() == boton2){  /* vuelve la ventana Bienvenida - curso java 46 */
     Bienvenida ventanabienvenida = new Bienvenida();
     ventanabienvenida.setBounds(0,0,350,450);
     ventanabienvenida.setVisible(true);
     ventanabienvenida.setResizable(false);
     ventanabienvenida.setLocationRelativeTo(null);
     this.setVisible(false);   /* desaparece "esta", la ventana Licencia */
  }
}

/* El codigo principal main */
public static void main(String args[]){
  Licencia ventanalicencia = new Licencia();
  ventanalicencia.setBounds(0,0,600,370);
  ventanalicencia.setVisible(true);
  ventanalicencia.setResizable(false);
  ventanalicencia.setLocationRelativeTo(null);
 }
}
