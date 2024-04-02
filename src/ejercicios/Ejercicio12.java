package ejercicios;
/*
Haz un ciclo for y while que obtenga la sumatoria de los números hasta n, ejemplo,
para 5 debes obtener 15 (1+2+3+4+5), para 3 debes obtener 6. Imprime el resultado
así: “La suma es 15” usando formatos de String
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        boolean validacion = false;
        int suma = 0;
        while (!validacion) {
            System.out.println("Ingresa un numero");
            if (numero.hasNextInt()) {
                int n = numero.nextInt();
                int i;
                for (i = 1; i <= n; i++) {
                    suma += i;
                }
                System.out.println("la suma de los " + n + " primeros numeros es: " + suma);
                validacion = true;
            } else {
                System.out.println("Ingresa un numero valido");
                numero.next();// aqui si funciona bien
            }
        }
        numero.close();

    }
}
