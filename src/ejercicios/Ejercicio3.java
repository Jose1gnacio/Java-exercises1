package ejercicios;
/*
Given a non-empty string and an int n, return a new string where the char at index n
has been removed. The value of n will be a valid index of a char in the
original string (i.e. n will be in the range 0..str.length()-1 inclusive).
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String word1 = "Nicole";
        int num1 = 1;
        String word2 = "Jose";
        int num2 = 2;
        System.out.println(missingChar(word1, num1));
        System.out.println(missingChar(word2,num2));
    }
    public static String missingChar (String str, int n){
        return str.substring(0, n) + str.substring(n + 1);
    }
}
