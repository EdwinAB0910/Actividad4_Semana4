package programas;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args) {
    //declarar variables
    String ingles;
    int num1;
    Scanner lectura=new Scanner(System.in);
    //ingreso de datos
    System.out.print("Ingresar un número [1-6]: ");
    num1=lectura.nextInt();
    //proceso de datos
        switch (num1) {
            case 1:
                ingles="One";              
                break;
            case 2:
                ingles="Two";              
                break;
            case 3:
                ingles="Three";              
                break;
            case 4:
                ingles="Four";              
                break;
            case 5:
                ingles="Five";              
                break;
            case 6:
                ingles="Six";              
                break;
            default:
                ingles="Solo números [1-6] ";
                break;
        }
        //salida de datos
        System.out.println("Traducido al inglés es: " +ingles);
    }
}
