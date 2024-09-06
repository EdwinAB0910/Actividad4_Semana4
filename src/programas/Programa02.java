package programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
    //declarar variables
    String romano;
    int num1;
    Scanner lectura=new Scanner(System.in);
    //ingreso de datos
    System.out.print("Ingresar un número [1-10]: ");
    num1=lectura.nextInt();
    //proceso de datos
        switch (num1) {
            case 1:
                romano="I";
                break;
            case 2:
                romano="II";
                break;
            case 3:
                romano="III";
                break;
            case 4:
                romano="IV";
                break;
            case 5:
                romano="V";
                break;
            case 6:
                romano="VI";
                break;
            case 7:
                romano="VII";
                break;
            case 8:
                romano="VIII";
                break;
            case 9:
                romano="IX";
                break;
            case 10:
                romano="X";
                break;
            default:
                romano="Solo números [1-10]";
                break;
        }
        //salida de datos
        System.out.println("El número romano correspondiente es: " +romano );
    }
}
