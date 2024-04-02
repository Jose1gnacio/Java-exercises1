package ejercicios;
/*
Escribe un programa que imprima “¿Cómo es el clima de hoy?”, dependiendo del
número que insertes te imprima los siguientes valores
➢ 1 = “Soleado”
➢ 2 = “Nublado”
➢ 3 = “Lluvioso”
➢ 4 = “Tormentoso”
➢ 5 = “Nevado”
Si insertas cualquier otro valor debe imprimir “Pregúntale a Google”
Recomendación: Usa Switch.
 */
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        boolean validacion = false;

        while(!validacion) {
            System.out.println("Ingresa un número:");
            if (numero.hasNextInt()) {
                int num = numero.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Soleado");
                        break;
                    case 2:
                        System.out.println("Nublado");
                        break;
                    case 3:
                        System.out.println("Lluvioso");
                        break;
                    case 4:
                        System.out.println("Tormentoso");
                        break;
                    case 5:
                        System.out.println("Nevado");
                        break;
                    default:
                        System.out.println("Pregúntale a Google");
                        break;
                }
                validacion = true;
            } else {
                System.out.println("Ingresa un número valido");
                numero.next();//  si no lo coloco, falla y se repite
            }
        }
        numero.close();
    }
}
