package ejercicios;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[] num1 = {13, 20, 12};
        int[] num2 = {20, 191, 11};
        int[] num3 = {11, 21, 14};
        System.out.println(hasTeen(num1[0], num1[1], num1[2]));
        System.out.println(hasTeen(num2[0], num2[1], num2[2]));
        System.out.println(hasTeen(num3[0], num3[1], num3[2]));

    }
    public static boolean hasTeen(int a, int b, int c) {
        return ((a>= 13 && a<=19) || (b>13 && b<=19) || (c>=13 && c<=19) );
    }
}
