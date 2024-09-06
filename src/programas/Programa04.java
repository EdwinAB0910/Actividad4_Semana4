package programas;
import java.util.Scanner;
public class Programa04 {
    public static void main(String[] args) {
    //declarar variables
    int num1;
    String periodoa;
    Scanner lectura=new Scanner(System.in);
    //ingreso de datos
    System.out.print("Ingrese un número [1,2,3,4,6,12]: ");
    num1=lectura.nextInt();
    //proceso de datos
        switch (num1) {
            case 1:
                periodoa="Mensual";             
                break;
            case 2:
                periodoa="Bimestral";             
                break;
            case 3:
                periodoa="Trimestral";             
                break;
            case 4:
                periodoa="Cuatrimestral";             
                break;
            case 6:
                periodoa="Semestral";             
                break;
            case 12:
                periodoa="Anual";             
                break;
            default:
                periodoa="Solo números [1,2,3,4,6,12]";
        }
        //salida de datos
        System.out.println("El periodo anual correspondiente es: " +periodoa);
    }
}
