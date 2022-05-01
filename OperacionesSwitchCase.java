import java.util.Scanner;
public class OperacionesSwitchCase{

public static void main(String args[]){

  Scanner entrada = new Scanner(System.in);
  int num_uno = 5, num_dos = 3, resultado = 0;
  int parametro = 2;

  System.out.println("*******************************************************");
  System.out.println("*            Ejercicio con switch / case              *");
  System.out.println("*******************************************************");
  System.out.println("");
  System.out.println("       1: suma | 2: multiplicacion | 3: division       ");
  System.out.println("");

  System.out.println("Ingrese el numero de operacion: ");
  parametro = entrada.nextInt();
  System.out.println("");

    switch(parametro){

    case 1: resultado = num_uno + num_dos;
            System.out.println("El resultado de la suma es: " + resultado);
            break;
    case 2: resultado = num_uno * num_dos;
            System.out.println("El resultado de la multiplicación es: " + resultado);
            break;
    case 3: resultado = num_uno / num_dos;
            System.out.println("El resultado de la division es: " + resultado);
            break;
    default: System.out.println("La opcion no existe");
            break;
    }
 }
}
