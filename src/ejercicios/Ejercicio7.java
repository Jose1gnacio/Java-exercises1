package ejercicios;
/*
Supongamos que un cubo rectangular tiene las dimensiones: largo=15, ancho=23,
alto=12. Obtén su volumen.
 */
public class Ejercicio7 {
    public static int volRectangulo (int a, int b, int c){
        return a * b * c;
    }

    public static void main(String[] args) {
        int largo = 15;
        int ancho = 23;
        int alto = 12;
        System.out.println("el volumen del rectangulo es " + volRectangulo(largo, ancho, alto));
        System.out.printf("el volumen del rectangulo es %d", volRectangulo(largo, ancho, alto));
    }
}
