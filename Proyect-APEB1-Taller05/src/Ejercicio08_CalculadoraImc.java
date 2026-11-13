import java.util.Scanner;
/**
 * Ejercicio 08: Calcular el índice de masa corporal (IMC) de una persona y 
 * clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, 
 * etc.).
 * @author Adrian Uchuari - Daniel Rios
 * @version 1.0
 */
public class Ejercicio08_CalculadoraImc {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String mensaje = "";
        System.out.print("Ingrese su peso en kg y su estatura en metros: ");
        double peso = tcl.nextDouble(), estatura = tcl.nextDouble();
        double imc = peso / Math.pow(estatura,2);
        if (imc < 18.5)
            mensaje = "Usted tiene bajo peso debido a que su IMC es de ";
        if (imc >= 18.5 && imc <= 24.9)
            mensaje = "Usted esta en su peso ideal, su IMC es de ";
        if (imc >= 25 && imc <= 29.9)
            mensaje = "Usted tiene sobrepeso debido a que su IMC es de ";
        else 
            mensaje = "Usted tiene obesidad debido a que su IMC es de ";
        System.out.printf("%s%.2f kg/m²%n",mensaje, imc);
    }
}
/**
 * *
 * EVIDENCIA DEL RUN:run-single:
Ingrese su peso en kg y su estatura en metros: 77 1,65
Usted tiene sobrepeso debido a que su IMC es de 28,28 kg/m²
BUILD SUCCESSFUL (total time: 9 seconds)
 */