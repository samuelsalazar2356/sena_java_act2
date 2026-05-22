package com.example;

public class ArreglosBidimensionales {
    public static void declararCrearMatrices() {
        int[][] matriz = new int[3][3];

        // Llenamos con valores de ejemplo
        int contador = 1;
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                matriz[fila][col] = contador;
                contador++;
            }
        }

        System.out.println("Matriz 3x3 creada (valores 1..9):");
        imprimir(matriz);
    }

    public static void recorrerMatriz() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sumaTotal = 0;
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                sumaTotal += matriz[fila][col];
            }
        }

        System.out.println("Suma total de la matriz 3x3: " + sumaTotal);
    }

    public static void ejemploUsosTipicos() {
        // Un ejemplo extra: mostrar coordenadas y valores
        int[][] tabla = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println("Recorrido típico (fila, col, valor):");
        for (int fila = 0; fila < tabla.length; fila++) {
            for (int col = 0; col < tabla[fila].length; col++) {
                System.out.println("fila=" + fila + ", col=" + col + ", valor=" + tabla[fila][col]);
            }
        }
    }

    private static void imprimir(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();
        }
    }
}
