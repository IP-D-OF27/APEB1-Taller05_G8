
/**
 * Ejercicio 07:Rango de Notas: Asignar una letra (A, B, C, D) a
 * una calificación en función de su rango (A para 90-100, B para 80-89, etc.).
 *
 * @author Adrian Uchuari-Daniel Rios
 * @version 1.0
 */

import java.util.Scanner;

public class Ejercicio07_RangodeNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la calificacion (0 a 100): ");
        int nota = scanner.nextInt();

        char letra;

        if (nota >= 90 && nota <= 100) {
            letra = 'A';
        } else if (nota >= 80 && nota <= 89) {
            letra = 'B';
        } else if (nota >= 70 && nota <= 79) {
            letra = 'C';
        } else if (nota >= 60 && nota <= 69) {
            letra = 'D';
        } else if (nota >= 0 && nota < 60) {
            letra = 'F';
        } else {
            System.out.println("Error: La calificacion debe estar entre 0 y 100.");
            scanner.close();
            return;
        }

        System.out.println("La letra asignada es: " + letra);

        scanner.close();
    }
}
//*run:
/**Ingresa la calificacion (0 a 100): 84
La letra asignada es: B
BUILD SUCCESSFUL (total time: 2 seconds)
