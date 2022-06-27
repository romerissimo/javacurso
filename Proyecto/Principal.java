import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

  private JMenuBar mb;
  private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
  private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
  private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno, labelAMaterno,
                 labelDepartamento, labelAntiguedad, labelResultado, labelfooter;
  private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;
  private JComboBox comboDepartamento, comboAntiguedad;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  String nombreAdministrador;   /* curso java 47 - Recuperar el nombre del usuario
                                   que es el que calcula las vacciones de los demas */

/* Crear el constructor */
  public Principal(){
    setLayout(null);
    setTitle("Pantalla principal");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombreAdministrador = ventanaBienvenida.texto; /* curso java 47 - se llama el valor default:
                                                     texto de la clase Birnvenida.java y se coloca
                                                     en la variable nombreAdministrador de esta clase */
/*Agregar barra de menu mb */
    mb = new JMenuBar();
    mb.setBackground(new Color(255,0,0));
    setJMenuBar(mb);

    menuOpciones = new JMenu("Opciones"); /* Menu Opciones */
    menuOpciones.setBackground(new Color(255,0,0));
    menuOpciones.setFont(new Font("Andale Momo", 1, 14));
    menuOpciones.setForeground(new Color(255,255,255));
    mb.add(menuOpciones);

    menuCalcular = new JMenu("Calcular"); /* Menu Calcular */
    menuCalcular.setBackground(new Color(255,0,0));
    menuCalcular.setFont(new Font("Andale Momo", 1, 14));
    menuCalcular.setForeground(new Color(255,255,255));
    mb.add(menuCalcular);

    menuAcercaDe = new JMenu("Acerca de"); /* Menu Acerca de */
    menuAcercaDe.setBackground(new Color(255,0,0));
    menuAcercaDe.setFont(new Font("Andale Momo", 1, 14));
    menuAcercaDe.setForeground(new Color(255,255,255));
    mb.add(menuAcercaDe);

/* Ahora se programa para que aparezcan las opciones de cada menu JMenu */
    menuColorFondo = new JMenu("Color de fondo");
    menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
    menuColorFondo.setForeground(new Color(255,0,0));
    menuOpciones.add(menuColorFondo);  /* para ser item del menu Opciones */

    miCalculo = new JMenuItem("Vacaciones");
    miCalculo.setFont(new Font("Andale Mono", 1, 14));
    miCalculo.setForeground(new Color(255,0,0));
    menuCalcular.add(miCalculo);
    miCalculo.addActionListener(this);

/* Los sub-items del item menucolorFondo para cambiar color de fondo */
    miRojo = new JMenuItem("Rojo");
    miRojo.setFont(new Font("Andale Mono", 1, 14));
    miRojo.setForeground(new Color(255,0,0));
    menuColorFondo.add(miRojo);
    miRojo.addActionListener(this);

    miNegro = new JMenuItem("Negro");
    miNegro.setFont(new Font("Andale Mono", 1, 14));
    miNegro.setForeground(new Color(255,0,0));
    menuColorFondo.add(miNegro);
    miNegro.addActionListener(this);

    miMorado = new JMenuItem("Morado");
    miMorado.setFont(new Font("Andale Mono", 1, 14));
    miMorado.setForeground(new Color(255,0,0));
    menuColorFondo.add(miMorado);
    miMorado.addActionListener(this);
/* Otros items */
    miNuevo = new JMenuItem("Nuevo");
    miNuevo.setFont(new Font("Andale Mono", 1, 14));
    miNuevo.setForeground(new Color(255,0,0));
    menuOpciones.add(miNuevo);
    miNuevo.addActionListener(this);

    miElCreador = new JMenuItem("El creador");
    miElCreador.setFont(new Font("Andale Mono", 1, 14));
    miElCreador.setForeground(new Color(255,0,0));
    menuAcercaDe.add(miElCreador);
    miElCreador.addActionListener(this);

    miSalir = new JMenuItem("Salir");
    miSalir.setFont(new Font("Andale Mono", 1, 14));
    miSalir.setForeground(new Color(255,0,0));
    menuOpciones.add(miSalir);
    miSalir.addActionListener(this);
/* Logo de la compañ+ia */
    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    labelLogo = new JLabel(imagen);
    labelLogo.setBounds(5,5,250,100);
    add(labelLogo);
/* Texto de bienvenida */
    labelBienvenido = new JLabel("Bienvenido " + nombreAdministrador); /* curso java 47 - se concatena
                                                                       el nombre con el mensaje Bienvenido */
    labelBienvenido.setBounds(280,30,300,50);
    labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
    labelBienvenido.setForeground(new Color(255,255,255));
    add(labelBienvenido);
/* Texto que explica de que trata el programa */
    labelTitle = new JLabel("Datos del trabajador para el calculo de vacaciones");
    labelTitle.setBounds(45,140,900,25);
    labelTitle.setFont(new Font("Andale Mono", 0,24));
    labelTitle.setForeground(new Color(255,255,255));
    add(labelTitle);

/* Labels que incluyen label y textfield, Textarea, combobox */
/* Para el Nomnre */
    labelNombre = new JLabel("Nombre completo");
    labelNombre.setBounds(25,188,180,25);
    labelNombre.setFont(new Font("Andale Mono", 1, 12));
    labelNombre.setForeground(new Color(255,255,255));
    add(labelNombre);

    txtNombreTrabajador = new JTextField();
    txtNombreTrabajador.setBounds(25,213,150,25);
    txtNombreTrabajador.setBackground(new java.awt.Color(224,224,224));
    txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
    txtNombreTrabajador.setForeground(new java.awt.Color(255,0,0));
    add(txtNombreTrabajador);
/* Para el apellido */
    labelAPaterno = new JLabel("Apellido Paterno");
    labelAPaterno.setBounds(25,248,180,25);
    labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
    labelAPaterno.setForeground(new Color(255,255,255));
    add(labelAPaterno);

    txtAPaternoTrabajador = new JTextField();
    txtAPaternoTrabajador.setBounds(25,273,150,25);
    txtAPaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
    txtAPaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
    txtAPaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
    add(txtAPaternoTrabajador);

/* Para el apellido materno */
    labelAMaterno = new JLabel("Apellido Materno");
    labelAMaterno.setBounds(25,308,180,25);
    labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
    labelAMaterno.setForeground(new Color(255,255,255));
    add(labelAMaterno);

    txtAMaternoTrabajador = new JTextField();
    txtAMaternoTrabajador.setBounds(25,334,150,25);
    txtAMaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
    txtAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
    txtAMaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
    add(txtAMaternoTrabajador);

/* Label y Combobox Box para Departamento */
    labelDepartamento = new JLabel("Selecciona el Departamento");
    labelDepartamento.setBounds(220,188,180,25);
    labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
    labelDepartamento.setForeground(new Color(255,255,255));
    add(labelDepartamento);

    comboDepartamento = new JComboBox();
    comboDepartamento.setBounds(220,213,220,25);
    comboDepartamento.setBackground(new java.awt.Color(224,224,224));
    comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
    comboDepartamento.setForeground(new java.awt.Color(255,0,0));
    add(comboDepartamento);
    comboDepartamento.addItem("");
    comboDepartamento.addItem("Atención al Cliente");
    comboDepartamento.addItem("Departamento de Logística");
    comboDepartamento.addItem("Departamento de Gerencia");
/* Label y combobox para antiguedad */
    labelAntiguedad = new JLabel("Selecciona la Antiguedad");
    labelAntiguedad.setBounds(220,248,180,25);
    labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
    labelAntiguedad.setForeground(new Color(255,255,255));
    add(labelAntiguedad);

    comboAntiguedad = new JComboBox();
    comboAntiguedad.setBounds(220,273,220,25);
    comboAntiguedad.setBackground(new java.awt.Color(224,224,224));
    comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
    comboAntiguedad.setForeground(new java.awt.Color(255,0,0));
    add(comboAntiguedad);
    comboAntiguedad.addItem("");
    comboAntiguedad.addItem("1 año de servicio");
    comboAntiguedad.addItem("2 a 6 años de servicio");
    comboAntiguedad.addItem("7 años o más de servicio");

/* Label y text area con scroll para el resultado */
    labelResultado = new JLabel("Resultado del cálculo");
    labelResultado.setBounds(220,307,180,25);
    labelResultado.setFont(new Font("Andale Mono", 1, 12));
    labelResultado.setForeground(new Color(255,255,255));
    add(labelResultado);
/* El area de texto con scroll */
    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setBackground(new Color(244,244,244));
    textarea1.setFont(new Font("Andale Mono", 1, 11));
    textarea1.setForeground(new Color(255,0,0));
    textarea1.setText("\n  Aqui aparece el resultado del calculo de las vacaciones.");
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(220,333,385,90);
    add(scrollpane1);

    labelfooter = new JLabel("2022 The Coca-Cola Company | Todos los derechos reservados");
    labelfooter.setBounds(135,445,500,30);
    labelfooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
    labelfooter.setForeground(new java.awt.Color(255,255,255));
    add(labelfooter);
    }

