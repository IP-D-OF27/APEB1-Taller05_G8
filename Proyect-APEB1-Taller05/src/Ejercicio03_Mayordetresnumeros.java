/**
 * Ejercicio 01: Mayor de tres números: Dados tres números distintos,
 * determinar cuál es el mayor.
 * @author Adrian Uchuari-Daniel Rios
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio03_Mayordetresnumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese tres numeros :");
        int num1 = tcl.nextInt(), num2 = tcl.nextInt(), num3 = tcl.nextInt(), 
                mayor;
        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        System.out.println("El mayor es: " + mayor);
    }
}
/**
 * *
 * EVIDENCIA DEL RUN: run: Ingrese tres numeros :2 3 1 El mayor es: 3 BUILD
 * SUCCESSFUL (total time: 2 seconds)
 */