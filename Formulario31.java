import javax.swing.*;

public class Formulario31 extends JFrame{

 private JTextField textfield1;
 private JScrollPane scrollpane1;
 private JTextArea textarea1;

 public Formulario31(){
  setLayout(null);
  textfield1 = new JTextField();
  textfield1.setBounds(10,10,200,30);
  add(textfield1);

  textarea1 = new JTextArea();
  scrollpane1 = new JScrollPane(textarea1); /**Esto hace que textarea1 tenga scroll **/
  scrollpane1.setBounds(10,50,400,300);
  add(scrollpane1);
 }

public static void main(String args[]){
 Formulario31 formulario31 = new Formulario31();
 formulario31.setBounds(0,0,540,400);
 formulario31.setVisible(true);
 formulario31.setResizable(false);
 formulario31.setLocationRelativeTo(null);
 }

}
