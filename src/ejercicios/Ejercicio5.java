package ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        String word1 = "hint";
        String word2 = "hi hello";
        String word3 = "byehi";
        System.out.println(startHi(word1));
        System.out.println(startHi(word2));
        System.out.println(startHi(word3));

    }
    public static boolean startHi (String str) {
        return str.startsWith("hi");
    }
}
