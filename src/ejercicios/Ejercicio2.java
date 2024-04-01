package ejercicios;
/*
Given an int n, return true if it is within 10 of 100 or 200.
Note: Math.abs(num) computes the absolute value of a number.
 */

public class Ejercicio2 {
    public static void main(String[] args) {

        int num1 = 111;
        int num2 = 104;
        System.out.println(nearHundred(num1)); // Output: true
        System.out.println(nearHundred(num2)); // Output: true
    }

    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }
}
