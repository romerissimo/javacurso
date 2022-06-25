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

/* Creamos el constructor */
  public Licencia(){
    setLayout(null);
    setTitle("Licencia de uso");
    /* Imagen icono pequeño que remplaza al icono de Java */
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

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
    scrollpane1.setBounds(10,40,580,190); /* El textarea se acomoda a las coordenadas del scroll */
    add(scrollpane1);

    check1 = new JCheckBox("Yo Acepto");
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
    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    label2 = new JLabel(imagen);
    label2.setBounds(305,135,300,300);
    add(label2);
  }
/* Programamos evento para el checkbox */
public void stateChanged(ChangeEvent e){



}
/* Programamos evento para los botones */
public void actionPerformed(ActionEvent e){


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
