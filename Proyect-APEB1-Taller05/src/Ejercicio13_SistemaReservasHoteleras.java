
import java.util.Scanner;

/**
 * Ejercicio 13: Sistema de reservas hoteleras: En una hostería de la ciudad de
 * Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, del
 * 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días.
 * Elaborar una solución que pida el número de días y el precio diario de la
 * habitación y luego calcule e imprima el subtotal por pagar, el descuento y el
 * total por pagar.
 *
 * @author Adrian Uchuari - Daniel Rios
 * @version 1.0
 */
public class Ejercicio13_SistemaReservasHoteleras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el numero de dias de hospedaje: ");
        int dias = scanner.nextInt();

        System.out.print("Ingresa el precio diario de la habitacion: ");
        double precioDiario = scanner.nextDouble();

        double subtotal = dias * precioDiario;
        double porcentajeDescuento = 0;

        if (dias > 15) {
            porcentajeDescuento = 0.20;
        } else if (dias > 10) {
            porcentajeDescuento = 0.15;
        } else if (dias > 5) {
            porcentajeDescuento = 0.10;
        } else {
            porcentajeDescuento = 0.00;
        }

        double descuento = subtotal * porcentajeDescuento;
        double totalPagar = subtotal - descuento;

        System.out.println("\n--- RESUMEN DE LA RESERVA ---");
        System.out.println("Dias de hospedaje: " + dias);
        System.out.println("Precio diario: $" + precioDiario);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento aplicado (" + (int) (porcentajeDescuento * 100) + "%): -$" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);
    }
}
/**
 * *
 * EVIDENCIA DEL RUN: run: Ingresa el numero de dias de hospedaje: 12 Ingresa el
 * precio diario de la habitacion: 25
 *
 * --- RESUMEN DE LA RESERVA --- Dias de hospedaje: 12 Precio diario: $25.0
 * Subtotal: $300.0 Descuento aplicado (15%): -$45.0 Total a pagar: $255.0 BUILD
 * SUCCESSFUL (total time: 3 seconds)
 *
 */
