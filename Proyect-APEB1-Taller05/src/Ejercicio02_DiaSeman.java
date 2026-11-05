
import java.util.Scanner;

/**
 * Ejercicio 01: "Texto del enunciado del ejercicio/problema...."
 *
 * @author NombreAutor
 * @version 1.0
 */
public class Ejercicio02_DiaSeman {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombreDia;
        System.out.println("deme numero de dias");
        int nurDias = tcl.nextInt();
        switch (nurDias) {
            case 1:
                nombreDia = "lunes";
                break;
            case 2:
                nombreDia = "martes";
                break;
            case 3:
                nombreDia = "miercoles";
                break;
            case 4:
                nombreDia = "jueves";
                break;
            case 5:
                nombreDia = "viernes";
                break;
            case 6:
                nombreDia = "sabado";
                break;
            case 7:
                nombreDia = "domingo";
                break;
            default:
                nombreDia = "error";
        }
        System.out.println("el numero del dia " + nurDias + " corresponde al "
                + nombreDia);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pdeme numero de dias
2
el numero del dia 2 corresponde al martes
 */
