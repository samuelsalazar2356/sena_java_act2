package com.example;

public class EstructurasDeRepeticion {
    public static void ejemploWhile() {
        int contador = 10;
        while (contador >= 1) {
            System.out.println(contador);
            contador--;
        }
    }

    public static void ejemploDoWhile() {
        // Sin depender de entrada del usuario, usamos un arreglo de ejemplo.
        int[] intentos = {3, 7, 0};
        int i = 0;
        int numero;

        do {
            numero = intentos[i];
            System.out.println("Número leído: " + numero);
            i++;
        } while (numero != 0);

        System.out.println("Se ingresó 0, termina el do-while.");
    }

    public static void ejemploForClasico() {
        int base = 5;
        for (int i = 1; i <= 3; i++) {
            int resultado = base * i;
            System.out.println(base + " x " + i + " = " + resultado);
        }
    }

    public static void ejemploForAnidado() {
        // Tabla de multiplicar completa (por ejemplo del 1 al 5)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

    public static void ejemploBreakContinue() {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break; // saltamos el resto cuando llega al 7
            }
            System.out.println("i: " + i);
        }
    }

    public static void ejemploEtiquetas() {
        // Ejemplo básico con etiqueta (solo demostrativo)
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };

        buscar:
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                if (matriz[fila][col] == 5) {
                    System.out.println("Encontrado 5 en fila=" + fila + ", col=" + col);
                    break buscar;
                }
            }
        }
    }
}
