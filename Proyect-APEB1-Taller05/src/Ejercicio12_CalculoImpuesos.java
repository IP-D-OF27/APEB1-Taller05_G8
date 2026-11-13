import java.util.Scanner;
/**
 * Ejercicio 10: Desarrollar una solución que permita leer los datos de un
 * automóvil (marca, origen y costo) imprima el impuesto por pagar y el precio
 * de venta (incluido el impuesto). Si el origen es Alemania el impuesto es 20%
 * si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%
 * @author Adrian Uchuari - Daniel Rios
 * @version 1.0
 */
public class Ejercicio12_CalculoImpuesos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double impuesto = 0.08;
        System.out.print("Ingrese la marca y el origen del automovil: ");
        String marca = tcl.nextLine(), origen = tcl.nextLine();
        System.out.print("Ingrese el costo del automovil: ");
        double costo = tcl.nextDouble();
        if (origen.equalsIgnoreCase("Alemania"))
            impuesto = 0.20;
        if (origen.equalsIgnoreCase("Japon"))
            impuesto = 0.30;
        if (origen.equalsIgnoreCase("Italia"))
            impuesto = 0.15;
        impuesto *= costo;
        costo += impuesto;
        System.out.printf("El impuesto del automovil marca %s es de $%.2f por "
                + "lo que el costo total es de $%.2f.%n", marca, impuesto, 
                costo);
    }
}
/**
 * *
 * EVIDENCIA DEL RUN:run-single:
Ingrese la marca y el origen del automovil: bugatti
alemania
Ingrese el costo del automovil: 8000000
El impuesto del automovil marca bugatti es de $1600000,00 por lo que el costo 
total es de $9600000,00.
BUILD SUCCESSFUL (total time: 18 seconds)
 */