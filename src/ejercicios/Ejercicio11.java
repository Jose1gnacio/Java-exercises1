package ejercicios;

import java.util.Objects;
import java.util.Scanner;


/*
Escribe un programa que te diga si un carro de Uber puede iniciar su recorrido, para
esto se necesitan dos cosas, que el conductor esté cerca y que esté disponible, el
programa te pedirá dos valores, la distancia del conductor en kilómetros y su
disponibilidad, donde false = no disponible y true = disponible, según los datos que
insertes imprime lo siguiente:
➢ Si la distancia es menor o igual a 0.5 km y el conductor está disponible,
imprime “Listo para iniciar recorrido”
➢ Si la distancia es menor o igual a 0.5 km y el conductor NO está disponible,
imprime, “Conductor cercano, pero no disponible”
➢ Si la distancia es mayor a 0.5 km y el conductor está disponible, imprime,
“Conductor disponible pero muy lejos, aplicarán tarifas más altas”
➢ Si la distancia es mayor a 0.5 km y el conductor NO está disponible, imprime,
“No hay conductores disponibles”
➢ Usa if-else para esto
➢ Para negar una validación debes usar el símbolo !, por ejemplo if
(!isAvailable)
➢ No olvides imprimir las instrucciones antes de pedir las variables de entrada
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner inKilometros = new Scanner(System.in);
        Scanner inDisponibilidad = new Scanner(System.in);
        boolean km = false;
        boolean disp = false;
        String disponibilidad = null;
        int kilometros = 0;

        while (!km) {
            System.out.print("Introduce distancia en kilómetros:");
            if (inKilometros.hasNextInt()) {
                kilometros = inKilometros.nextInt();
                km = true;

            } else {
                System.out.println("Por favor introduce número valido");
                inKilometros.next();
            }
        }
        while (!disp) {
            System.out.println("Esta disponible (Si/No):?");
            String input = inDisponibilidad.nextLine().trim().toLowerCase();
            if (input.equals("si") || input.equals("no")) {
                disponibilidad = input;
                disp = true;
            } else {
                System.out.println("Ingresa Si o No");
                //inDisponibilidad.next();  por que aqui produce error y en el otro no produce nada
            }
        }
        inKilometros.close();
        inDisponibilidad.close();
        if (Objects.equals(disponibilidad, "si")) {
            if (kilometros <= 0.5) {
                System.out.println("Listo para iniciar recorrido");
            } else {
                System.out.println("Conductor disponible, pero muy lejor, aplicarán tarifas más altas");
            }
        } else {
            if (kilometros <= 0.5) {
                System.out.println("Conductor cercano, pero no disponible");
            } else {
                System.out.println("No hay conductores disponibles");
            }
        }


    }
}
