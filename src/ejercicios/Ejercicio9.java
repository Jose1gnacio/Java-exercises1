package ejercicios;

public class Ejercicio9 {
    public static void main(String[] args) {
        double click60 = 0.30;
        double click100 = 0.25;
        double click20 = 0.80;

        double total60 = 0.30 * 60;
        double total100 = 0.25 * 100;
        double total20 = 0.80 * 20;

        double totalClick = total60 + total100 + total20;
        double totalIva = totalClick * 1.16;

        System.out.println("Costo promedio por click es: " + totalIva / 180);




    }
}
