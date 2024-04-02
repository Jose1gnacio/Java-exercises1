package ejercicios;
/*
EJERCICIO RETO SUPER SAYAYÍN: Escribe un programa que para un número N,
imprima los números pares desde 1 hasta N, por ejemplo si N = 6, debe imprimir “2,
4, 6”. Hazlo con un for o un while. Si el número es menor o igual a 0, debes imprimir
“Inserta un número positivo”
TIP: Para saber si un número es par, debes obtener el residuo de ese número al ser
dividido entre 2, si el residuo es 0, entonces el número es par. Por ejemplo si quieres
saber si 4 es par, divides 4/2 = 2 y te sobran 0, entonces 4 es par, en cambio para
5/2 = 2 y sobra 1, entonces es impar, para obtener el residuo de una división en Java
puedes utilizar %, ejemplo: 4 % 2 = 0 y 5 % 2 = 1.
 */
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        boolean validacion = false;

        while (!validacion) {
            System.out.println("Ingresa un número entero positivo");
            if (numero.hasNextInt()){
                int num = numero.nextInt();
                if (num > 0){
                    int i;
                    for (i = 1; i <= num ; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                    validacion = true;
                } else {
                    System.out.println("Ingresa un numero mayor que 0");
                }

            } else {
                System.out.println("No has ingresado un número valido");
                numero.next();
            }
        }
        numero.close();
    }
}
