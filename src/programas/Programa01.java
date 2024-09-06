package programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
    //declarar variables
    int num1;
    String palabra;
    Scanner lectura=new Scanner(System.in);
    //ingreso de datos
    System.out.print("Ingresar un número [1-5]: ");
    num1=lectura.nextInt();
    //proceso de datos
        switch (num1) {
            case 1:
                palabra="Uno";                
                break;
            case 2:
                palabra="Dos";                
                break;
            case 3:
                palabra="Tres";                
                break;
            case 4:
                palabra="Cuatro";                
                break;
            case 5:
                palabra="Cinco";                
                break;
            default:
                palabra="Solo números [1-5]";
                break;
        }
        //salida de datos
        System.out.println ( palabra);
    }
}