public void actionPerformed(ActionEvent e){
   if(e.getSource() == miCalculo){ /*curso java 47 - calculo de vacaciones */
     /* curso java 47 - guardamos los datos en variables: */
     String nombreTrabajador = txtNombreTrabajador.getText();
     String AP = txtAPaternoTrabajador.getText();
     String AM = txtAMaternoTrabajador.getText();
     String Departamento = comboDepartamento.getSelectedItem().toString();
     String Antiguedad = comboAntiguedad.getSelectedItem().toString();

     if(nombreTrabajador.equals("") || AP.equals("") || AM.equals("") ||
        Departamento.equals("") || Antiguedad.equals("")){
          JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
     } else{

         if(Departamento.equals("Atención al Cliente")){

            if(Antiguedad.equals("1 año de servicio")){
                textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                  "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                  "\n   recibe 6 dias de vacaciones");
            }
            if(Antiguedad.equals("2 a 6 años de servicio")){
                textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                  "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                  "\n   recibe 14 dias de vacaciones");
            }
            if(Antiguedad.equals("7 años o más de servicio")){
                textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                  "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                  "\n   recibe 20 dias de vacaciones");
            }
         }
         if(Departamento.equals("Departamento de Logística")){

            if(Antiguedad.equals("1 año de servicio")){
                textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                  "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                  "\n   recibe 7 dias de vacaciones");
            }
            if(Antiguedad.equals("2 a 6 años de servicio")){
                textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                  "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                  "\n   recibe 15 dias de vacaciones");
            }
            if(Antiguedad.equals("7 años o más de servicio")){
                textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                  "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                  "\n   recibe 22 dias de vacaciones");
            }
         }
         if(Departamento.equals("Departamento de Gerencia")){

            if(Antiguedad.equals("1 año de servicio")){
                textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                  "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                  "\n   recibe 10 dias de vacaciones");
            }
            if(Antiguedad.equals("2 a 6 años de servicio")){
                textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                  "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                  "\n   recibe 20 dias de vacaciones");
            }
            if(Antiguedad.equals("7 años o más de servicio")){
                textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                                  "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                  "\n   recibe 30 dias de vacaciones");
            }
         }
       }

   }
   if(e.getSource() == miRojo){
      getContentPane().setBackground(new Color(255,0,0));
   }
   if(e.getSource() == miNegro){
      getContentPane().setBackground(new Color(0,0,0));
   }
   if(e.getSource() == miMorado){
      getContentPane().setBackground(new Color(51,0,51));
   }
   if(e.getSource() == miNuevo){
      txtNombreTrabajador.setText("");
      txtAPaternoTrabajador.setText("");
      txtAMaternoTrabajador.setText("");
      comboDepartamento.setSelectedIndex(0);
      comboAntiguedad.setSelectedIndex(0);
      textarea1.setText("\n  Aqui aparece el resultado del calculo de las vacaciones.");
   }
   if(e.getSource() == miSalir){  /* Regresar a Bienvenida */
     Bienvenida ventanabienvenida = new Bienvenida();
     ventanabienvenida.setBounds(0,0,350,450);
     ventanabienvenida.setVisible(true);
     ventanabienvenida.setResizable(false);
     ventanabienvenida.setLocationRelativeTo(null);
     this.setVisible(false);
   }
   if(e.getSource() == miElCreador){
      JOptionPane.showMessageDialog(null,"Desarrollado por Martin Romero\n" +
                                         "   gracias a Ernesto Perez");
   }
}
/* Metodo main */
public static void main(String args[]){
   Principal ventanaPrincipal = new Principal();
   ventanaPrincipal.setBounds(0,0,640,535);
   ventanaPrincipal.setVisible(true);
   ventanaPrincipal.setResizable(false);
   ventanaPrincipal.setLocationRelativeTo(null);
  }
}
