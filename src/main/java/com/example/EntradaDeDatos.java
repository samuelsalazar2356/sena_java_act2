package com.example;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void leerVariosTipos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String texto = sc.nextLine();

        System.out.print("Escribe un número decimal: ");
        double numeroDecimal = sc.nextDouble();

        System.out.println("Texto: " + texto);
        System.out.println("Número decimal: " + numeroDecimal);

        sc.close();
    }

    public static void manejarSaltoDeLineaPendiente() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número entero: ");
        int numero = sc.nextInt();

        // Consumimos el salto de línea pendiente
        sc.nextLine();

        System.out.print("Ahora escribe un texto: ");
        String texto = sc.nextLine();

        System.out.println("Número: " + numero);
        System.out.println("Texto: " + texto);

        sc.close();
    }
}
