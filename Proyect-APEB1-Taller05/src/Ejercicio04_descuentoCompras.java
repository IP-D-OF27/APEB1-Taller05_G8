
import java.util.Scanner;
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
