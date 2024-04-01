package ejercicios;
/*
Obtén la energía cinética si la masa es m = 12 kg y la velocidad es v = 3 m/s,
imprime el resultado con solo 2 decimales,
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        int m = 12;
        int v = 3;

        System.out.println("La energía cinética es " + (m * v * v) / 2);
    }
}
