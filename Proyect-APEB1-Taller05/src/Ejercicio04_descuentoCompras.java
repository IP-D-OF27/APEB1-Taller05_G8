
import java.util.Scanner;
/**
 * Ejercicio 01: Día de la semana: Calcular el precio final de un producto con 
 * un descuento del 10% si el precio original es mayor de $100; de lo contrario,
 * no hay descuento.
 * @author Daniel Rios - Adrian Huchuari
 * @version 1.0
 */
public class Ejercicio04_descuentoCompras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double descuento = 1;
        System.out.print("Ingrese el precio: ");
        int precio = tcl.nextInt();
        if (precio > 100)
            descuento = 0.9;
        precio *= descuento;
        System.out.println("el total es: " + precio);
    }
}
/***
 * EVIDENCIA DEL RUN:
 *run-single:
Ingrese el precio: 1000
el total es: 900
 */