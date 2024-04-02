package ejercicios;
import java.util.Scanner;
/*
Crea un programa que te pida una cantidad en miligramos para un jugo,
el valor debe ser de tipo entero, si el valor es mayor a 100 imprime
“¡Felicidades, es una buena poción!”, de lo contrario imprime “La poción es
mediocre, sangre sucia inmunda”.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Ingresa la cantidad en miligramos para tu jugo");

            if (scanner.hasNextInt()) {
                int miligramos = scanner.nextInt();
                if (miligramos > 100) {
                    System.out.println("Felicidades, es una buena opción");
                } else {
                    System.out.println("No es una buena cantidad");
                }
                entradaValida = true;
            } else {
                System.out.println("Por favor ingresa un número entero.");
                scanner.next();
            }
        }
        scanner.close();
    }
}
