package com.example;

public class VariablesYConstantes {
    public static void demostrarDeclaracionAsignacion() {
        int edad = 25;
        double estatura = 1.75;

        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
    }

    public static void demostrarConvencionesNombres() {
        int puntuacionMaximaJuego = 100;
        double promedioActual = 4.5;

        System.out.println("puntuacionMaximaJuego: " + puntuacionMaximaJuego);
        System.out.println("promedioActual: " + promedioActual);
    }

    public static void demostrarConstantes() {
        final double PI = 3.14159;

        System.out.println("PI: " + PI);

        // PI = 4.0; // Esto no compila porque PI es final.
        // En una constante final no se puede reasignar.
    }
}
