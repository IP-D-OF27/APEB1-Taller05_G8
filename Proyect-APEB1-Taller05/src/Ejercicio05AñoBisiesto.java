
/**
 * Ejercicio Año Bisiesto: Comprobar si un año ingresado es bisiesto o no.
 * Si es bisiesto, mostrar un mensaje especial.
 *
 * @author Adrian Uchuari-Daniel Rios
 * @version 1.0
 */
import java.util.Scanner;

public class Ejercicio05AñoBisiesto {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese año :");
        int anio = tcl.nextInt();

        if (anio % 4 == 0 && anio % 100 != 0 || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " Es Bisiesto ");
        } else {
            System.out.println("El año " + anio + "No es Bisisesto ");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese a�o :
2004
El a�o 2004 Es Bisiesto 
BUILD SUCCESSFUL (total time: 2 seconds)
 */