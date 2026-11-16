
import java.util.Scanner;
/**
 * Ejercicio 09: Ordenamiento de Tres Números: Dados tres números,
 * ordenarlos en orden ascendente.
 * @author Adrian Uchuari - Daniel Rios
 * @version 1.0
 */

public class Ejercicio09_OrdenamientodeTresNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tres numeros enteros:");
        System.out.print("Numero 1: ");
        int a = scanner.nextInt();

        System.out.print("Numero 2: ");
        int b = scanner.nextInt();

        System.out.print("Numero 3: ");
        int c = scanner.nextInt();

        int menor, medio, mayor;

        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                medio = b;
                mayor = c;
            } else {
                medio = c;
                mayor = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                medio = a;
                mayor = c;
            } else {
                medio = c;
                mayor = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                medio = a;
                mayor = b;
            } else {
                medio = b;
                mayor = a;
            }
        }

        System.out.println("Numeros ordenados de menor a mayor: " + menor + 
                ", " + medio + ", " + mayor);
    }
}
//*run:
//*Ingresa tres numeros enteros:
/**Numero 1: 531
Numero 2: 5423
Numero 3: 5641
Numeros ordenados de menor a mayor: 531, 5423, 5641
BUILD SUCCESSFUL (total time: 6 seconds)

