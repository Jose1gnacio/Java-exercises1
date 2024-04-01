package ejercicios;

/*
Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        int n = 23;
        if (n > 21) {
            System.out.println(2 * (n - 21));
        } else {
            System.out.println(21 - n);
        }
    }
}
