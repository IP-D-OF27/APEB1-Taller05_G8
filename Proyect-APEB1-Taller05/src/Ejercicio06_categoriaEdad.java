import java.util.Scanner;
/**
 * Ejercicio 06:Clasificar a una persona en una categoría de edad (niño, 
 * adolescente, adulto) en función de su edad.
 * @author Adrian Uchuari - Daniel Rios
 * @version 1.0
 */
public class Ejercicio06_categoriaEdad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese la edad: ");
        int edad = tcl.nextInt();
        if (edad <= 12)
            System.out.println("Su edad corresponde a un niño");
        if (edad > 12 && edad <= 25)
            System.out.println("Su edad corresponde a un adolecente");
        else
            System.out.println("Su edad corresponde a un adulto");
    }
}
/**
 * *
 * EVIDENCIA DEL RUN:run:
Deme edad:5
No elegible para votar 
BUILD SUCCESSFUL (total time: 2 seconds)
 */