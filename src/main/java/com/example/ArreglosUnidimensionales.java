package com.example;

public class ArreglosUnidimensionales {
    public static void declararCrearInicializar() {
        String[] peliculas = {"Inception", "Interstellar", "The Matrix", "Avengers", "Joker"};
        System.out.println("Arreglo creado con películas.");
    }

    public static void mostrarLongitud() {
        int[] numeros = {5, 10, 15, 20};
        System.out.println("Longitud del arreglo: " + numeros.length);
    }

    public static void recorrerConForClasico() {
        int[] numeros = {12, 3, 45, 7, 9, 2, 30, 15, 18, 1};

        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Número menor: " + menor);
    }

    public static void recorrerConForEach() {
        String[] peliculas = {"Inception", "Interstellar", "The Matrix", "Avengers", "Joker"};

        System.out.println("Mis 5 películas favoritas:");
        for (String p : peliculas) {
            System.out.println("- " + p);
        }
    }

    public static int[] arrayComoParametroYRetorno(int[] array) {
        // Retorno de un arreglo invertido
        int[] invertido = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }

        System.out.println("Arreglo invertido:");
        for (int x : invertido) {
            System.out.print(x + " ");
        }
        System.out.println();

        return invertido;
    }
}
