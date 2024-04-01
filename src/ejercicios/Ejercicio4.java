package ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {
        String word1 = "Nicole";
        String word2 = "Jose";
        System.out.println(backAround(word1));
        System.out.println(backAround(word2));

    }
    public static String backAround (String str) {
        return str.substring(str.length()-1) + str +  str.substring(str.length()-1);
    }
}

