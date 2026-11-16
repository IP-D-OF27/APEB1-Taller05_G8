
import java.util.Scanner;

/**
 * Ejercicio 11: Pedidos online: Desarrollar una solución que imprima el costo
 * de un pedido de un artículo del cual se tiene la descripción, la cantidad que
 * se requiere y el precio unitario. Si la cantidad pedida excede de 50
 * unidades, se hace un descuento de 15%. ordenarlos en orden ascendente.
 *
 * @author Adrian Uchuari - Daniel Rios
 * @version 1.0
 */
public class Ejercicio11_PedidosOnline {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la descripcion del articulo: ");
        String descripcion = scanner.nextLine();

        System.out.print("Ingresa la cantidad requerida: ");
        int cantidad = scanner.nextInt();

        System.out.print("Ingresa el precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        double subtotal = cantidad * precioUnitario;
        double totalPagar;
        double descuento = 0;

       
        if (cantidad > 50) {
            descuento = subtotal * 0.15;
            totalPagar = subtotal - descuento;
        } else {
            totalPagar = subtotal;
        }

        System.out.println("\n--- RESUMEN DEL PEDIDO ---");
        System.out.println("Articulo: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Subtotal: $" + subtotal);

        if (cantidad > 50) {
            System.out.println("Descuento aplicado (15%): -$" + descuento);
        }

        System.out.println("Total a pagar: $" + totalPagar);
    }
}

/**
 * *
 * EVIDENCIA DEL RUN:run:
Ingresa la descripcion del articulo: Zapatos
Ingresa la cantidad requerida: 89
Ingresa el precio unitario: 36

--- RESUMEN DEL PEDIDO ---
Articulo: Zapatos
Cantidad: 89
Precio unitario: $36.0
Subtotal: $3204.0
Descuento aplicado (15%): -$480.59999999999997
Total a pagar: $2723.4
BUILD SUCCESSFUL (total time: 10 seconds)

 */
