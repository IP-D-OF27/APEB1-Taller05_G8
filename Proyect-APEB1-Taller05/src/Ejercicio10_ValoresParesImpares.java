import java.util.Scanner;
/**
 * Ejercicio 10: Dado un valor entero ingresado por teclado (positivo o 
 * negativo), determinar si se trata de un valor par o impar.
 * @author Adrian Uchuari - Daniel Rios
 * @version 1.0
 */
public class Ejercicio10_ValoresParesImpares {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = tcl.nextInt();
        if (num %2 == 0)
            System.out.println("El número " + num + " es par");
        else
            System.out.println("El número " + num + " es impar");
    }
}
/**
 * *
 * EVIDENCIA DEL RUN:run-single:
Ingrese un número: -24
El número -24 es par
BUILD SUCCESSFUL (total time: 5 seconds)
 */