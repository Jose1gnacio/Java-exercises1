package ejercicios;
/*
Para un Arreglo de String de títulos de películas, imprime el título de la película con
el título más largo. Por ejemplo si tenemos un arreglo con los valores:
{“Jumanji”, “Toy Story”, “Pulp Fiction”, “Batman: El caballero de la noche”, “Kill Bill”}
Debería imprimir “Batman: El caballero de la noche”.
RETO OPCIONAL : Imprime el índice del título más largo, para el ejemplo anterior,
debería imprimir el 3, porque es el índice de “Batman: El caballero de la noche”
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        String[] peliculas = {
                "Jumanji",
                "Toy Story",
                "Pulp Fiction",
                "Batman: El caballero de la noche",
                "Kill Bill"
        };
        int i;
        for (i = 0; i < peliculas.length-1; i++) {
            if (peliculas[i].length() > peliculas[i + 1].length()) {
                System.out.println("La pelicula mas larga es: " + peliculas[i] + " en la posicion: " + i);
            }
        }
    }
}
